package com.usta.gallery.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id;

	@Column(name = "nombre", nullable = false, length = Integer.MAX_VALUE)
	private String nombre;

	@Column(name = "apellido", nullable = false, length = Integer.MAX_VALUE)
	private String apellido;

	@Column(name = "correo", nullable = false, length = Integer.MAX_VALUE)
	private String correo;

	@Column(name = "contrasena", nullable = false, length = Integer.MAX_VALUE)
	private String contrasena;

	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;

	@Column(name = "pais_origen", length = Integer.MAX_VALUE)
	private String paisOrigen;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_rol", nullable = false)
	private Roles roles;

}