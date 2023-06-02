import java.util.ArrayList;
import java.util.List;
class EmpresaTransporte {
    private List<Bus> buses;
    private List<Conductor> conductores;

    public EmpresaTransporte() {
        buses = new ArrayList<>();
        conductores = new ArrayList<>();
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

}
