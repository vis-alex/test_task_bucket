package alex.vis.test_task_bucket.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {
    private Integer productId;

    private BigDecimal price;
}
