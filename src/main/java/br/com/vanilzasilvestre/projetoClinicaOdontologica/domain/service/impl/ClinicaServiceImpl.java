package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.service.impl;

import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity.Clinica;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.exception.BadRequestCnpjException;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.exception.BadRequestContatoException;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.exception.NotFoundException;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.repository.ClinicaRepository;
import br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.service.ClinicaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class ClinicaServiceImpl implements ClinicaService {

    private final ClinicaRepository clinicaRepository;

    @Autowired
    public ClinicaServiceImpl(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    @Override
    public Clinica criarClinica(Clinica clinica) {
        boolean cnpjExiste = clinicaRepository.existsByCnpj(clinica.getCnpj());
        if (cnpjExiste){
            throw new BadRequestCnpjException(clinica.getCnpj());
        }
        if(clinica.getContato().getEmail() == null && clinica.getContato().getTelefone() == null) {
            throw new BadRequestContatoException();
        }

         return clinicaRepository.save(clinica);
    }

    @Override
    public List<Clinica> buscarClinicas(String termo) {
        return clinicaRepository.findByNomeStartingWith(termo);
    }

    @Override
    public Clinica buscarClinicaPorId(UUID id) {
        try {
            return clinicaRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new NotFoundException(id);
        }

    }

    @Override
    public Clinica atualizarClinica(UUID id, Clinica clinica) {
        try {
            clinicaRepository.findById(id).orElseThrow();;
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
        return clinicaRepository.save(clinica);
    }

    @Override
    public void deletarClinica(UUID id) {
        try {
            clinicaRepository.findById(id).orElseThrow();
            clinicaRepository.deleteById(id);
        } catch (Exception e){
            throw new NotFoundException(id);
        }

    }

}
