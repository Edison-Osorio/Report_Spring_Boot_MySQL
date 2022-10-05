package com.celerix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celerix.entity.Empleado;
import com.celerix.repository.EmpleadoRepository;
import com.celerix.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

  @Autowired
  private EmpleadoRepository empleadoRepository;

  @Override
  public List<Empleado> allEmpleado() {
    List<Empleado> empleados = empleadoRepository.findAll();
    return empleados;
  }

  @Override
  public Empleado getByOneEmpleado(Long idEmpleado) {
    Empleado getEmpleado = empleadoRepository.findById(idEmpleado).orElseThrow();
    return getEmpleado;
  }

  @Override
  public Empleado saveEmpleado(Empleado empleado) {

    Empleado saveEmpleado = empleadoRepository.save(empleado);
    return saveEmpleado;
  }

  @Override
  public Empleado updateEmpleado(Long idEmpleado, Empleado empleado) {
    Empleado empleadoObtenido = empleadoRepository.findById(idEmpleado).orElseThrow();
    if (empleado == null) {
      return null;
    }
    empleadoObtenido.setNombre(empleado.getNombre());
    empleadoObtenido.setApellido(empleado.getApellido());
    empleadoObtenido.setCorreo(empleado.getCorreo());
    empleadoObtenido.setDireccion(empleado.getDireccion());
    empleadoObtenido.setCiudad(empleado.getCiudad());
    empleadoObtenido.setTelefono(empleado.getTelefono());
    empleadoObtenido.setNacionalidad(empleado.getNacionalidad());
    empleadoObtenido.setSexo(empleado.getSexo());
    empleadoObtenido.setEstadoCivil(empleado.getEstadoCivil());
    empleadoObtenido.setProfesion(empleado.getProfesion());

    Empleado updateEmpleado = empleadoRepository.save(empleadoObtenido);
    return updateEmpleado;
  }

  @Override
  public Empleado deleteEmpleado(Empleado empleado) {
    empleadoRepository.delete(empleado);
    return empleado;
  }

}
