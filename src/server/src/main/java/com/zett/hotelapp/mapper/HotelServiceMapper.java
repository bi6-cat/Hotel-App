package com.zett.hotelapp.mapper;

import org.mapstruct.*;

import com.zett.hotelapp.dtos.hotelservice.HotelServiceCreateUpdateDTO;
import com.zett.hotelapp.dtos.hotelservice.HotelServiceMasterDTO;
import com.zett.hotelapp.entities.HotelService;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HotelServiceMapper {
    HotelService toDTO(HotelService entity);

    HotelServiceMasterDTO toMasterDTO(HotelService entity);

    HotelService toEntity(HotelServiceCreateUpdateDTO dto);

    // Keep the insertedAt, updatedAt, deletedAt, isActive fields as they are
    @Mapping(target = "insertedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "active", ignore = true)
    void updateEntity(HotelServiceCreateUpdateDTO dto, @MappingTarget HotelService entity);
}
