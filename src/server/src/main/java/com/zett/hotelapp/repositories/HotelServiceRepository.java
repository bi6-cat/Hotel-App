package com.zett.hotelapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zett.hotelapp.entities.HotelService;

public interface HotelServiceRepository extends JpaRepository<HotelService, UUID>, JpaSpecificationExecutor<HotelService> {
    HotelService findByName(String name);

}