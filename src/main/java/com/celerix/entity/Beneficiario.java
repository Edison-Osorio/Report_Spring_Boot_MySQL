package com.celerix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "beneficiarios")
public class Beneficiario {

  @Id
  @Column(name = "id_beneficiario")
  private Long id;

  @Column(name = "nombre_b")
  private String nombre;
  @Column(name = "apellido_b")
  private String apellido;

  private String porcentaje;

  private String parentesco;

  private String telefono;

  private String correo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_empleado_b")
  @JsonProperty(access = Access.WRITE_ONLY)
  private Empleado empleado;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getPorcentaje() {
    return this.porcentaje;
  }

  public void setPorcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
  }

  public String getParentesco() {
    return this.parentesco;
  }

  public void setParentesco(String parentesco) {
    this.parentesco = parentesco;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreo() {
    return this.correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Empleado getEmpleado() {
    return this.empleado;
  }

  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
  }

}
