package co.edu.utadeo.domain;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class EmpleadoRaso extends Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "empleadoRaso ")
    private List<Pabellon> pabellon;

    @OneToMany(mappedBy = "EmpleadoRaso ")
    private List<Eventos> eventos;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Eventos evento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoRaso that = (EmpleadoRaso) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "EmpleadoRaso{" +
                "id=" + id +
                ", pabellon=" + pabellon +
                ", eventos=" + eventos +
                ", eventos=" + eventos +
                '}';
    }
}



