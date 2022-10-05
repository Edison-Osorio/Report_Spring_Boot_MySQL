package com.celerix.service;

import java.util.List;

import com.celerix.entity.Beneficiario;

public interface BeneficiarioService {

  public List<Beneficiario> allBeneficiario();

  public Beneficiario getByOneBeneficiario(Long idBeneficiario);

  public Beneficiario saveBeneficiario(Beneficiario beneficiario);

  public Beneficiario updateBeneficiario(Long idbeneficiario, Beneficiario beneficiario);

  public Beneficiario deleteBeneficiario(Beneficiario beneficiario);

}
