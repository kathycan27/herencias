public class Autobus extends Auto{
    private int numPlazas;
    public  Autobus(String marca, String modelo, double precioAlquiler, int numPlazas){

        super(marca, modelo, precioAlquiler);
        setPlazas(numPlazas);
    }
    public void setPlazas(int numPlazas)
    {
        this.numPlazas=numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void imprimirAtributos()
    {
        super.imprimirAtributos();
        System.out.println("Numero de lugares: "+getNumPlazas());
    }

}
