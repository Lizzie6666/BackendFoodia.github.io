package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.Interactions;

import java.util.List;

public interface IInteractionService {
    Interactions save(Interactions interactions);
    List<Interactions> list();
}
