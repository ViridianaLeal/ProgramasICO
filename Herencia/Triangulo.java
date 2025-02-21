//Viridiana Leal Ramos
//Herencia 1

package Herencia;

import java.util.*;
import java.util.Scanner;

public class Triangulo extends Figura {
    private float lado2, lado3;

    public Triangulo() {
        super();
        System.out.println("Creando rectangulo");
    }

    public void setLado2(float a) {
        lado2 = a;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado3(float a) {
        lado3 = a;
    }

    public float getLado3() {
        return lado3;
    }

    public void calcularArea() {
        float s = (getLado() + getLado2() + getLado3()) / 2;
        setArea((float) Math.sqrt(s * (s - getLado()) * (s - getLado2()) * (s - getLado3())));
    }

    public void calcularPerim() {
        setPerim(getLado() + getLado2() + getLado3());
    }

    public void pedirDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa lado 1:");
        setLado(lee.nextFloat());
        System.out.println("Ingresa lado 2:");
        setLado2(lee.nextFloat());
        System.out.println("Ingresa lado 3:");
        setLado3(lee.nextFloat());
    }
}