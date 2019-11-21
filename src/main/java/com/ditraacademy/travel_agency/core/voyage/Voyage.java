package com.ditraacademy.travel_agency.core.voyage;

import com.ditraacademy.travel_agency.core.destination.Destination;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private Date date;
    private Integer nbPlaces;
    private Double prix;

    @ManyToOne
    private Destination destination;
}
