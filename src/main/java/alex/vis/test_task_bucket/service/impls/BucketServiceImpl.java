package alex.vis.test_task_bucket.service.impls;

import alex.vis.test_task_bucket.client.OpenProductClient;
import alex.vis.test_task_bucket.model.Bucket;
import alex.vis.test_task_bucket.model.Product;
import alex.vis.test_task_bucket.model.output_dtos.CalculatedBucket;
import alex.vis.test_task_bucket.model.output_dtos.PositionDto;
import alex.vis.test_task_bucket.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {

    private final OpenProductClient productClient;

    @Autowired
    public BucketServiceImpl(OpenProductClient productClient) {
        this.productClient = productClient;
    }

    @Override
    public CalculatedBucket calculateBucketNewCost(Bucket bucket) {
        List<PositionDto> outputPositionDtos = new ArrayList<>();

        BigDecimal totalSum = bucket.getProductDtos().stream()
                .map(productDto -> {
                    BigDecimal price = getPriceByProductId(productDto.getProductId());

                    //Compute sum for position
                    BigDecimal positionSum = price.multiply(new BigDecimal(productDto.getAmount()));

                    //Add positionDto to result list
                    PositionDto positionDto = new PositionDto(productDto, positionSum);
                    outputPositionDtos.add(positionDto);
                    return positionDto;
                })
                //Compute total sum
                .map(PositionDto::getPositionSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return new CalculatedBucket(outputPositionDtos, totalSum);
    }

    //Get product and extract price from it
    private BigDecimal getPriceByProductId(int productId) {
        Product product = productClient.getProductById(productId);
        return product.getPrice();
    }
}
