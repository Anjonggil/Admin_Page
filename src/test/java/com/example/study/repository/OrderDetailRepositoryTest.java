package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OrderDetailRepositoryTest extends StudyApplicationTests {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Test
    void create(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());

        orderDetail.setUserId(1L);

        orderDetail.setItemId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        assertNotNull(newOrderDetail);
    }
}