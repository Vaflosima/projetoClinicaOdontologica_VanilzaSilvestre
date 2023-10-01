package br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.response.List;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ClinicaListResponse {

    private UUID id;
    private String nome;
    private String cnpj;

}
