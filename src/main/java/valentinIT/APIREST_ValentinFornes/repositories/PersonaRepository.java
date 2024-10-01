package valentinIT.APIREST_ValentinFornes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import valentinIT.APIREST_ValentinFornes.entities.Persona;

import java.util.List;

@Repository
public interface PersonaRepository extends RepositorioBase<Persona, Long> {

    List<Persona> fingByNombreContainingOrApellidoContaining(String nombre, String apellido);
    @Query (value = "SELECT p FROM persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?1%")
    List<Persona> search(String filtro);

    @Query(
        value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);
}
