package alex.vis.test_task_bucket.model;

import alex.vis.test_task_bucket.model.output_dtos.ProductDto;
import lombok.Data;

import java.util.List;

@Data
public class Bucket {
    private List<ProductDto> productDtos;

    private final PaymentType paymentType;

    private Integer address_id;

    public Bucket(List<ProductDto> productDtos, PaymentType paymentType, int address_id) {
        this.productDtos = productDtos;
        this.paymentType = paymentType;
        this.address_id = address_id;
    }

    public Bucket(List<ProductDto> productDtos, PaymentType paymentType) {
        this.productDtos = productDtos;
        this.paymentType = paymentType;
    }
}
