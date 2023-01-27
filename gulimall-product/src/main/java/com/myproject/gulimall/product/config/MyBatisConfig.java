package com.myproject.gulimall.product.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@Configuration
@EnableTransactionManagement        //开启使用
@MapperScan("com.xunqi.gulimall.product.dao")
public class MyBatisConfig {

    //引入分页插件
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor paginationInterceptor = new MybatisPlusInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        paginationInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        // 设置最大单页限制数量，默认 500 条
        return paginationInterceptor;
    }

}
