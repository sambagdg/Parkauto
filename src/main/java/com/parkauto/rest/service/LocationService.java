package com.parkauto.rest.service;

import com.parkauto.rest.entity.Location;
import com.parkauto.rest.repository.IlocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
     IlocationRepository LocationRepository;

    public List<Location> getAllLocations() {
        return LocationRepository.findAll();
    }

    public Location saveLocation(Location Location) {
        return LocationRepository.save(Location);
    }

    public Location getLocationById(Long idLocation) {
        return LocationRepository.findById(idLocation).orElseThrow(() -> new RuntimeException("Location not found"));
    }

    public void  deleteLocation(Location Location) {
        LocationRepository.delete(Location);
    }
}
