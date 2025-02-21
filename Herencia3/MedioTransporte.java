package Herencia3;

import java.util.Scanner;

public class MedioTransporte extends Vehiculo{
    private int numAsientos;

    public MedioTransporte(){
        System.out.println("Medio de Transporte");
    }

    public void setNumAsientos(int numAsientos){
        this.numAsientos=numAsientos;
    }

    public int getNumAsientos(){
        return numAsientos;
    }

    public void transportar(){
        System.out.println("Transportando...");
    }

    public void frenar(){
        System.out.println("Frenar...");
    }

    public void pedirDatos(){
        Scanner lee=new Scanner(System.in);
        super.pedirDatos();
        System.out.println("Número de asientos");
        setNumAsientos(lee.nextInt());
    }

    public String toString(){
        String cad=super.toString();
        cad+="\nNúmero de asientos" +getNumAsientos();
        return cad;
    }

}