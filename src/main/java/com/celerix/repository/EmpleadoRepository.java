package com.celerix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celerix.entity.Empleado;

public interface EmpleadoRepository  extends JpaRepository<Empleado, Long>{
  
}
