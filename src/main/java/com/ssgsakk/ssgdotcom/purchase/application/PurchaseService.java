package com.ssgsakk.ssgdotcom.purchase.application;

import com.ssgsakk.ssgdotcom.purchase.dto.PurchaseCodeDto;
import com.ssgsakk.ssgdotcom.purchase.dto.PurchaseDto;
import com.ssgsakk.ssgdotcom.purchaseproduct.dto.PurchaseProductDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseService {


    PurchaseCodeDto createMemberPurchase(PurchaseDto purchaseDto, List<PurchaseProductDto> purchaseProductDto);

    @Transactional
    PurchaseCodeDto createNonMemberPurchase(PurchaseDto purchaseDto, List<PurchaseProductDto> purchaseProductDto);
}