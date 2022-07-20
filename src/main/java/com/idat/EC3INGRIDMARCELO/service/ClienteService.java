package com.idat.EC3INGRIDMARCELO.service;

import java.util.Collection;
import java.util.List;

import com.idat.EC3INGRIDMARCELO.dto.ClienteDTORequest;
import com.idat.EC3INGRIDMARCELO.dto.ClienteDTOResponse;
import com.idat.EC3INGRIDMARCELO.dto.ReservaDTORequest;
import com.idat.EC3INGRIDMARCELO.model.Reserva;



public interface ClienteService {

	void guardarCliente(ClienteDTORequest cliente);

	void actualizarCliente(ClienteDTORequest cliente);

	void eliminarCliente(Integer id);

	List<ClienteDTOResponse> listarClientes();

	ClienteDTOResponse obtenerClienteId(Integer id);
	
	public abstract Collection<Object[]> listReservas();

}
