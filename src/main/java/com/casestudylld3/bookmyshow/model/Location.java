package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Location {

    private int id;

    private String city;

    private String stateName;

    private List<Theater> theateres;


}
