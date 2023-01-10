public class Turismo extends Auto{
  private int numPuertas;

    public Turismo(String marca, String modelo, double precioAlquiler, int numPuertas) {
        super(marca, modelo, precioAlquiler);
        setPuertas(numPuertas);
    }
    public void setPuertas(int numPuertas)
    {
        this.numPuertas=numPuertas;

    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void imprimirAtributos()
    {
        super.imprimirAtributos();
        System.out.println("Puertas: "+getNumPuertas());
    }




}
