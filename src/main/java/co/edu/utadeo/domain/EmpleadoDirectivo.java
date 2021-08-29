package co.edu.utadeo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado_directivo")
@PrimaryKeyJoinColumn(name = "carnet")
public class EmpleadoDirectivo  extends  Empleado{

    @Column(nullable = false)
    private String universidad;

    @OneToMany(mappedBy = "empleadoDirectivo")
    private List<Pabellon> pabellones;

    @OneToMany(mappedBy = "empleadoDirectivo")
    private List<Evento> eventos;

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public List<Pabellon> getPabellones() {
        return pabellones;
    }

    public void setPabellones(List<Pabellon> pabellones) {
        this.pabellones = pabellones;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "EmpleadoDirectivo{" +
                "universidad='" + universidad + '\'' +
                "carnet=" + getCarnet()+
                ", nombre='" + getNombre() + '\'' +
                ", celular=" + getCelular() +
                ", paga=" + getPaga() +
                '}';
    }
}

