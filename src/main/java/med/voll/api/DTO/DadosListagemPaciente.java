package med.voll.api.DTO;

import med.voll.api.Entities.Paciente;

public record DadosListagemPaciente(Long id,String nome, String email, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }

}
