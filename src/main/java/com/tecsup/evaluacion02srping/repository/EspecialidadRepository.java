package com.tecsup.evaluacion02srping.repository;

import com.tecsup.evaluacion02srping.model.Especialidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> { }