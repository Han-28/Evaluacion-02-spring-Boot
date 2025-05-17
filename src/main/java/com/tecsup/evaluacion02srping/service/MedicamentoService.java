package com.tecsup.evaluacion02srping.service;

import com.tecsup.evaluacion02srping.repository.MedicamentoRepository;
import com.tecsup.evaluacion02srping.model.Medicamento;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public MedicamentoService(MedicamentoRepository medicamentoRepository) {
        this.medicamentoRepository = medicamentoRepository;
    }

    public List<Medicamento> listar() {
        return medicamentoRepository.findAll();
    }

    public Optional<Medicamento> buscarPorId(Integer id) {
        return medicamentoRepository.findById(id);
    }

    public Medicamento guardar(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public void eliminar(Integer id) {
        medicamentoRepository.deleteById(id);
    }
}