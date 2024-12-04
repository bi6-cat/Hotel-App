package com.zett.hotelapp.dtos.room;

import com.zett.hotelapp.dtos.MasterDTO;
import com.zett.hotelapp.entities.RoomType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomMasterDTO extends MasterDTO {
    private String number;

    private RoomType type;

    private int capacity;

    private double price;
}
