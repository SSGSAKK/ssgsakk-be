package com.ssgsakk.ssgdotcom.order.application;

import com.ssgsakk.ssgdotcom.order.domain.Order;
import com.ssgsakk.ssgdotcom.order.dto.OrderDto;
import com.ssgsakk.ssgdotcom.order.infrastructure.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImp implements OrderService{
   private final OrderRepository orderRepository;

  @Override
   public void createorder(OrderDto orderDto){

        log.info(("=========" + orderDto.getOrderSeq()));
        Order order = Order.builder()
                   .ordererPhoneNum(orderDto.getOrdererPhoneNum())
                   .ordererEmail(orderDto.getOrdererPhoneNum())
                   .recipient(orderDto.getRecipient())
                   .recipientEmail(orderDto.getRecipientEmail())
                   .recipientPhoneNum(orderDto.getRecipientPhoneNum())
                   .finalAddress(orderDto.getFinalAddress())
                   .finalRoadAddress(orderDto.getFinalRoadAddress())
                   .finalJibunAddress(orderDto.getFinalJibunAddress())
                   .deliverymessage(orderDto.getDeliverymessage())
                   .build();

        orderRepository.save(order);

   }



}
