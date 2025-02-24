package Herencia4;
import java.util.Scanner;

public class Marca extends Proveedor{

    private String nombreM;
 
    public Marca(){
        System.out.println("\nMarca");
    }

    public void setNombreM(String a){
        nombreM=a;
    }

    public String getNombreM(){
        return nombreM;
    }

    public void enviarProductos(){
        System.out.println("Enviando productos para proveedor...");
    }

    public String toString(){
        String cad=super.toString();
        cad+="\nNombre de la marca: "+getNombreM();
        return cad;
    }

    public void registrar(){
        Scanner lee=new Scanner(System.in);
        super.registrar();
        System.out.println("\nIngresa Datos de la marca");
        System.out.println("\nNombre de la marca");
        setNombreM(lee.nextLine());
    }


}
