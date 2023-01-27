package com.myproject.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Chineseblack23
 * @version 1.0
 * @Description:
 * @date 2023/1/27 14:09
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
