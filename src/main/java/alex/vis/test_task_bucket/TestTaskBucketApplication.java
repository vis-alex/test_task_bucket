package alex.vis.test_task_bucket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestTaskBucketApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskBucketApplication.class, args);
    }

}
