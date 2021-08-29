package co.edu.utadeo.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carnet;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, length = 10)
    private String celular;

    @Column(length = 10, nullable = false)
    private Integer paga;

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getPaga() {
        return paga;
    }

    public void setPaga(Integer paga) {
        this.paga = paga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return carnet.equals(empleado.carnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carnet);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                ", celular=" + celular +
                ", paga=" + paga +
                '}';
    }
}
