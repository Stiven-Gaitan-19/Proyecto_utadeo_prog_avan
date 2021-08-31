package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Desfile {

    @Id
    @Column(length = 10)
    private Integer code;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Evento evento;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Disenador disenador;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pabellon pabellon;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Artista artista;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Coleccion coleccion;
    @OneToMany(mappedBy = "desfile")
    private List<Aparicion> apariciones;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Disenador getDisenador() {
        return disenador;
    }

    public void setDisenador(Disenador disenador) {
        this.disenador = disenador;
    }

    public Pabellon getPabellon() {
        return pabellon;
    }

    public void setPabellon(Pabellon pabellon) {
        this.pabellon = pabellon;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public List<Aparicion> getApariciones() {
        return apariciones;
    }

    public void setApariciones(List<Aparicion> apariciones) {
        this.apariciones = apariciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desfile desfile = (Desfile) o;
        return code.equals(desfile.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Desfile{" +
                "code=" + code +
                ", fecha=" + fecha +
                '}';
    }
}
