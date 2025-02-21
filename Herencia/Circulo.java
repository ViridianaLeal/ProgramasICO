//Viridiana Leal Ramos
//Programa Herencia 1
//Clases padres y madres
package Herencia;

import java.util.*;

public class Circulo extends Figura {

    public Circulo() {
        super();
        System.out.println("Creando Circulo...");
    }

    public void calcularArea() {
        setArea(((float) Math.PI * getLado()) / 2);
    }

    public void calcularPerim() {
        setPerim((float) Math.PI * getLado() * 2);
    }

    public void pedirDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa radio del circulo:");
        setLado(lee.nextFloat());
    }
}