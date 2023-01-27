package com.myproject.gulimall.product.vo;

import lombok.Data;

/**
 * @author Chineseblack23
 * @version 1.0
 * @date 2023/1/27 14:09
 **/

@Data
public class AttrGroupRelationVo {

    //[{"attrId":1,"attrGroupId":2}]
    private Long attrId;

    private Long attrGroupId;

}
