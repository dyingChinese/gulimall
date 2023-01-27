package com.myproject.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 */

@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;

}
