package com.myproject.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.common.xss.utils.PageUtils;
import com.myproject.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author Chineseblack23
 * @version 1.0
 * @Description:
 * @date 2023/1/27 14:09
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

