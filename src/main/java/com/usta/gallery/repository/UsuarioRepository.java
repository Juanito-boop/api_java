package com.usta.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usta.gallery.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
  
}
