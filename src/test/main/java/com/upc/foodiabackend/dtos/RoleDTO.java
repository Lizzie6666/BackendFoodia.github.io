package com.upc.foodiabackend.dtos;

import com.upc.foodiabackend.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private Long id;

    private String rol;

    private User user;
}
