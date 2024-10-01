package valentinIT.APIREST_ValentinFornes.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import valentinIT.APIREST_ValentinFornes.entities.Libro;
import valentinIT.APIREST_ValentinFornes.services.LibroServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
