package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theater {

    private int id;

    private String theaterName;

    private String address;

    private List<Screen> screenList;

   // List<Movie> movieList;

    private double rating;
}
