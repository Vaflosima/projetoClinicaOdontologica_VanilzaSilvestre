package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.repository;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, UUID> {
}
