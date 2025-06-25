package med.voll.api.DTO;

import med.voll.api.Entities.Medico;
import med.voll.api.Enums.Especialidade;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {


    public DadosListagemMedico (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
