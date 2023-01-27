package com.myproject.gulimall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 */

@Data
public class MemberPrice {

  private Long id;
  private String name;
  private BigDecimal price;

}
