package valentinIT.APIREST_ValentinFornes;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import valentinIT.APIREST_ValentinFornes.entities.Autor;
import valentinIT.APIREST_ValentinFornes.entities.Domicilio;
import valentinIT.APIREST_ValentinFornes.entities.Localidad;
import valentinIT.APIREST_ValentinFornes.entities.Persona;
import valentinIT.APIREST_ValentinFornes.repositories.AutorRepository;
import valentinIT.APIREST_ValentinFornes.repositories.LocalidadRepository;
import valentinIT.APIREST_ValentinFornes.repositories.PersonaRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ApirestValentinFornesApplication {
    private static final Logger logger = LoggerFactory.getLogger(ApirestValentinFornesApplication.class);

    @Autowired
    private PersonaRepository personaRepository;
    private AutorRepository autorRepository;
    private LocalidadRepository localidadRepository;

    public static void main(String[] args) {
        SpringApplication.run(ApirestValentinFornesApplication.class, args);
        System.out.println("Arrancando Maquinola TUCUTUCUTUCU");
    }

    @Bean
    @Transactional
    CommandLineRunner init(PersonaRepository personaRepository, AutorRepository autorRepository, LocalidadRepository localidadRepository) {
        return args -> {
            // Creo un objeto persona
            Localidad loc1 = Localidad.builder().
                    denom("Guaymallen").
                    build();
            Localidad loc2 = Localidad.builder().
                    denom("Cuidad").
                    build();

            Persona per1 = Persona.builder().
                    nombre("Alberto").apellido("Cortez").
                    build();

            Domicilio dom1 = Domicilio.builder().
                    calle("Suipacha").
                    numero(239).build();

            dom1.setLocalidad(loc1);
            per1.setDomicilio(dom1);
            localidadRepository.save(loc1);
            personaRepository.save(per1);

            Persona per2 = Persona.builder().
                    nombre("Alicia").apellido("Calderon").
                    build();

            Domicilio dom2 = Domicilio.builder().
                    calle("Lulunta").
                    numero(339).build();

            dom2.setLocalidad(loc2);
            per2.setDomicilio(dom2);
            localidadRepository.save(loc2);
            personaRepository.save(per2);

            dom1.setCalle("Rodriguez");

            personaRepository.save(per1);


            //Creo un autor
            Autor aut1 = Autor.builder().
                    nombre("Jorge Luis").
                    apellido("Borges").
                    build();
            aut1.setBio("fue un escritor, poeta, ensayista y traductor argentino, extensamente considerado una figura clave tanto para la literatura en español como para la literatura universal");
            autorRepository.save(aut1);

        };

    };
}