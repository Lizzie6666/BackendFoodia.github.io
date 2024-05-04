package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.Role;

import java.util.List;

public interface IRoleService {
    public Role insert(Role role);
    List<Role> list();
}
