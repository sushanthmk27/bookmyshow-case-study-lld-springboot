package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {

    private int id;

    private String name;

    private int row;

    private int col;

    private SeatType seatType;

}
