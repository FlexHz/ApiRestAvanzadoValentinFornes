package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Libro;
import valentinIT.APIREST_ValentinFornes.repositories.LibroRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> {

    @Autowired
    private LibroRepository librorepository;

    public LibroServiceImpl(RepositorioBase <Libro, Long> repositorioBase) {

        super(repositorioBase);
    }

}
