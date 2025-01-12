package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Ticket {

    private int id;

    private User user;

    private List<Payment> payments;

    private List<ShowSeat> showSeatList;

    private String status;

    private Show show;
}
