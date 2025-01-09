package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico;

import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
