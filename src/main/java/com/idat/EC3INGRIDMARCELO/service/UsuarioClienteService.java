package com.idat.EC3INGRIDMARCELO.service;

import java.util.List;

import com.idat.EC3INGRIDMARCELO.dto.UsuarioClienteDTORequest;
import com.idat.EC3INGRIDMARCELO.dto.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {

	void guardarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente);

	void actualizarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente);

	void eliminarUsuarioCliente(Integer id);

	List<UsuarioClienteDTOResponse> listarUsuarioClientes();

	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);

}
