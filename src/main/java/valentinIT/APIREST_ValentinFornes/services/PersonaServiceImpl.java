package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Persona;
import valentinIT.APIREST_ValentinFornes.repositories.PersonaRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personarepository;

    public PersonaServiceImpl(RepositorioBase<Persona, Long> repositorioBase) {
        super(repositorioBase);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personarepository.search(filtro);
            return personas;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personarepository.search(filtro, pageable);
            return personas;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
