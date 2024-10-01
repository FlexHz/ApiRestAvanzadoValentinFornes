package valentinIT.APIREST_ValentinFornes.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import valentinIT.APIREST_ValentinFornes.entities.Persona;

import java.util.List;

@Repository
public interface PersonaRepository extends RepositorioBase<Persona, Long> {
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    List<Persona> search(String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    Page<Persona> search(String filtro, Pageable pageable);
}
