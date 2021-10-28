package com.example.orderservice.controller;

import com.example.orderservice.entiy.Order;
import com.example.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order order) {
        log.info("inside saveOrder method if Order controller");
        return orderService.saveOrder(order);
    }
    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable("id") Long orderId){
        log.info("inside find OrderById method if Order controller!");
        return orderService.findOrderId(orderId);
    }

//    @Value("${welcome}")
//    String a;

    @GetMapping
    public String helloWorld(){
        return "Bên này là order nè";
    }

}
