package com.celerix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celerix.entity.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}
