package com.ssgsakk.ssgdotcom.order.dto;


import lombok.Builder;
import lombok.Getter;

import java.security.Timestamp;

@Getter
public class OrderDto {

    private Long orderSeq;
    private Timestamp orderAt;
    private String orderer; //주문자이름
    private String ordererPhoneNum; //주문자 전화번호
    private String ordererEmail; //주문자 이메일
    private String recipient; //수령자 이름
    private String recipientPhoneNum; //수령자 전화번호
    private String recipientEmail; //수령자 이메일
    private String finalAsdress; //최종배송지우편번호
    private String finalRoadAddress; //최종배송지 도로명주소
    private String finalJibunAddress; //최종배송지지번주소
    private String finalDetailAddress; //최종배송지상세주소
    private String deliverymessage; //배송메시지


    @Builder
    public OrderDto(Long orderSeq, Timestamp orderAt, String orderer, String ordererPhoneNum,
                    String ordererEmail, String recipient, String recipientPhoneNum, String recipientEmail,
                    String finalAsdress, String finalRoadAddress, String finalJibunAddress,
                    String finalDetailAddress, String deliverymessage) {

        this.orderSeq = orderSeq;
        this.orderAt = orderAt;
        this.orderer = orderer;
        this.ordererPhoneNum = ordererPhoneNum;
        this.ordererEmail = ordererEmail;
        this.recipient = recipient;
        this.recipientPhoneNum = recipientPhoneNum;
        this.recipientEmail = recipientEmail;
        this.finalAsdress = finalAsdress;
        this.finalRoadAddress = finalRoadAddress;
        this.finalJibunAddress = finalJibunAddress;
        this.finalDetailAddress = finalDetailAddress;
        this.deliverymessage = deliverymessage;
    }
}
