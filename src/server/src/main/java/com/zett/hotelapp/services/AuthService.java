package com.zett.hotelapp.services;


import java.util.UUID;

import com.zett.hotelapp.dtos.auth.RegisterRequestDTO;

public interface AuthService {
    UUID register(RegisterRequestDTO registerRequestDTO);

    boolean existsByUsername(String username);
}
