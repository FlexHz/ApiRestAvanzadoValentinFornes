package valentinIT.APIREST_ValentinFornes.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Audited
public class Domicilio extends EntidadBase {

    @Column
    private String calle;

    @Column
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn (name = "fk_localidad")
    private Localidad localidad;

}
