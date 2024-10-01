package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Persona;
import valentinIT.APIREST_ValentinFornes.repositories.PersonaRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> {

    @Autowired
    private PersonaRepository personarepository;

    public PersonaServiceImpl(RepositorioBase<Persona, Long> repositorioBase) {
        super(repositorioBase);
    }

    @Override
    public List<Persona> search(String filtro)
}
