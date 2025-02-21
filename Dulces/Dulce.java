//PROGRAMA 1: Clase Dulce con 3 metodos y 3 atributos
//Uriel Pérez Alcántara y Viridiana Leal Ramos

package Dulces;
import java.util.Scanner;
public class Dulce{
    //Atributos
    private String nombre,marca;
    private float precio;
    Scanner x = new Scanner(System.in);
    //Set y Get
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }
    public String getMarca(){
        return marca;
    }
    public float getPrecio(){
        return precio;
    }

    //Métodos
    public void pedirDatos(){
        System.out.println("\tINGRESE LOS DATOS QUE SE LE SOLICITAN!");
        System.out.print("\tNOMBRE: ");
        setNombre(x.nextLine());
        System.out.print("\tMARCA: ");
        setMarca(x.nextLine());
        System.out.print("\tPRECIO: ");
        setPrecio(x.nextFloat());
    }
    public String toString(){
        String cad= "\n\tNOMBRE: "+ getNombre();
        cad+= "\n\tMARCA: "+getMarca();
        cad+= "\n\tPRECIO: "+getPrecio();
        return cad;
    }
    public float venderDulce(float total){
        System.out.print("\n\tINGRESE LA CANTIDAD DEL DULCE QUE QUIERA COMPRAR:");
        int cantidad = x.nextInt();
        total = getPrecio()*cantidad;
        System.out.println("\tEL PRECIO TOTAL A PAGAR POR LA COMPRA DE "+cantidad+" DULCES ES: $"+total);
        return total;
    }
}