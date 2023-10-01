package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.service;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Dentista;

import java.util.List;
import java.util.UUID;

public interface DentistaService {
    Dentista criarDentista(Dentista dentista);
    List<Dentista> buscarDentistas(String termo);
    Dentista buscarDentistaPorId(UUID id);
    Dentista atualizarDentista(UUID id, Dentista dentista);
    void deletarDentista(UUID id);
}
