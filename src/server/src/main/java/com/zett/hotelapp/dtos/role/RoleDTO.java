package com.zett.hotelapp.dtos.role;

import com.zett.hotelapp.dtos.BaseDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class RoleDTO extends BaseDTO {
    private String name;

    private String description;
}
