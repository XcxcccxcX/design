package com.chang.design.abstractFactory.old;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CacheServiceImplTest {

    @Test
    public void tbOrder() {
        CacheServiceImpl cacheService = new CacheServiceImpl();
        cacheService.set("key1", "value1", 1);
        cacheService.set("key2", "value2", 2);

        cacheService.get("key1", 1);
        cacheService.get("key2", 2);
        cacheService.get("key1", 3);
        cacheService.get("key2", 3);
    }

}