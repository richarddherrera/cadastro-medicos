package med.voll.api.Entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // Gerar os getters
@NoArgsConstructor // Gerar o construtor default
@AllArgsConstructor // Gerar o constutor que recebe todos argumentos

@Embeddable
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
}
