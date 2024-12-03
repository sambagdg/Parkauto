package com.parkauto.rest.controller;


import com.parkauto.rest.entity.Location;
import com.parkauto.rest.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class LocationController {
     @Autowired
    LocationService LocationService;

    @PostMapping("/Locations")
    public Location Location(@Validated @RequestBody(required = false) Location Location) {
        return LocationService.saveLocation(Location);
    }

    @GetMapping("/Locations")
    public List<Location> getAllLocations() {
        return LocationService.getAllLocations();
    }

    @GetMapping("/Locations/{idLocation}")
    public ResponseEntity<?> findLocationById(@PathVariable(name = "idLocation") Long idLocation) {
        if(idLocation == null) {
            return ResponseEntity.badRequest().body("Cannot find Location with null id");
        }
        Location Location = LocationService.getLocationById(idLocation);
        if(Location == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Location);
    }

    @DeleteMapping("/Locations/{idLocation}")
    public ResponseEntity<?> deleteLocationById(@PathVariable(name = "idLocation") Long idLocation) {
        if(idLocation == null) {
            return ResponseEntity.badRequest().body("Cannot delete Location with null id");
        }
        Location Location = LocationService.getLocationById(idLocation);
        if(Location == null) {
            return ResponseEntity.notFound().build();
        }
        LocationService.deleteLocation(Location);
        return ResponseEntity.ok().body(Location);
    }
}
