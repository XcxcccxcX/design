package com.chang.design.adapter.order_source;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 小红书订单
 */
@Data
public class RedOrder {

    private String redUid;
    private String redProductName;
    private LocalDateTime redOrderTime;
    private Integer redProductCount;
    private BigDecimal redPrice;
}
