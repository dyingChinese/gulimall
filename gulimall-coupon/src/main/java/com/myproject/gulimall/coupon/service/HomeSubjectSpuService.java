package com.myproject.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myproject.common.xss.utils.PageUtils;
import com.myproject.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

