package alex.vis.test_task_bucket.model.output_types;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductInfo {
    private int productId;

    private int amount;
}
