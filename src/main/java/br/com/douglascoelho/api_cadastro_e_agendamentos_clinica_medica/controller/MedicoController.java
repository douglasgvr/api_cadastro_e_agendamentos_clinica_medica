package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.controller;


import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico.DadosCadastroMedico;
import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico.Medico;
import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}