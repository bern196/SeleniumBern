package com.bern.SeleniumDemoMovie.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private int rating;

    public Movie(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }
}
