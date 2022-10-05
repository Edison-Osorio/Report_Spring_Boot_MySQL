package com.celerix.service;

import java.util.List;

import com.celerix.entity.Empleado;

public interface EmpleadoService {

  
  public List<Empleado> allEmpleado();
 
  public Empleado getByOneEmpleado(Long idEmpleado);

  public Empleado saveEmpleado(Empleado empleado);

  public Empleado updateEmpleado(Long idEmpleado,Empleado empleado);

  public Empleado deleteEmpleado(Empleado empleado);

}
