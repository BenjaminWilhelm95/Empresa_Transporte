import java.util.ArrayList;
import java.util.List;

class Bus {
    private String patente;
    private String marca;
    private String modelo;
    private List<Viaje> viajes;
    private Conductor conductor;

    public Bus(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        viajes = new ArrayList<>();
    }

    public void agregarViaje(Viaje viaje) {
        viajes.add(viaje);
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

}