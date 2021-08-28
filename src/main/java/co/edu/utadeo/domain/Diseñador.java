package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Diseñador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false)
    private Integer pasaporte;

    @Column(nullable = false)
    private String nombre;


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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pais pais;

    @OneToMany(mappedBy = "diseñador")
    private List<Desfile> desfiles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diseñador diseñador = (Diseñador) o;
        return id.equals(diseñador.id);
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
                ", pais=" + pais +
                ", desfiles=" + desfiles +
                '}';
    }
}

