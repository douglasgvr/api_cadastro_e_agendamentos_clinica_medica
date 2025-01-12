package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.medico;

import br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {

        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }


    public void atualizarInformacoes(@Valid DadosAtualizarMedicos dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        };

        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        };

        if(dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        };
    }
}