package com.myproject.gulimall.member.feign;

import com.myproject.common.xss.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
