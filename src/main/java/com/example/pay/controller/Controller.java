package com.example.pay.controller;

import com.example.pay.Pay;
import com.example.pay.PayRepository;
import com.example.pay.external.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pay")
@RestController
public class Controller {
    @Autowired
    SpaceService spaceService;

    @Autowired
    PayRepository payRepository;

    @GetMapping("/buy_ticket")
    public Ticket buyTicket() {
        boolean result = spaceService.getPermission();
        if(result) {
            Pay pay = new Pay();
            pay.setFee(100000L);
            payRepository.save(pay);
            System.out.println("buying ticket succeed!");
            return new Ticket("Welcome to my zoo!!", 100000L);
        } else {
            System.out.println("buying ticket failed!");
            return new Ticket("Not available, now. Sorry.", 0L);
        }

    }

}
