package com.Proyecto3.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID  =1L;
		

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")	
	private String nombre;

	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="nif")
	private String nif;
	
	@Column(name="correo")
	private String correo;

	public Long getId() {
		return id;
	}

	
	
	
	
	//GETER Y SETTER
	
	
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	//Constructor

	public Usuario( String nombre, String apellidos, String nif, String correo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.correo = correo;
	}
	
	public Usuario() {
	}
	
	
	
	

	
	
}
