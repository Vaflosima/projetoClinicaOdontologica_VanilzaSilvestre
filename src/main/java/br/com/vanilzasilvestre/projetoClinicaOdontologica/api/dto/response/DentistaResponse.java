package br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.response;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Clinica;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.EspecialdiadeEnum;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.SexoEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class DentistaResponse {

    private UUID id;
    private String nome;
    private String cro;
    private LocalDate dataNascimento;
    private EspecialdiadeEnum especialidade;
    private SexoEnum sexo;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private ContatoResponse contato;
    private Set<Clinica> clinicasDentistas;

}
