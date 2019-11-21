package com.ditraacademy.travel_agency.core.destination;

import com.ditraacademy.travel_agency.core.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DestinationController {

    @Autowired
    DestinationRepository destinationRepository;

    @PostMapping("/dest")
    public ResponseEntity<?> createDest (@RequestBody Destination destination){
        destination = destinationRepository.save(destination);
        return new ResponseEntity<>(destination, HttpStatus.OK);
    }

     @GetMapping("/destinations")
     public List<Destination> getDest(){
         List<Destination> destList = destinationRepository.findAll();
         return destList;
    }


}

