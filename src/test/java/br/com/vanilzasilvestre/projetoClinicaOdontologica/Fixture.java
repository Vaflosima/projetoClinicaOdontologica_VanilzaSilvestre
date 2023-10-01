package br.com.vanilzasilvestre.projetoClinicaOdontologica;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.request.ContatoRequest;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.request.EnderecoRequest;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.api.dto.request.PacienteRequest;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.SexoEnum;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public final class Fixture {

    private static final Faker FAKER = new Faker(new Locale("pt", "BR"));

    public static class PacienteFake {

        public static PacienteRequest anyPaciente() {
            PacienteRequest request = new PacienteRequest();
            request.setNome(FAKER.rickAndMorty().character());
            request.setDataNascimento(LocalDate.now());
            request.setSexo(SexoEnum.M);
            ContatoRequest contatoRequest = new ContatoRequest();
            contatoRequest.setEmail(FAKER.internet().emailAddress());
            contatoRequest.setTelefone("(99) 9999-4444");
            request.setContato(contatoRequest);
            EnderecoRequest enderecoRequest = new EnderecoRequest();
            enderecoRequest.setLogradouro(FAKER.address().streetAddress());
            enderecoRequest.setBairro(FAKER.address().secondaryAddress());
            enderecoRequest.setCidade(FAKER.address().cityName());
            enderecoRequest.setEstado(FAKER.address().state());
            enderecoRequest.setCep(FAKER.address().zipCode());
            request.setEndereco(enderecoRequest);
            return request;
        }



    }

}
