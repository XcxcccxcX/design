package com.chang.design.adapter.order_source;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * 抖音订单
 */
@Data
public class DyOrder {
    private String dyUid;
    private String dyProductName;
    private LocalDateTime dyOrderTime;
    private Integer dyProductCount;
    private BigDecimal dyPrice;
}
