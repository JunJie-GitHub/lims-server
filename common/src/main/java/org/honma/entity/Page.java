package org.honma.entity;

import lombok.Data;

//@ApiModel(description = "分页类")
@Data
public class Page {
    /**
     * 页码
     */
//    @ApiModelProperty(value = "当前页数")
    Integer pageNo;

    /**
     * 页数
     */
//    @ApiModelProperty(value = "页码")
    Integer pageSize;
}
