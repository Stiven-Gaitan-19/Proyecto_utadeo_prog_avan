package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Coleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 2)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "coleccion")
    private List<Desfile> desfiles;

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

    public List<Desfile> getDesfiles() {
        return desfiles;
    }

    public void setDesfiles(List<Desfile> desfiles) {
        this.desfiles = desfiles;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
