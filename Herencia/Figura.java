//Viridiana Leal Ramos
//Herrencia 1
package Herencia;

public class Figura {
    private float area, perim, lado;

    public Figura() {
        super();
        System.out.println("Creando figura");
    }

    public void setArea(float a) {
        area = a;
    }

    public void setPerim(float a) {
        perim = a;
    }

    public void setLado(float a) {
        lado = a;
    }

    public float getArea() {
        return area;
    }

    public float getPerim() {
        return perim;
    }

    public float getLado() {
        return lado;
    }

    public String toString() {
        String cad = "\nPerimetro: " + perim;
        cad += "\nArea: " + area;
        return cad;
    }

}
