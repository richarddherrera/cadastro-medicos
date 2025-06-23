package med.voll.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotNull
        String telefone,

        /*@NotNull
        @Pattern(regexp = "\\d{11}")
        String cpf,*/

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
