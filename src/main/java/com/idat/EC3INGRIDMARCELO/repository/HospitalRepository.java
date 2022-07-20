package com.idat.EC3INGRIDMARCELO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC3INGRIDMARCELO.model.Hospital;








@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer>{

}
