package com.upc.foodiabackend.dtos;

import com.upc.foodiabackend.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InteractionsDTO {
    Long id;
    String description;
    Integer score;
    private User user;
}
