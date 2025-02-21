//Viridiana Leal Ramos
//Herencia 1
package Herencia;

import java.util.Scanner;

public class Rectangulo extends Figura {
    private float lado2;

    public Rectangulo() {
        super();
        System.out.println("Creando rectangulo");
    }

    public void setLado2(float a) {
        lado2 = a;
    }

    public float getLado2() {
        return lado2;
    }

    public void calcularArea() {
        setArea(getLado() * getLado2());
    }

    public void calcularPerim() {
        setPerim(getLado() + getLado2() + getLado() + getLado2());
    }

    public void pedirDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa la medida de la base:");
        setLado(lee.nextFloat());
        System.out.println("Ingresa la medida de la altura:");
        setLado2(lee.nextFloat());
    }
}