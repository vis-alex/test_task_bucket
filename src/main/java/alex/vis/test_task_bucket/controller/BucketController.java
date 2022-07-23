package alex.vis.test_task_bucket.controller;

import alex.vis.test_task_bucket.model.Bucket;
import alex.vis.test_task_bucket.model.output_types.CalculatedBucket;
import alex.vis.test_task_bucket.service.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BucketController {

    private BucketService bucketService;

    @PostMapping(value = "/bucket/calculate_cost")
    CalculatedBucket calculateNewCost(@RequestBody Bucket bucket) {
        return bucketService.calculateBucketNewCost(bucket);
    }
}
