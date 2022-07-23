package alex.vis.test_task_bucket.model.output_types;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class PositionInfo {
    private List<ProductInfo> productInfos;

    private BigDecimal positionSum;
}
