package com.celerix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celerix.entity.Beneficiario;
import com.celerix.repository.BeneficiarioRepository;
import com.celerix.service.BeneficiarioService;

@Service
public class BeneficiarioServiceimpl implements BeneficiarioService {

  @Autowired
  private BeneficiarioRepository beneficiarioRepository;

  @Override
  public List<Beneficiario> allBeneficiario() {
    List<Beneficiario> beneficiarios = beneficiarioRepository.findAll();
    return beneficiarios;
  }

  @Override
  public Beneficiario getByOneBeneficiario(Long idBeneficiario) {
    Beneficiario getBeneficiario = beneficiarioRepository.findById(idBeneficiario).orElseThrow();
    return getBeneficiario;
  }

  @Override
  public Beneficiario saveBeneficiario(Beneficiario beneficiario) {
    Beneficiario saveBeneficiario = beneficiarioRepository.save(beneficiario);
    return saveBeneficiario;
  }

  @Override
  public Beneficiario updateBeneficiario(Long idbeneficiario, Beneficiario beneficiario) {
    Beneficiario beneficiarioObtenido = beneficiarioRepository.findById(idbeneficiario).orElseThrow();

    if (beneficiarioObtenido == null) {
      return null;
    }

    beneficiarioObtenido.setNombre(beneficiario.getNombre());
    beneficiarioObtenido.setApellido(beneficiario.getApellido());
    beneficiarioObtenido.setPorcentaje(beneficiario.getPorcentaje());
    beneficiarioObtenido.setParentesco(beneficiario.getParentesco());
    beneficiarioObtenido.setTelefono(beneficiario.getTelefono());
    beneficiarioObtenido.setCorreo(beneficiario.getCorreo());

    Beneficiario updateBeneficiario = beneficiarioRepository.save(beneficiarioObtenido);
    return updateBeneficiario;
  }

  @Override
  public Beneficiario deleteBeneficiario(Beneficiario beneficiario) {
    beneficiarioRepository.delete(beneficiario);
    return beneficiario;
  }

}
