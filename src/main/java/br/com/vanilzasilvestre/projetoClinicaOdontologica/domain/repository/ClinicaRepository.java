package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.repository;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, UUID> {
    boolean existsByCnpj(String cnpj);
    List<Clinica> findByNomeStartingWith(String termo);

}
