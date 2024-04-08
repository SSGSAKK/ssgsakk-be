package com.ssgsakk.ssgdotcom.contents.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductContentsVo {
    private Integer priority;
    private String contentUrl;
    private String contentDescription;
}
