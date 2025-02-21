//Viridiana Leal Ramos
//Herencia 3

package Herencia3;

import java.util.Scanner;

public class Automovil extends MedioTransporte{

    private String numSerie;

    public Automovil(){
        super();
        System.out.println("Automovil");
    }


    public void setNumSerie(String numSerie){
        this.numSerie=numSerie;
    }

    public String getNumSerie(){
        return numSerie;
    }

    public void acelerar(){
        System.out.println("Acelerando automovil");
    }


    public void pedirDatos(){
        Scanner lee=new Scanner(System.in);
        super.pedirDatos();
        System.out.println("\nNúmero de serie: "+getNumSerie());
        setNumSerie(lee.nextLine());
    }

    public String toString(){
        String cad=super.toString();
        cad+="\nNúmero de serie: "+getNumSerie();
        return cad;
    }

}