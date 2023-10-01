package br.com.vanilzasilvestre.projetoClinicaOdontologica.api.handler;

public record Problema(Integer status,
                       String message,
                       String detail) {
}
