package mx.uv.Aviones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String modelo;
    private String aerolinea;
    private Integer noAsientos;
    private String tipo;

    public Integer getId() {
        return id;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAerolinea() {
        return aerolinea;
    }
    public Integer getAsientos() {
        return noAsientos;
    }
    public String getTipo() {
        return tipo;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    public void setNoAsientos(Integer noAsientos) {
        this.noAsientos = noAsientos;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}