package com.ssgsakk.ssgdotcom.purchase.application;

import com.ssgsakk.ssgdotcom.purchase.dto.PurchaseDto;

public interface PurchaseService {


    void createMemberPurchase(PurchaseDto purchaseDto);
}