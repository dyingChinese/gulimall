package com.myproject.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.common.xss.utils.PageUtils;
import com.myproject.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

