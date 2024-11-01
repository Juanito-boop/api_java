package com.usta.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usta.gallery.entities.Obras;

public interface ObraRepository extends JpaRepository<Obras, Long> {
  
}
