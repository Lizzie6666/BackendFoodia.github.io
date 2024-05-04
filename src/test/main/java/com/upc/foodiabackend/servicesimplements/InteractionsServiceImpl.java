package com.upc.foodiabackend.servicesimplements;

import com.upc.foodiabackend.entities.Interactions;
import com.upc.foodiabackend.repositories.InteractionsRepository;
import com.upc.foodiabackend.services.IInteractionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InteractionsServiceImpl implements IInteractionService {
    @Autowired
    private InteractionsRepository interactionsRepository;

    @Transactional
    @Override
    public Interactions save(Interactions interactions){ return interactionsRepository.save(interactions);}

    @Override
    public List<Interactions> list(){
        return interactionsRepository.findAll();
    }
}
