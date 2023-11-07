import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList();
        Vehiculo moto = new Moto(1, "1111-JHG", "Honda", "Honda RC500", 2005, 8000.0, 500, "Combustión");
        Vehiculo auto = new Auto(2, "2839-FHG", "Tesla", "Tesla Model 3", 2020, 50000.0, 170, 629);
        Vehiculo camioneta = new Camioneta(3, "8392-GHF", "Nissan", "Nissan C5000", 1998, 12000.0, 70, 8.0);
        vehiculos.add(moto);
        vehiculos.add(auto);
        vehiculos.add(camioneta);
        Iterator var5 = vehiculos.iterator();

        while(true) {
            while(var5.hasNext()) {
                Vehiculo vehiculo = (Vehiculo)var5.next();
                PrintStream var10000 = System.out;
                String var10001 = vehiculo.toString();
                var10000.println(var10001 + ", Antiguedad vehículo = " + vehiculo.antiguedadVehiculo());
                if (!vehiculo.getClass().getName().equals("Moto") && !vehiculo.getClass().getName().equals("Camioneta")) {
                    ((Electrico)vehiculo).cargarEnergia();
                } else {
                    ((Combustion)vehiculo).recargarCombustible();
                }
            }

            return;
        }
    }
}
