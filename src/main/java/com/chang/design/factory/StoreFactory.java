package com.chang.design.factory;

import com.chang.design.factory.store.ICommodity;
import com.chang.design.factory.store.impl.CardCommodityService;
import com.chang.design.factory.store.impl.GoodsCommodityService;

public class StoreFactory {

    /**
     * 返回 指定的类型实现
     * @param commodityType
     * @return
     */
    public ICommodity sendCommodity(Integer commodityType){
        switch (commodityType){
            case 1:
                return new CardCommodityService();
            case 2:
                return new GoodsCommodityService();
            default: return null;
        }
    }
}
