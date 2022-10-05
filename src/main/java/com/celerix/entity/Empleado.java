package com.celerix.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

  @Id
  @Column(name = "id_empleado")
  private Long id;

  @Column(name = "tipo_id")
  private String tipoId;

  private String nombre;
  private String apellido;
  @Column(name = "fecha_ex_id")
  private Date fechaExpedicionId;
  @Column(name = "fecha_naci")
  private Date fechaNacimiento;

  private String nacionalidad;
  private String sexo;
  @Column(name = "estado_civil")
  private String estadoCivil;
@Column(name = "no_credito")
  private String NoCredito;
  private String direccion;
  private String ciudad;
  private String telefono;
  private String correo;
  private String profesion;
  @Column(name = "prima_seguro")
  private String primaSeguro;

  @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
  private Set<Beneficiario> beneficiario;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTipoId() {
    return this.tipoId;
  }

  public void setTipoId(String tipoId) {
    this.tipoId = tipoId;
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

  public Date getFechaExpedicionId() {
    return this.fechaExpedicionId;
  }

  public void setFechaExpedicionId(Date fechaExpedicionId) {
    this.fechaExpedicionId = fechaExpedicionId;
  }

  public Date getFechaNacimiento() {
    return this.fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNacionalidad() {
    return this.nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public String getSexo() {
    return this.sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getEstadoCivil() {
    return this.estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public String getNoCredito() {
    return this.NoCredito;
  }

  public void setNoCredito(String NoCredito) {
    this.NoCredito = NoCredito;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getCiudad() {
    return this.ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
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

  public String getProfesion() {
    return this.profesion;
  }

  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }

  public String getPrimaSeguro() {
    return this.primaSeguro;
  }

  public void setPrimaSeguro(String primaSeguro) {
    this.primaSeguro = primaSeguro;
  }

  public Set<Beneficiario> getBeneficiario() {
    return this.beneficiario;
  }

  public void setBeneficiario(Set<Beneficiario> beneficiario) {
    this.beneficiario = beneficiario;
  }

}
