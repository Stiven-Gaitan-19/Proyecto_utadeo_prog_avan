package co.edu.utadeo.domain;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Pabellon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(length = 10, nullable = false)
    private String telefono;

    @OneToMany(mappedBy = "pabellon")
    private List<Desfile> desfiles;

    @ManyToOne(fetch = FetchType.LAZY)
    private EmpleadoDirectivo empleadoDirectivo;

    @ManyToOne(fetch = FetchType.LAZY)
    private EmpleadoRaso empleadoRaso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Desfile> getDesfiles() {
        return desfiles;
    }

    public void setDesfiles(List<Desfile> desfiles) {
        this.desfiles = desfiles;
    }

    public EmpleadoDirectivo getEmpleadoDirectivo() {
        return empleadoDirectivo;
    }

    public void setEmpleadoDirectivo(EmpleadoDirectivo empleadoDirectivo) {
        this.empleadoDirectivo = empleadoDirectivo;
    }

    public EmpleadoRaso getEmpleadoRaso() {
        return empleadoRaso;
    }

    public void setEmpleadoRaso(EmpleadoRaso empleadoRaso) {
        this.empleadoRaso = empleadoRaso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pabellon pabellon = (Pabellon) o;
        return id.equals(pabellon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pabellon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
