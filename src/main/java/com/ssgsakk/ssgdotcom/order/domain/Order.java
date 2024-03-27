package com.ssgsakk.ssgdotcom.order.domain;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.security.Timestamp;

@ToString
@Entity
@Getter
@NoArgsConstructor
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderSeq;

    @Column(length = 10)
    private String orderer; //주문자이름

    @Column(length = 15)
    private String ordererPhoneNum; //주문자 전화번호

    @Column(length = 20)
    private String ordererEmail; //주문자 이메일

    @Column(length = 10)
    private String recipient; //수령자 이름

    @Column(length = 15)
    private String recipientPhoneNum; //수령자 전화번호

    @Column(length = 20)
    private String recipientEmail; //수령자 이메일
    @Column(length = 7)
    private String finalAddress; //최종배송지우편번호

    @Column(length = 30)
    private String finalRoadAddress; //최종배송지 도로명주소

    @Column(length = 20)
    private String finalJibunAddress; //최종배송지지번주소

    @Column(length = 10)
    private String finalDetailAddress; //최종배송지상세주소

    @Column(length = 100)
    private String deliverymessage; //배송메시지

    @Builder

    public Order(Long orderSeq, String orderer,
                 String ordererPhoneNum, String ordererEmail,
                 String recipient, String recipientPhoneNum, String recipientEmail,
                 String finalAddress, String finalRoadAddress, String finalJibunAddress,
                 String finalDetailAddress, String deliverymessage) {

        this.orderSeq = orderSeq;
        this.orderer = orderer;
        this.ordererPhoneNum = ordererPhoneNum;
        this.ordererEmail = ordererEmail;
        this.recipient = recipient;
        this.recipientPhoneNum = recipientPhoneNum;
        this.recipientEmail = recipientEmail;
        this.finalAddress = finalAddress;
        this.finalRoadAddress = finalRoadAddress;
        this.finalJibunAddress = finalJibunAddress;
        this.finalDetailAddress = finalDetailAddress;
        this.deliverymessage = deliverymessage;
    }
}
