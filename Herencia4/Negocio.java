//Viridiana Leal Ramos
//Herencia 4- Clase Negocio
//Con lo visto en la clase realizar de tarea el mapa de relación de clases
package Herencia4;

import java.util.Scanner;

public class Negocio {
    private String nombre, direccion;

    public Negocio() {
        System.out.println("\nNegocio");
    }

    public void setNombre(String a) {
        nombre = a;
    }

    public void setDirección(String a) {
        direccion = a;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void registrar() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Registrar datos");
        System.out.println("Nombre del negocio: ");
        setNombre(lee.nextLine());
        System.out.println("Dirección:");
        setDirección(lee.nextLine());
    }

    public void generarReporte() {
        System.out.println("Generando reporte de compra...");
    }

    public String toString() {
        String cad = "\nNombre:" + getNombre();
        cad += "\nDirección:" + getDireccion();
        cad += "\n--------------------------------";
        return cad;
    }

}
