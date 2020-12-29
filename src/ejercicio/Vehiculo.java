package ejercicio;

import java.text.NumberFormat;

class Vehiculo implements Comparable<Vehiculo>{

    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public String getMarcaYModelo() {
        return marca + " " + modelo;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public String getPrecioCurrencyFormat(){
        NumberFormat formatoDePrecio = NumberFormat.getCurrencyInstance();
        String precioVehiculo = formatoDePrecio.format(this.precio).replaceFirst("\\u00A0", "");
        return precioVehiculo;
    }

    @Override
    public int compareTo(Vehiculo v) {
        int result=0;
        if (this.precio < v.getPrecio()) {
        	result = 1;
        } else if (this.precio > v.getPrecio()) {
        	result = -1;
        }
        return result;
    }
    
}
