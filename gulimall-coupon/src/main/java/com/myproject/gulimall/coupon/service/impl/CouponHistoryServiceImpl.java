package com.myproject.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myproject.common.xss.utils.PageUtils;
import com.myproject.common.xss.utils.Query;
import com.myproject.gulimall.coupon.dao.CouponHistoryDao;
import com.myproject.gulimall.coupon.entity.CouponHistoryEntity;
import com.myproject.gulimall.coupon.service.CouponHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistoryEntity> page = this.page(
                new Query<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}