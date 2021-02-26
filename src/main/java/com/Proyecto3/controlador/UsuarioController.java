package com.Proyecto3.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Proyecto3.repositorios.UsuarioRepository;

@Controller
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	

	
}
