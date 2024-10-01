package valentinIT.APIREST_ValentinFornes.services;

import valentinIT.APIREST_ValentinFornes.entities.EntidadBase;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends EntidadBase, ID extends Serializable> {
    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;
}
