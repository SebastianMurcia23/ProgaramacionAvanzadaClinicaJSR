package medical.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Paciente extends Cuenta{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int codigo;
private String fecha_nacimiento;
private String alergias;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL) // Mapeo bidireccional
    private List<Cita> citas;
}
