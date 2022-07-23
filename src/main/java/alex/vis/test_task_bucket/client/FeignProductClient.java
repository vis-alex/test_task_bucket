package alex.vis.test_task_bucket.client;

import alex.vis.test_task_bucket.model.Product;
import org.springframework.cloud.openfeign.FeignClient;

import java.math.BigDecimal;

@FeignClient(name = "clientName", url = "${client.url}")
public class FeignProductClient implements OpenProductClient{
    @Override
    public Product getProductById(Integer productId) {
        return new Product(1,  new BigDecimal(1));
    }
}
