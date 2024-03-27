package com.ssgsakk.ssgdotcom.order.vo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class CreateOrderRequestVo {

    private Long orderSeq;
    private String orderer; //주문자이름
    private String ordererPhoneNum; //주문자 전화번호
    private String ordererEmail; //주문자 이메일
    private String recipient; //수령자 이름
    private String recipientPhoneNum; //수령자 전화번호
    private String recipientEmail; //수령자 이메일
    private String finalAddress; //최종배송지우편번호
    private String finalRoadAddress; //최종배송지 도로명주소
    private String finalJibunAddress; //최종배송지지번주소
    private String finalDetailAddress; //최종배송지상세주소
    private String deliverymessage; //배송메시지
}
