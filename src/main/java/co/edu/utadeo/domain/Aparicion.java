package co.edu.utadeo.domain;

import javax.persistence.*;

@Entity
@Table
public class Aparicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 500, nullable = false)
    private String prenda;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Modelo modelo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Desfile desfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Desfile getDesfile() {
        return desfile;
    }

    public void setDesfile(Desfile desfile) {
        this.desfile = desfile;
    }

    @Override
    public String toString() {
        return "Aparicion{" +
                "id=" + id +
                ", prenda='" + prenda + '\'' +
                '}';
    }
}
