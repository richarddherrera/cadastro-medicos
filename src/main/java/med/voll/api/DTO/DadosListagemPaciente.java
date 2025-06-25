package med.voll.api.DTO;

import med.voll.api.Entities.Paciente;

public record DadosListagemPaciente(String nome, String email, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }

}
