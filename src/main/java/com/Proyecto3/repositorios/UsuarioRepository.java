package com.Proyecto3.repositorios;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import com.Proyecto3.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long >{

}
