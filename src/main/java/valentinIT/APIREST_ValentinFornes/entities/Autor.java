package valentinIT.APIREST_ValentinFornes.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "Persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Audited
public class Autor extends EntidadBase {

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column (name = "biografia", length = 1500)
    private String bio;

}
