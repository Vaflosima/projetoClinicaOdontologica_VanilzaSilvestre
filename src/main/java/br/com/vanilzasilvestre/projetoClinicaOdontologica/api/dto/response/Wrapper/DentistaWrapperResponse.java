package br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.response.Wrapper;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.response.List.DentistaListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DentistaWrapperResponse {
    private List<DentistaListResponse> dentistas;
}
