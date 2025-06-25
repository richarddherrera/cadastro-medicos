package med.voll.api.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DTO.DadosCadastroMedico;
import med.voll.api.Enums.Especialidade;

@Getter // Gerar os getters
@NoArgsConstructor // Gerar o construtor default
@AllArgsConstructor // Gerar o constutor que recebe todos argumentos
@EqualsAndHashCode (of = "id") // Gerar em cima do ID
@Table(name = "medicos") // Esta entidade esta sendo mapeada como tabela chamada "medicos"
@Entity(name = "Medico") // Mapeando uma entidade chamada "Medico"
public class Medico {

    @Id // Dizemos que o próximo atributo é um ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usamos uma estratégia para ele cuidar dos id e ordenar.
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String crm;

    // Dizendo que é enum
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

}
