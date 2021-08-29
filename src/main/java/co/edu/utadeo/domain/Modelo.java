package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 10, nullable = false)
    private Integer pasaporte;

    @Column(nullable = false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaNacimiento;

    @Column(length = 500)
    private String particularidades;

    @Column(length = 10, nullable = false)
    private Integer paga;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pais pais;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Agencia agencia;

    @OneToMany(mappedBy = "modelo")
    private List<Portafolio> portafolios;

    @OneToMany(mappedBy = "modelo")
    private List<Caracteristica> caracteristicas;

    @OneToMany(mappedBy = "modelo")
    private List<Aparicion> apariciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Integer pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getParticularidades() {
        return particularidades;
    }

    public void setParticularidades(String particularidades) {
        this.particularidades = particularidades;
    }

    public Integer getPaga() {
        return paga;
    }

    public void setPaga(Integer paga) {
        this.paga = paga;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<Portafolio> getPortafolios() {
        return portafolios;
    }

    public void setPortafolios(List<Portafolio> portafolios) {
        this.portafolios = portafolios;
    }

    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
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

        Modelo modelo = (Modelo) o;

        return id != null ? id.equals(modelo.id) : modelo.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", pasaporte=" + pasaporte +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", particularidades='" + particularidades + '\'' +
                ", paga=" + paga +
                '}';
    }
}
