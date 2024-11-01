package com.usta.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usta.gallery.entities.Roles;

public interface RolRepository extends JpaRepository<Roles, Long> {
  
}
