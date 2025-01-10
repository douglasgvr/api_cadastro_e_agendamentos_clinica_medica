package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {


    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
