//Viridiana Leal Ramos
//Herencia 1

package Herencia;

public class Principal {

    public static void main(String[] args) {
        Rectangulo obj = new Rectangulo();
        obj.pedirDatos();
        obj.calcularArea();
        obj.calcularPerim();
        System.out.println(obj);

        Triangulo obj2 = new Triangulo();
        obj2.pedirDatos();
        obj2.calcularArea();
        obj2.calcularPerim();
        System.out.println(obj2);

        Circulo obj3 = new Circulo();
        obj3.pedirDatos();
        obj3.calcularArea();
        obj3.calcularPerim();
        System.out.println(obj3);

        Poligono obj4 = new Poligono();
        obj4.pedirDatos();
        obj4.calcularArea();
        obj4.calcularPerim();
        System.out.println(obj4);
    }
}
