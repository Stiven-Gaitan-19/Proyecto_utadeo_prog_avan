package co.edu.utadeo.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="empleado_raso")
@PrimaryKeyJoinColumn(name = "carnet")
public class EmpleadoRaso extends Empleado{

    @OneToMany(mappedBy = "empleadoRaso")
    private List<Pabellon> pabellones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Evento evento;

    public List<Pabellon> getPabellones() {
        return pabellones;
    }

    public void setPabellones(List<Pabellon> pabellones) {
        this.pabellones = pabellones;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EmpleadoRaso{" +
                "carnet=" + getCarnet()+
                ", nombre='" + getNombre() + '\'' +
                ", celular=" + getCelular() +
                ", paga=" + getPaga() +
                '}';
    }
}



