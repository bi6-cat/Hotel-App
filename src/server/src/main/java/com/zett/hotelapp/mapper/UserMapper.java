package com.zett.hotelapp.mapper;

import org.mapstruct.*;

import com.zett.hotelapp.entities.User;
import com.zett.hotelapp.dtos.user.UserCreateUpdateDTO;
import com.zett.hotelapp.dtos.user.UserDTO;
import com.zett.hotelapp.dtos.user.UserMasterDTO;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserDTO toDTO(User entity);

    UserMasterDTO toMasterDTO(User entity);

    User toEntity(UserCreateUpdateDTO dto);

    // Keep the insertedAt, updatedAt, deletedAt, isActive fields as they are
    @Mapping(target = "insertedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "active", ignore = true)
    void updateEntity(UserCreateUpdateDTO dto, @MappingTarget User entity);
}
