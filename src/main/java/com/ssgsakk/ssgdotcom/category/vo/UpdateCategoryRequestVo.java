package com.ssgsakk.ssgdotcom.category.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdateCategoryRequestVo {
    private String categoryName;
    private int level;
    private Long parentCategorySeq;

}