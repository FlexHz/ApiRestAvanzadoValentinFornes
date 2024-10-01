package valentinIT.APIREST_ValentinFornes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valentinIT.APIREST_ValentinFornes.entities.Domicilio;
import valentinIT.APIREST_ValentinFornes.repositories.DomicilioRepository;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> {

    @Autowired
    private DomicilioRepository domiciliorepository;

    public DomicilioServiceImpl(RepositorioBase<Domicilio, Long> repositorioBase) {
        super(repositorioBase);
    }

}
