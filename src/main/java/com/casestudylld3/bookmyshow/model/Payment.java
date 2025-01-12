package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Payment   {

    private long transcationId;

    private User user;

    private List<PaymentType> paymentType;

    private LocalDateTime dateTime;

    private double amount;

    private Status status;

}
