package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Disenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false)
    private Integer pasaporte;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pais pais;

    @OneToMany(mappedBy = "disenador")
    private List<Desfile> desfiles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Integer pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Desfile> getDesfiles() {
        return desfiles;
    }

    public void setDesfiles(List<Desfile> desfiles) {
        this.desfiles = desfiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disenador disenador = (Disenador) o;
        return id.equals(disenador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Diseñador{" +
                "id=" + id +
                ", pasaporte=" + pasaporte +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

