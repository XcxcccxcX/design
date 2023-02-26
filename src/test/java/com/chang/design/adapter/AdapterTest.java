package com.chang.design.adapter;

import com.alibaba.fastjson.JSON;
import com.chang.design.adapter.order_source.TbOrder;
import com.chang.design.adapter.xn.XnOrder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class AdapterTest {

    @Test
    public void tbOrder() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ParseException {

        TbOrder tbOrder = new TbOrder();
        tbOrder.setTbUid("td111");
        tbOrder.setTbOrderTime(LocalDateTime.now());
        tbOrder.setTbProductName("java");
        tbOrder.setTbProductCount(1);
        // 超过int最大值后 类型为转换long  需要再重写一个入参为long的set方法
//        tbOrder.setTbPrice(new BigDecimal("2147483648"));
        tbOrder.setTbPrice(new BigDecimal("1000.11111"));

        Map<String, String> link = new HashMap<>();
        link.put("xnUid", "tbUid");
        link.put("xnOrderTime", "tbOrderTime");
        link.put("xnProductName", "tbProductName");
        link.put("xnProductCount", "tbProductCount");
        link.put("xnPrice", "tbPrice");

        // set方法 使用属性自身类型
        XnOrder xnOrder = OrderAdapter.adapter(JSON.toJSONString(tbOrder), link);

        // set方法 统一使用 string
        XnOrder xnOrderOfString = OrderAdapter.adapterOfString(JSON.toJSONString(tbOrder), link);

        System.out.println(xnOrder);
        System.out.println(xnOrderOfString);

    }
}
