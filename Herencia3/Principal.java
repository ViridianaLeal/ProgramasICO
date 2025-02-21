package Herencia3;

public class Principal{

    public static void main(String[]args){
        MedioTransporte obj=new MedioTransporte();
        obj.pedirDatos();
        System.out.println(obj);

        obj.encender();
        obj.transportar();
        obj.frenar();
        obj.apagar();


        Automovil obj1=new Automovil();
        obj1.pedirDatos();
        System.out.println(obj1);
        
        obj1.encender();
        obj1.transportar();
        obj1.frenar();
        obj1.apagar();
        obj1.acelerar();
    }

}