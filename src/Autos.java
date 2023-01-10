import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autos {
    public static void main(String[] args) {
        String marca=" ";
        String modelo;
        Double precioAlquiler;
        Scanner sc=new Scanner(System.in);

        List listaVehiculos = new ArrayList();
        listaVehiculos.add(new Auto("Mercedes", "E", 55.0));
        listaVehiculos.add(new Turismo("Audi","a3",30,3));
        listaVehiculos.add(new Autobus("Toyota","w",200,5));
       imprimirElementosLista((ArrayList)listaVehiculos);
    }

    private static void imprimirElementosLista(ArrayList listaVehiculos) {
        for(int i=0;i<listaVehiculos.size();i++)
        {
            Auto a=(Auto) listaVehiculos.get(i);
            a.imprimirAtributos();
            System.out.println(" ");
        }
    }
}
