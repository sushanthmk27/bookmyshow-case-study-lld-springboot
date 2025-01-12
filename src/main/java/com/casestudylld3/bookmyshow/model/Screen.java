package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen {

    private String screenName;

    private List<Movie> movies;

    private List<Seat> seats;

}
