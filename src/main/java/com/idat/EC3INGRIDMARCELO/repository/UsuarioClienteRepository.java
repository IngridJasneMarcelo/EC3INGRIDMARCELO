package com.idat.EC3INGRIDMARCELO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC3INGRIDMARCELO.model.UsuarioCliente;



@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {

	UsuarioCliente findByUsuario(String usuario);

}
