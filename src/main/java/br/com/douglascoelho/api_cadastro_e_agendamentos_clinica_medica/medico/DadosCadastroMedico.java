package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico;

import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public record DadosCadastroMedico(
        @NotNull
        @NotBlank
        String nome,

        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
