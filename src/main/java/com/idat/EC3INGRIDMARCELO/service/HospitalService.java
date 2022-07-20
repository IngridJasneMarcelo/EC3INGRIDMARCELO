package com.idat.EC3INGRIDMARCELO.service;

import java.util.List;

import com.idat.EC3INGRIDMARCELO.dto.HospitalDTORequest;
import com.idat.EC3INGRIDMARCELO.dto.HospitalDTOResponse;

public interface HospitalService {

	void guardarHospital(HospitalDTORequest hospital);

	void actualizarHospital(HospitalDTORequest hospital);

	void eliminarHospital(Integer id);

	List<HospitalDTOResponse> listarHospitales();

	HospitalDTOResponse obtenerHospitalId(Integer id);

}
