package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.repository;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, UUID> {
    List<Paciente> findByNomeStartingWith(String termo);
}
