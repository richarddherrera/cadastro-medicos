package med.voll.api.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.DTO.DadosAtualizacaoMedico;
import med.voll.api.DTO.DadosCadastroMedico;
import med.voll.api.DTO.DadosListagemMedico;
import med.voll.api.Entities.Medico;
import med.voll.api.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){ // Importar pageable do spring
        return medicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        var medico = medicoRepository.getReferenceById(dados.id());
        medico.atualizarDados(dados);
    }

    @DeleteMapping("/{id}") // Com parâmetro dinâmico
    @Transactional
    public void excluir(@PathVariable Long id){ // Pega o numero da url e coloque ele como parâmetro
        var medico = medicoRepository.getReferenceById(id);
        medico.excluir();
    }

}
