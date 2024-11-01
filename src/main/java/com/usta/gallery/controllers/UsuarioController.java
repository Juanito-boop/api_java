package com.usta.gallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usta.gallery.entities.Usuarios;
import com.usta.gallery.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping
  public ResponseEntity<Iterable<Usuarios>> getAllUsuarios() {
    return ResponseEntity.ok(usuarioRepository.findAll());
  }
}
