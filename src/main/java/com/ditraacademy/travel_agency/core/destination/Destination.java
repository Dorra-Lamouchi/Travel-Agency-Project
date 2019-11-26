package com.ditraacademy.travel_agency.core.destination;
import com.ditraacademy.travel_agency.core.voyage.Voyage;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;

    @OneToMany(mappedBy = "destination")
    private List<Voyage> voyages;
}
