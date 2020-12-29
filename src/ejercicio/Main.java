package ejercicio;

public class Main {

	     public static void main(String[] args) {
	         Concesionario concesionario = new Concesionario();
	         Automovil peugeot206 = new Automovil("Peugeot", "206", 200000, 4);
	         Moto hondaTitan = new Moto("Honda", "Titan", 60000, "125cc");
	         Automovil peugeot208 = new Automovil("Peugeot", "208", 250000, 5);
	         Moto yamahaYbr = new Moto("Yamaha", "YBR", 80500.50, "160cc");
	         concesionario.agregarVehiculo(peugeot206);
	         concesionario.agregarVehiculo(hondaTitan);
	         concesionario.agregarVehiculo(peugeot208);
	         concesionario.agregarVehiculo(yamahaYbr);
	         System.out.println(concesionario);
	     }
	 }