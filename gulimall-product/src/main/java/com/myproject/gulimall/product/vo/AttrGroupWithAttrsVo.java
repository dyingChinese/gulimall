package com.myproject.gulimall.product.vo;

import com.myproject.gulimall.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@Data
public class AttrGroupWithAttrsVo {


    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
