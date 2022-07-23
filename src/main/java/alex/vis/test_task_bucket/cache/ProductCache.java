package alex.vis.test_task_bucket.cache;

import alex.vis.test_task_bucket.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
@Data
public class ProductCache {
    private final Map<Integer, Product> cache;

    public ProductCache() {
        cache = new HashMap<>();
    }

    public void put(Integer productId, Product product) {
        cache.put(productId, product);
    }

    public Product getProductById(Integer productId) {
        return cache.get(productId);  }
}
