package ejercicio;

public class Automovil extends Vehiculo{

    private int puertas;
    
    public Automovil(String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public String toString(){
        return "Marca: " + super.getMarca() + " // "
                + "Modelo: " + super.getModelo() + " // "
                + "Puertas: " + getPuertas() + " // "
                + "Precio: " + getPrecioCurrencyFormat();
    }
    
}
