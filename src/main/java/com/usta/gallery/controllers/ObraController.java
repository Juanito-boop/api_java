package com.usta.gallery.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usta.gallery.entities.Obras;
import com.usta.gallery.repository.ObraRepository;

@RestController
@RequestMapping("/api/obras")
public class ObraController {
  
  @Autowired
  private ObraRepository obraRepository;

  @GetMapping
  public ResponseEntity<Iterable<Obras>> getAllObras() {
    return ResponseEntity.ok(obraRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Obras> getObraById(@PathVariable Long id) {
    Optional<Obras> obra = obraRepository.findById(id);
    return obra.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<Obras> createObra(@RequestBody Obras obra) {
    Obras newObra = obraRepository.save(obra);
    return ResponseEntity.ok(newObra);
  }
}
