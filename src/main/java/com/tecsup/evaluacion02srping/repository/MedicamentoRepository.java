package com.tecsup.evaluacion02srping.repository;

import com.tecsup.evaluacion02srping.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> { }