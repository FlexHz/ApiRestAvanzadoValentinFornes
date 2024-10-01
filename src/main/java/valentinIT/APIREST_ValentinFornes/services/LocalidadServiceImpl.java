package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Localidad;
import valentinIT.APIREST_ValentinFornes.repositories.LocalidadRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    public LocalidadServiceImpl(RepositorioBase <Localidad, Long> repositorioBase) {

        super(repositorioBase);
    }

}
