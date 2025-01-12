package com.casestudylld3.bookmyshow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie {

    private int id;

    private String name;

    //private String language;

    private String genere;

    private List<String> cast;

    private List<Language> languageList;

}
