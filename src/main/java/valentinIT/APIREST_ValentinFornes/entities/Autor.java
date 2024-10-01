package valentinIT.APIREST_ValentinFornes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

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
    @Column(name = "biografia", length = 1500)
    private String bio;

}
