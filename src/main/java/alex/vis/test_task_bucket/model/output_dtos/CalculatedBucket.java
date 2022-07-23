package alex.vis.test_task_bucket.model.output_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class CalculatedBucket {
    private List<PositionDto> positionDtos;

    private BigDecimal totalSum;

}
