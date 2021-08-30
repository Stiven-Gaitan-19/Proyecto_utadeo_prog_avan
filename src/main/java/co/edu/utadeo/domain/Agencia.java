package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Agencia {

    @Id
    @Column(length = 10)
    private Integer code;

    @Column(length = 150, nullable = false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date a�oCreacion;

    @Column(unique = true, nullable = false)
    private String correo;

    @Column(nullable = false)
    private String due�o;

    @Column(nullable = false)
    private String agenciaPadre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pais pais;

    @OneToMany(mappedBy = "agencia")
    private List<Modelo> modelos;

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

    public Date getA�oCreacion() {
        return a�oCreacion;
    }

    public void setA�oCreacion(Date a�oCreacion) {
        this.a�oCreacion = a�oCreacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDue�o() {
        return due�o;
    }

    public void setDue�o(String due�o) {
        this.due�o = due�o;
    }

    public String getAgenciaPadre() {
        return agenciaPadre;
    }

    public void setAgenciaPadre(String agenciaPadre) {
        this.agenciaPadre = agenciaPadre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agencia agencia = (Agencia) o;

        return code != null ? code.equals(agencia.code) : agencia.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "code=" + code +
                ", nombre='" + nombre + '\'' +
                ", a�oCreacion=" + a�oCreacion +
                ", correo='" + correo + '\'' +
                ", due�o='" + due�o + '\'' +
                ", agenciaPadre='" + agenciaPadre + '\'' +
                '}';
    }
}
