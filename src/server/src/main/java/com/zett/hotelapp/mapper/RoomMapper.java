package com.zett.hotelapp.mapper;

import org.mapstruct.*;

import com.zett.hotelapp.entities.Room;
import com.zett.hotelapp.dtos.room.RoomCreateUpdateDTO;
import com.zett.hotelapp.dtos.room.RoomDTO;
import com.zett.hotelapp.dtos.room.RoomMasterDTO;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoomMapper {
    RoomDTO toDTO(Room entity);

    RoomMasterDTO toMasterDTO(Room entity);

    Room toEntity(RoomCreateUpdateDTO dto);

    // Keep the insertedAt, updatedAt, deletedAt, isActive fields as they are
    @Mapping(target = "insertedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "active", ignore = true)
    void updateEntity(RoomCreateUpdateDTO dto, @MappingTarget Room entity);
}
