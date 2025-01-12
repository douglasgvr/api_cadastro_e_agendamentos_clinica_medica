package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico;

import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedicos(@NotNull Long id,
                                    String nome,
                                    String telefone,
                                    DadosEndereco endereco) {

}
