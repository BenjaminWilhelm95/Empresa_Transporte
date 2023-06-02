import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpresaTransporte empresa = new EmpresaTransporte();

        Bus bus1 = new Bus("ABC123", "Mercedes", "Modelo A");
        Conductor conductor1 = new Conductor("John", "Doe", "123456789", "A1");

        empresa.agregarBus(bus1);
        empresa.agregarConductor(conductor1);

        Viaje viaje1 = new Viaje("Ciudad A", "Ciudad B", "08:00", "12:00");

        bus1.agregarViaje(viaje1);

        List<Bus> buses = empresa.getBuses();
        List<Conductor> conductores = empresa.getConductores();

    }
}