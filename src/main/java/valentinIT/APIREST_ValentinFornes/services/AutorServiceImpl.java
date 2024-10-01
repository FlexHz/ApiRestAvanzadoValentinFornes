package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Autor;
import valentinIT.APIREST_ValentinFornes.repositories.AutorRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorrepository;

    public AutorServiceImpl(RepositorioBase<Autor, Long> repositorioBase) {

        super(repositorioBase);
    }

}
