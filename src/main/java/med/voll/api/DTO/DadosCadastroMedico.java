package med.voll.api.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.Enums.Especialidade;

public record DadosCadastroMedico(

        @NotBlank
        String nome,

        @NotBlank
        @Email // Seguir padrão email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // De 4 a 6 dígitos
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid // Valida tudo dentro até o outro objeto dentro
        DadosEndereco endereco) {
}
