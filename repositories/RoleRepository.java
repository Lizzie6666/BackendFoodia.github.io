package com.upc.foodiabackend.repositories;

import com.upc.foodiabackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
