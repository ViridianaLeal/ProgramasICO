//Viridiana Leal Ramos 
//Herencia 1
package Herencia;

import java.util.Scanner;

public class Poligono extends Figura {
    private float n, apotema;

    public Poligono() {
        super();
        System.out.println("Creando poligono");
    }

    public void setN(float a) {
        n = a;
    }

    public void setApotema(float a) {
        apotema = a;
    }

    public float getN() {
        return n;
    }

    public float getApotema() {
        return apotema;
    }

    public void calcularArea() {
        setArea((float) (getPerim()*getApotema())/2);
    }

    public void calcularPerim() {
        setPerim(getLado() * getN());
    }

    public void pedirDatos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa la medida del apotema:");
        setLado(lee.nextFloat());
        System.out.println("Ingresa número de lados:");
        setN(lee.nextFloat());
    }
}