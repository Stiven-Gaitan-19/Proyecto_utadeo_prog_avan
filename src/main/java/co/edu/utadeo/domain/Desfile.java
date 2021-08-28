package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Desfile {

    @Id
    @Column(length = 10)
    private Integer code;


    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Eventos eventos;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Diseñador diseñador;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pabellon pabellon;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Artista artista;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Coleccion  coleccion;

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
