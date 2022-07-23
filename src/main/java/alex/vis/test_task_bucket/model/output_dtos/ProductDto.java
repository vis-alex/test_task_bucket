package alex.vis.test_task_bucket.model.output_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private int productId;

    private int amount;
}
