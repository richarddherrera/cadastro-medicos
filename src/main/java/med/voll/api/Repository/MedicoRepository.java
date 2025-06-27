package med.voll.api.Repository;

import med.voll.api.Entities.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> { // TIPO da entidade // Tipo do atributo da chave primaria desta entidade

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);




}
