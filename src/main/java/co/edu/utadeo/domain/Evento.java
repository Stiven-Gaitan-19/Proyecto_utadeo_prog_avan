package co.edu.utadeo.domain;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Evento {
    @Id
    @Column(length = 10)
    private Integer code;

    @Column(length = 150, nullable = false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaFin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private EmpleadoDirectivo empleadoDirectivo;

    @OneToMany(mappedBy = "evento")
    private List<EmpleadoRaso> empleadoRasos;

    @OneToMany(mappedBy = "evento")
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EmpleadoDirectivo getEmpleadoDirectivo() {
        return empleadoDirectivo;
    }

    public void setEmpleadoDirectivo(EmpleadoDirectivo empleadoDirectivo) {
        this.empleadoDirectivo = empleadoDirectivo;
    }

    public List<EmpleadoRaso> getEmpleadoRasos() {
        return empleadoRasos;
    }

    public void setEmpleadoRasos(List<EmpleadoRaso> empleadoRasos) {
        this.empleadoRasos = empleadoRasos;
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
        Evento eventos = (Evento) o;
        return code.equals(eventos.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "code=" + code +
                ", nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}

