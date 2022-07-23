package alex.vis.test_task_bucket.model;

import alex.vis.test_task_bucket.model.output_types.ProductInfo;
import lombok.Data;

import java.util.List;

@Data
public class Bucket {
    private List<ProductInfo> productInfos;

    private final PaymentType paymentType;

    private Integer address_id;

    public Bucket(List<ProductInfo> productInfos, PaymentType paymentType, int address_id) {
        this.productInfos = productInfos;
        this.paymentType = paymentType;
        this.address_id = address_id;
    }

    public Bucket(List<ProductInfo> productInfos, PaymentType paymentType) {
        this.productInfos = productInfos;
        this.paymentType = paymentType;
    }
}
