package med.voll.api.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.DTO.DadosCadastroMedico;
import med.voll.api.DTO.DadosListagemMedico;
import med.voll.api.Entities.Medico;
import med.voll.api.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){ // @Valid necessario para se integrar com o BeanValidation
        medicoRepository.save(new Medico(dados));

    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao){ // Importar pageable do spring
        return medicoRepository.findAll(paginacao).map(DadosListagemMedico::new);
    }

}
