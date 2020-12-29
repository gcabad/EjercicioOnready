package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Concesionario {

	private boolean listaOrdenada;
	private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		this.listaDeVehiculos.add(nuevoVehiculo);
		this.listaOrdenada = false;
	}

	public void ordenarListaDeVehiculos() {
		if (!listaOrdenada) {
			Collections.sort(this.listaDeVehiculos);
			this.listaOrdenada = true;
		}
	}

	public String getVehiculoMasCaro() {
		if (listaDeVehiculos.size() > 0) {
			ordenarListaDeVehiculos();
			return listaDeVehiculos.get(0).getMarcaYModelo();
		}
		return "No hay vehiculos en la lista";
	}

	public String getVehiculoMasBarato() {
		if (listaDeVehiculos.size() > 0) {
			ordenarListaDeVehiculos();
			return listaDeVehiculos.get(listaDeVehiculos.size() - 1).getMarcaYModelo();
		}
		return "No hay vehiculos en la lista";
	}

	private String getDescripcionDeVehiculos() {
		String descripcion = "";
		Iterator<Vehiculo> i = listaDeVehiculos.iterator();
		while (i.hasNext()) {
			descripcion += i.next().toString() + "\n";
		}
		return descripcion;
	}

	public String getVehiculoQueContieneEnElModeloLaLetra(String letra) {
		if (listaDeVehiculos.size() > 0) {
			for (Vehiculo vehiculoActual : listaDeVehiculos) {
				if (vehiculoActual.getModelo().toLowerCase().contains(letra)) {
					return vehiculoActual.getMarca() + " " + vehiculoActual.getModelo() + " "
							+ vehiculoActual.getPrecioCurrencyFormat();
				}
			}
			return "No hay vehiculos que contengan la letra " + letra + " en el modelo.";
		}
		return "No hay vehiculos en la lista";
	}

	public ArrayList<Vehiculo> getListaDeVehiculos() {
		return listaDeVehiculos;
	}

	@Override
	public String toString() {
		String stringDeSalida = getDescripcionDeVehiculos();
		stringDeSalida += "=============================\n";
		stringDeSalida += "Vehículo más caro: " + getVehiculoMasCaro() + "\n";
		stringDeSalida += "Vehículo más barato: " + getVehiculoMasBarato() + "\n";
		stringDeSalida += "Vehículo que contiene en el modelo la letra ‘Y’: "
				+ getVehiculoQueContieneEnElModeloLaLetra("y") + "\n";
		stringDeSalida += "=============================\n";
		stringDeSalida += "Vehículos ordenados por precio de mayor a menor:";
		for (Vehiculo vehiculoActual : this.listaDeVehiculos) {
			stringDeSalida += "\n" + vehiculoActual.getMarcaYModelo();
		}
		return stringDeSalida;
	}

}
