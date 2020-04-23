package fischer.eduardo.exemplomysql.repository;

import fischer.eduardo.exemplomysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
