package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 3)
    private Integer id;

    @Column(length = 30, unique = true, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "pais")
    private List<Agencia> agencias;

    @OneToMany(mappedBy = "pais")
    private List<Modelo> modelos;

    @OneToMany(mappedBy = "pais")
    private List<Disenador> diseñadores;

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

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public List<Disenador> getDiseñadores() {
        return diseñadores;
    }

    public void setDiseñadores(List<Disenador> diseñadores) {
        this.diseñadores = diseñadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pais pais = (Pais) o;

        return id != null ? id.equals(pais.id) : pais.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
