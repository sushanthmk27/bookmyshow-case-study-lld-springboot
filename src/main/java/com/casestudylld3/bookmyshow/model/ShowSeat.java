package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat {

    private Show show;

    private Seat seat;

    private ShowSeatType showSeatType;
}
