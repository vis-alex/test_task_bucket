package alex.vis.test_task_bucket.client;

import alex.vis.test_task_bucket.model.Product;

public interface OpenProductClient {
    Product getProductById(Integer productId);
}
