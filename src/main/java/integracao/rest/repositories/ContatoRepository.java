package integracao.rest.repositories;

import integracao.rest.contatos.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
