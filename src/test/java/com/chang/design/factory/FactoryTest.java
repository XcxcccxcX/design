package com.chang.design.factory;

import com.chang.design.factory.store.ICommodity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.HashMap;

@SpringBootTest
public class FactoryTest {

    @Test
    public void sendCommodity() {
        StoreFactory storeFactory = new StoreFactory();
        ICommodity iCommodity = storeFactory.sendCommodity(1);
        HashMap<String, Object> extParam = new HashMap<>();
        extParam.put("address", "浙江省杭州市");
        iCommodity.sendCommodity("001", "123", extParam);

        ICommodity iCommodity2 = storeFactory.sendCommodity(2);
        HashMap<String, Object> extParam2 = new HashMap<>();
        extParam2.put("address", "北京市");
        iCommodity2.sendCommodity("1001", "1231", extParam2);

    }
}
