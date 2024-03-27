package com.ssgsakk.ssgdotcom.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.security.Timestamp;

@ToString
@Getter
@Entity
@NoArgsConstructor
public class Order {

    @Id
    private Long orderSeq;

    @Column(nullable = false)
    private Long ordererId;


    @Column(nullable = false)
    private Timestamp orderAt;


    @Column(nullable = false)
    private String orderer; //주문자이름


    @Column(nullable = false)
    private String ordererPhoneNum; //주문자 전화번호


    @Column(nullable = false)
    private String ordererEmail; //주문자 이메일


    @Column(nullable = false)
    private String recipient; //수령자 이름


    @Column(nullable = false)
    private String recipientPhoneNum; //수령자 전화번호


    @Column(nullable = false)
    private String recipientEmail; //수령자 이메일


    @Column(nullable = false)
    private String finalAsdress; //최종배송지우편번호


    @Column(nullable = false)
    private String finalRoadAddress; //최종배송지 도로명주소


    @Column(nullable = false)
    private String finalJibunAddress; //최종배송지지번주소


    @Column(nullable = false)
    private String finalDetailAddress; //최종배송지상세주소

    @Column(nullable = false)
    private String deliverymessage; //배송메시지

    public Order(Long orderSeq, Long ordererId, Timestamp orderAt, String orderer,
                 String ordererPhoneNum, String ordererEmail, String recipient,
                 String recipientPhoneNum, String recipientEmail, String finalAsdress,
                 String finalRoadAddress, String finalJibunAddress, String finalDetailAddress,
                 String deliverymessage) {

        this.orderSeq = orderSeq;
        this.ordererId = ordererId;
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