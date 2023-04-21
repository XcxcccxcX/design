package com.chang.design.factory.store;

import java.util.Map;

/**
 * 工厂 接口
 */
public interface ICommodity {

    /**
     * 发放奖品
     * @param userId
     * @param commodityId
     * @param ext
     */
    void sendCommodity(String userId, String commodityId, Map<String, Object> ext);
}
