package com.chang.design.factory.store.impl;

import com.chang.design.factory.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 实物商品
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {

    @Override
    public void sendCommodity(String userId, String commodityId, Map<String, Object> ext) {
        log.info("实现逻辑  <b>实物</b>商品 userId:{}, commodityId:{}, address:{}", userId, commodityId, ext.get("address"));
    }
}
