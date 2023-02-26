package com.chang.design.adapter;

import com.alibaba.fastjson.JSON;
import com.chang.design.adapter.xn.XnOrder;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * 各渠道订单适配
 */
public class OrderAdapter {

    /**
     * 订单信息适配
     * @param msgJson 各渠道订单信息
     * @param link 映射关系
     * @return
     */
    public static XnOrder adapter(String msgJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 总平台订单信息
        XnOrder xnOrder = new XnOrder();

        // 订单信息转为map
        Map map = JSON.parseObject(msgJson, Map.class);

        for (String key : link.keySet()) {
            Object obj = map.get(link.get(key));
            // 此处使用了对象本身的类型/转换后的类型(建议统一使用string  重载一个set 然后赋值),
            // date LocalDate 等日期类型会转换为 秒/毫秒值, 需要重载set方法 不然无法找到方法会报错
            // bigDecimal 类型会根据数值的大小转换为 对应的数据类型.
            XnOrder.class
                    .getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), obj.getClass())
                    .invoke(xnOrder, obj);
        }
        return xnOrder;
    }

    /**
     * 统一使用 string
     * @param msgJson
     * @param link
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static XnOrder adapterOfString(String msgJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 总平台订单信息
        XnOrder xnOrder = new XnOrder();

        // 订单信息转为map
        Map map = JSON.parseObject(msgJson, Map.class);

        for (String key : link.keySet()) {
            Object obj = map.get(link.get(key));
            XnOrder.class
                    .getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class)
                    .invoke(xnOrder, obj.toString());
        }
        return xnOrder;
    }
}
