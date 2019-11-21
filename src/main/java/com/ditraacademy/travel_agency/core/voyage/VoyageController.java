package com.ditraacademy.travel_agency.core.voyage;

import com.ditraacademy.travel_agency.core.destination.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VoyageController {

    @Autowired
    VoyageRepository voyageRepository;

    @PostMapping("/voy")
    public ResponseEntity<?> createVoy (@RequestBody Voyage voyage){
         voyage= voyageRepository.save(voyage);
         return new ResponseEntity<>(voyage,HttpStatus.OK);
    }

    @GetMapping("/voyages")
    public List<Voyage> getVoy(){
        List<Voyage> voyList = voyageRepository.findAll();
        return voyList;
    }
}
