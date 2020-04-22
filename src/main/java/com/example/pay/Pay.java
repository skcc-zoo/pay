package com.example.pay;

import com.example.pay.event.CommonEvent;
import com.example.pay.event.Paid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;

@Entity
public class Pay {
    @Id
    @GeneratedValue
    private Long id;

    private Long fee;


    @PostPersist
    public void publishPaidEvent() {
        Paid paid = new Paid();
        paid.setId(this.id);
        paid.setFee(this.fee);
        CommonEvent commonEvent = new CommonEvent("Paid",paid );
        commonEvent.publish();
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
