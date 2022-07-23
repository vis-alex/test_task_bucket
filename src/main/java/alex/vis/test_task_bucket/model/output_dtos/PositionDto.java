package alex.vis.test_task_bucket.model.output_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PositionDto {
    private ProductDto productDtos;

    private BigDecimal positionSum;
}
