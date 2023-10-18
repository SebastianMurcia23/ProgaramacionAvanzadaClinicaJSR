package medical.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario extends Cuenta implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private int cedula;
    private String nombre;
    private int telefono;
    private String url_foto;

}
