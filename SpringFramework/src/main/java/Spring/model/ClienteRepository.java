package Spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Não é necessário nesse caso, mas para um melhor leitura foi incluso o @Repository
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}