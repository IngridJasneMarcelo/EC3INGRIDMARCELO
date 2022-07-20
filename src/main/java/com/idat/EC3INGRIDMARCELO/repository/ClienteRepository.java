package com.idat.EC3INGRIDMARCELO.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.idat.EC3INGRIDMARCELO.dto.ReservaDTORequest;
import com.idat.EC3INGRIDMARCELO.model.Cliente;
import com.idat.EC3INGRIDMARCELO.model.Reserva;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Query(value = "select * from reserva", nativeQuery = true)
	abstract Collection<Object[]> listReservas();

}
