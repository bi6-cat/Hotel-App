package com.zett.hotelapp.dtos.room;

import com.zett.hotelapp.dtos.BaseDTO;
import com.zett.hotelapp.entities.RoomType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class RoomDTO extends BaseDTO {
    private String number;

    private RoomType type;

    private int capacity;

    private double price;
}
