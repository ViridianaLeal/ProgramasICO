//Viridiana Leal Ramos
//Herencia 4- Clase Negocio
//Con lo visto en la clase realizar de tarea el mapa de relación de clases
package Herencia4;

import java.util.Scanner;

public class Cliente extends Negocio {
    private String nombreC;
    private int telefono;

    public Cliente() {
        System.out.println("\nCliente");
    }

    public void setNombreC(String a) {
        nombreC = a;
    }

    public void setTelefono(int a) {
        telefono = a;
    }

    public String getNombreC() {
        return nombreC;
    }

    public int getTelefono() {
        return telefono;
    }

    public void RealizarPedido() {
        System.out.println("Realizando pedido...");
    }

    public void pedirDatos() {
        Scanner lee = new Scanner(System.in);
        super.registrar();
        System.out.println("Datos del cliente");
        System.out.println("Nombre: ");
        setNombreC(lee.nextLine());
        System.out.println("Telefono: ");
        setTelefono(lee.nextInt());
    }

    public String toString() {
        String cad = super.toString();
        cad += "\nNombre del cliente: " + getNombreC();
        cad += "\nTelefono: " + getTelefono();
        cad +="\n-------------------------------";
        return cad;
    }

}
