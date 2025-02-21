package Herencia3;

import java.util.Scanner;

public class Vehiculo{

private String marca,modelo;

public Vehiculo(){
    System.out.println("Vehiculo");
}

public void setMarca(String marca){
    this.marca=marca;
}

public void setModelo(String modelo){
    this.modelo=modelo;
}

public String getMarca(){
    return marca;
}

public String getModelo(){
    return modelo;
}

public String toString(){
    String cad="\nMarca: "+getMarca();
    cad+="\nModelo: "+getModelo();
    return cad;
}

public void encender(){
    System.out.println("Encendiendo vehiculo");
}

public void apagar(){
    System.out.println("Apagando vehiculo");
}

public void pedirDatos(){
    Scanner lee=new Scanner(System.in);
    System.out.println("\nIngresa los datos del vehiculo");
    System.out.println("Marca:");
    setMarca(lee.nextLine());
    System.out.println("Modelo:");
    setModelo(lee.nextLine());
}

}