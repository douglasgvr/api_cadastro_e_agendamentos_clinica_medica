package br.com.douglascoelho.api_cadastro_e_agendamentos_clinica_medica.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@Embeddable
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public Endereco() {
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        this.logradouro = dados.logradouro() != null ? dados.logradouro() : this.logradouro;
        this.bairro = dados.bairro() != null ? dados.bairro() : this.bairro;
        this.cep = dados.cep() != null ? dados.cep() : this.cep;
        this.uf = dados.uf() != null ? dados.uf() : this.uf;
        this.cidade = dados.cidade() != null ? dados.cidade() : this.cidade;
        this.numero = dados.numero() != null ? dados.numero() : this.numero;
        this.complemento = dados.complemento() != null ? dados.complemento() : this.complemento;
    }

}
