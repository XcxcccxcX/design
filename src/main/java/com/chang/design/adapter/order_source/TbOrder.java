package com.chang.design.adapter.order_source;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 淘宝订单
 */
@Data
public class TbOrder {
    private String tbUid;
    private String tbProductName;
    private LocalDateTime tbOrderTime;
    private Integer tbProductCount;
    private BigDecimal tbPrice;
}
