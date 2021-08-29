package co.edu.utadeo.domain;

import javax.persistence.*;

@Entity
@Table
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, unique = true, nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Portafolio portafolio;

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

    public Portafolio getPortafolio() {
        return portafolio;
    }

    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foto foto = (Foto) o;

        return id != null ? id.equals(foto.id) : foto.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
