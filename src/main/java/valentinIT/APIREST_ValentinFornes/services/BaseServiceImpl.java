package valentinIT.APIREST_ValentinFornes.services;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import valentinIT.APIREST_ValentinFornes.entities.EntidadBase;
import valentinIT.APIREST_ValentinFornes.repositories.RepositorioBase;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends EntidadBase, ID extends Serializable> implements BaseService<E, ID> {
    protected RepositorioBase<E, ID> repositorioBase;

    public BaseServiceImpl(RepositorioBase<E, ID> repositorioBase) {
        this.repositorioBase = repositorioBase;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entidades = repositorioBase.findAll();
            return entidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try {
            Page<E> entidades = repositorioBase.findAll(pageable);
            return entidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = repositorioBase.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = repositorioBase.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = repositorioBase.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = repositorioBase.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (repositorioBase.existsById(id)) {
                repositorioBase.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

