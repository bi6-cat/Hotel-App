package com.zett.hotelapp.dtos.role;

import com.zett.hotelapp.dtos.MasterDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleMasterDTO extends MasterDTO {
    private String name;
    
    private String description;
}
