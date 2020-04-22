package com.example.pay.controller;

public class Ticket {
    private String message;
    private Long price;

    public Ticket(String message, Long price) {
        this.message = message;
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
