//Viridiana Leal Ramos
//Herencia 4- Clase Negocio
//Con lo visto en la clase realizar de tarea el mapa de relación de clases
package Herencia4;
import java.util.Scanner;

public class Proveedor extends Negocio{

    private String nombreP;

    public Proveedor(){
        System.out.println("\nProveedor");
    }

    public void setNombreP(String a){
        nombreP=a;
    }

    public String getNombreP(){
        return nombreP;
    }

    public void registrar(){
        Scanner lee=new Scanner(System.in);
        super.registrar();
        System.out.println("Registrar datos del proveedor");
        System.out.println("Nombre proveedor: ");
        setNombreP(lee.nextLine());
    } 

    public void suministrarProductos(){
        System.out.println("Suministrar productos");
    }

    public void generarFactura(){
        System.out.println("Generando factura de "+getNombre());
    }

    public String toString(){
        String cad=super.toString();
        cad+="\nNombre proveedor: "+getNombreP();
        return cad;
    }
    
}
