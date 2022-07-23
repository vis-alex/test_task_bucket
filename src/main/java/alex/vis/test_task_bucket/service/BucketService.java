package alex.vis.test_task_bucket.service;

import alex.vis.test_task_bucket.model.Bucket;
import alex.vis.test_task_bucket.model.output_types.CalculatedBucket;

public interface BucketService {

    CalculatedBucket calculateBucketNewCost(Bucket bucket);
}
