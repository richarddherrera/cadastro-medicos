package med.voll.api.Entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DTO.DadosAtualizacaoPaciente;
import med.voll.api.DTO.DadosCadastroPaciente;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity (name = "paciente")
@Table (name = "pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = true;
    }


    public void atualizarDados(@Valid DadosAtualizacaoPaciente dados) {
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarDados(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
