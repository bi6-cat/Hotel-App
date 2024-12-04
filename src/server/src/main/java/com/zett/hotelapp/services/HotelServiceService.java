package com.zett.hotelapp.services;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zett.hotelapp.dtos.hotelservice.HotelServiceCreateUpdateDTO;
import com.zett.hotelapp.dtos.hotelservice.HotelServiceMasterDTO;

public interface HotelServiceService {

    List<HotelServiceMasterDTO> findAll();

    List<HotelServiceMasterDTO> findByName(String keyword);

    Page<HotelServiceMasterDTO> findPaginated(String keyword, Pageable pageable);

    HotelServiceMasterDTO findById(String id);

    HotelServiceMasterDTO create(HotelServiceCreateUpdateDTO serviceDTO);

    HotelServiceMasterDTO update(UUID id, HotelServiceCreateUpdateDTO serviceDTO);

    boolean delete(UUID id);
}
