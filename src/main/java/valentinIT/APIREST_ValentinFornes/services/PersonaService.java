package valentinIT.APIREST_ValentinFornes.services;

import valentinIT.APIREST_ValentinFornes.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService <Persona, Long> {
    List<Persona> search(String filtro) throws Exception;
}
