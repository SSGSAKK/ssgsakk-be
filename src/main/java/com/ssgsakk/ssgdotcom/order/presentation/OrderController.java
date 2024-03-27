package com.ssgsakk.ssgdotcom.order.presentation;
import com.ssgsakk.ssgdotcom.order.application.OrderService;
import com.ssgsakk.ssgdotcom.order.dto.OrderDto;
import com.ssgsakk.ssgdotcom.order.vo.CreateOrderRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public void createorder(@RequestBody CreateOrderRequestVo createOrderRequestVo){

        orderService.createorder(OrderDto.builder()
                .orderer(createOrderRequestVo.getOrderer())
                .ordererPhoneNum(createOrderRequestVo.getOrdererPhoneNum())
                .ordererEmail(createOrderRequestVo.getOrdererEmail())
                .recipient(createOrderRequestVo.getRecipient())
                .recipientPhoneNum(createOrderRequestVo.getRecipientPhoneNum())
                .recipientEmail(createOrderRequestVo.getRecipientEmail())
                .finalAddress(createOrderRequestVo.getFinalAddress())
                .finalRoadAddress(createOrderRequestVo.getFinalRoadAddress())
                .finalJibunAddress(createOrderRequestVo.getFinalJibunAddress())
                .finalDetailAddress(createOrderRequestVo.getFinalDetailAddress())
                .deliverymessage(createOrderRequestVo.getDeliverymessage())
                .build());
    }

}