package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Portafolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String objetivo;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date añoCreacion;

    @OneToMany(mappedBy = "portafolio")
    private List<Foto> fotos;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Modelo modelo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(Date añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Portafolio that = (Portafolio) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Portafolio{" +
                "id=" + id +
                ", objetivo='" + objetivo + '\'' +
                ", añoCreacion=" + añoCreacion +
                '}';
    }
}
