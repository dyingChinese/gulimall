package com.myproject.gulimall.product.fallback;

import com.myproject.common.exception.BizCodeEnum;
import com.myproject.common.xss.utils.R;
import com.myproject.gulimall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMessage());
    }
}
