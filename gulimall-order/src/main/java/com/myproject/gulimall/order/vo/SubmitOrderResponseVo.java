package com.myproject.gulimall.order.vo;

import com.myproject.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @author Chineseblack23
 * @version 1.0
 * @Description:
 * @date 2023/1/27 14:09
 **/

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;


}
