package valentinIT.APIREST_ValentinFornes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import valentinIT.APIREST_ValentinFornes.entities.EntidadBase;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositorioBase<E extends EntidadBase, ID extends Serializable> extends JpaRepository<E, ID> {

}
