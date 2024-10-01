package valentinIT.APIREST_ValentinFornes.controllers;


import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import valentinIT.APIREST_ValentinFornes.entities.EntidadBase;

import java.io.Serializable;

public interface BaseController<E extends EntidadBase, ID extends Serializable> {
    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getAll(Pageable pageable);

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entidad);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entidad);

    public ResponseEntity<?> delete(@PathVariable ID id);

}
