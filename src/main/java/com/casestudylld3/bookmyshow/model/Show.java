package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Show {

    private Movie movie;

    private Language language;

    private LocalDateTime time;

    private List<ShowSeat> showSeatList;

    private  List<ShowSeatType> showSeatTypeList;

}
