package com.celerix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celerix.entity.Beneficiario;
import com.celerix.service.BeneficiarioService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/beneficiarios")
@CrossOrigin("*")
public class BeneficiarioController {

  @Autowired
  private BeneficiarioService beneficiarioService;

  @GetMapping
  public List<Beneficiario> allBeneficiarios() {
    List<Beneficiario> beneficiarios = beneficiarioService.allBeneficiario();
    return beneficiarios;
  }

  @GetMapping("/{idBeneficiario}")
  public Beneficiario oneBeneficiario(@PathVariable(name = "idBeneficiario") Long idBeneficiario) {
    Beneficiario beneficiario = beneficiarioService.getByOneBeneficiario(idBeneficiario);
    return beneficiario;
  }

  @PostMapping
  public Beneficiario saveBeneficiario(@RequestBody Beneficiario beneficiario) {
    Beneficiario saveBeneficiario = beneficiarioService.saveBeneficiario(beneficiario);
    return saveBeneficiario;
  }

  @PutMapping("/{idBeneficiario}")
  public Beneficiario updatBeneficiario(@PathVariable(name = "idBeneficiario") Long idBeneficiario,
      @RequestBody Beneficiario beneficiario) {

    Beneficiario updateBeneficiario = beneficiarioService.updateBeneficiario(idBeneficiario, beneficiario);
    return updateBeneficiario;
  }

  @DeleteMapping("/{idBeneficiario}")
  public Beneficiario deleteBeneficiario(@PathVariable(name = "idBeneficiario") Long idBeneficiario) {
    Beneficiario beneficiario = beneficiarioService.getByOneBeneficiario(idBeneficiario);

    beneficiarioService.deleteBeneficiario(beneficiario);
    return beneficiario;
  }

}
