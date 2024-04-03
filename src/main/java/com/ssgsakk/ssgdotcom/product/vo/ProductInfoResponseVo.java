package com.ssgsakk.ssgdotcom.product.vo;

import com.ssgsakk.ssgdotcom.common.util.DeliveryType;
import com.ssgsakk.ssgdotcom.contents.vo.ProductContentsVo;

import lombok.Builder;
import lombok.Getter;


import java.util.List;

@Builder
@Getter
public class ProductInfoResponseVo {
    private String productName;
    private Integer productPrice;
    private String vendor;
    private String productDescription;
    private Integer discountPercent;
    private DeliveryType deliveryType;
    private Double averageRating;
    private Integer reviewCount;
    private List<ProductContentsVo> contents;
}
