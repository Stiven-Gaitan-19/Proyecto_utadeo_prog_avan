package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Artista {

    @Id
    private Integer code;

    @Column(length = 100, nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private GeneroMusical generoMusical;

    @OneToMany(mappedBy = "artista")
    private List<Desfile> desfiles;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
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

        Artista artista = (Artista) o;

        return code != null ? code.equals(artista.code) : artista.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "code=" + code +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
