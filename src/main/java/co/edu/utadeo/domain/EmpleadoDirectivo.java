package co.edu.utadeo.domain;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class EmpleadoDirectivo  extends  Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String universidad;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @OneToMany(mappedBy = "empleadoDirectivo")
    private List<Pabellon> pabellon;

    @OneToMany(mappedBy = "empleadoDirectivo")
    private List<Eventos> eventos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoDirectivo that = (EmpleadoDirectivo) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "EmpleadoDirectivo{" +
                "id=" + id +
                ", universidad='" + universidad + '\'' +
                ", pabellon=" + pabellon +
                ", eventos=" + eventos +
                '}';
    }
}

