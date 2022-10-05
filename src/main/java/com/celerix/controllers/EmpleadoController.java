package com.celerix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celerix.entity.Empleado;
import com.celerix.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin("*")
public class EmpleadoController {

  @Autowired
  private EmpleadoService empleadoService;

  @GetMapping
  public List<Empleado> AllEmpleados() {
    List<Empleado> empleados = empleadoService.allEmpleado();
    return empleados;
  }

  @GetMapping("/{idEmpleado}")
  public Empleado oneEmpleado(@PathVariable(name = "idEmpleado") Long idEmpleado) {
    Empleado empleado = empleadoService.getByOneEmpleado(idEmpleado);
    return empleado;
  }

  @PostMapping
  public Empleado savEmpleado(@RequestBody Empleado empleado) {
    Empleado saveEmpleado = empleadoService.saveEmpleado(empleado);

    return saveEmpleado;
  }

  @PutMapping("/{idEmpleado}")
  public Empleado updateEmpleado(@PathVariable(name = "idEmpleado") Long idEmpleado, @RequestBody Empleado empleado) {
    Empleado updateEmpleado = empleadoService.updateEmpleado(idEmpleado, empleado);
    return updateEmpleado;
  }

  @DeleteMapping("/{idEmpleado}")
  public Empleado deleteEmpleado(@PathVariable(name = "idEmpleado") Long idEmpleado) {
    Empleado empleado = empleadoService.getByOneEmpleado(idEmpleado);

    empleadoService.deleteEmpleado(empleado);

    return empleado;
  }

}
