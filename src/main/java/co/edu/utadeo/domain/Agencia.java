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
    private Date añoCreacion;

    @Column(unique = true, nullable = false)
    private String correo;

    @Column(nullable = false)
    private String dueño;

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

    public Date getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(Date añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
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
                ", añoCreacion=" + añoCreacion +
                ", correo='" + correo + '\'' +
                ", dueño='" + dueño + '\'' +
                ", agenciaPadre='" + agenciaPadre + '\'' +
                ", pais=" + pais +
                ", modelos=" + modelos +
                '}';
    }
}
