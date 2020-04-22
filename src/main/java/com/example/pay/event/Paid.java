package com.example.pay.event;

import java.util.HashMap;

public class Paid {
    private Long id;
    private Long fee;

    public Paid() {
    }

    public Paid(HashMap<String, Object> map) {
        this.id = Long.valueOf((Integer) map.get("id"));
        this.fee = Long.valueOf((Integer) map.get("fee"));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }
}
