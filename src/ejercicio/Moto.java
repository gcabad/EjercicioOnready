package ejercicio;

public class Moto extends Vehiculo{

    String cilindrada;
    
    public Moto(String marca, String modelo, double precio, String cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString(){
        return "Marca: " + super.getMarca() + " // "
                + "Modelo: " + super.getModelo() + " // "
                + "Cilindrada: " + getCilindrada() + " // "
                + "Precio: " + getPrecioCurrencyFormat();
    }
    
}