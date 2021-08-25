package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero_musical")
public class GeneroMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 15, unique = true, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "generoMusical")
    private List<Artista> artistas;

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

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneroMusical that = (GeneroMusical) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "GeneroMusical{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", artistas=" + artistas +
                '}';
    }
}
