package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.service;


import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Paciente;

import java.util.List;
import java.util.UUID;

public interface PacienteService {
    Paciente criarPaciente(Paciente paciente);
    List<Paciente> buscarPacientes(String termo);
    Paciente buscarPacientePorId(UUID id);
    Paciente atualizarPaciente(UUID id, Paciente paciente);
    void deletarPaciente(UUID id);
}
