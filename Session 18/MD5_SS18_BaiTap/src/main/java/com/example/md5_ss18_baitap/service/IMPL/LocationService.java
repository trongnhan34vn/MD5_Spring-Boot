package com.example.md5_ss18_baitap.service.IMPL;

import com.example.md5_ss18_baitap.model.Location;
import com.example.md5_ss18_baitap.repository.ILocationRepository;
import com.example.md5_ss18_baitap.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocationService implements ILocationService {
    @Autowired
    ILocationRepository locationRepository;
    @Override
    public Optional<Location> findById(Long id) {
        return locationRepository.findById(id);
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }
}
