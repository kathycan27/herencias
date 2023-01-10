import java.sql.SQLOutput;

public class Auto {
    String marca;
    String modelo;
    Double precioAlquiler;

    public Auto(String marca, String modelo, Double precioAlquiler) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquiler = precioAlquiler;
    }

    public void imprimirAtributos() {
        System.out.println("Marca: "+getMarca()+" Modelo:  "+getModelo()+" Precio: "+getPrecioAlquiler());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
