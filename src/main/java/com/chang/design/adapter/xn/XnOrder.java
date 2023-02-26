package com.chang.design.adapter.xn;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * 总平台订单
 */
@Data
public class XnOrder {
    private String xnUid;
    private String xnProductName;
    private LocalDateTime xnOrderTime;
    private Integer xnProductCount;
    private BigDecimal xnPrice;


    // 根据实际情况 需要重写set方法 不然类型无法适配, 也可以全部都是用string 然后在set方法中转换类型后赋值
    public void setXnOrderTime(Long xnOrderTime) {
        Instant instant = Instant.ofEpochMilli(xnOrderTime);
        this.xnOrderTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public void setXnPrice(Integer xnPrice) {
        this.xnPrice = new BigDecimal(xnPrice);
    }

    public void setXnPrice(Long xnPrice) {
        this.xnPrice = new BigDecimal(xnPrice);
    }

    public void setXnPrice(BigDecimal xnPrice) {
        this.xnPrice = xnPrice;
    }

    public void setXnPrice(String xnPrice) {
        this.xnPrice = new BigDecimal(xnPrice);
    }

    public void setXnProductCount(Integer xnProductCount) {
        this.xnProductCount = xnProductCount;
    }

    public void setXnProductCount(String xnProductCount) {
        this.xnProductCount = Integer.parseInt(xnProductCount);
    }

    public void setXnOrderTime(String xnOrderTime) {
        Instant instant = Instant.ofEpochMilli(Long.parseLong(xnOrderTime));
        this.xnOrderTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());;
    }
}
