//Viridiana Leal Ramos
//Herencia 2
//De acuerdo a lo visto en clase, realizar programa utilizando Herencia

package Herencia2;

public class Biblioteca {

    private String nombre,autor,editorial;
    private int ID,numPaginas;

    public Biblioteca(){
        super();
    }

    public void setNombre(String a){
        nombre=a;
    }

    public void setAutor(String a){
        autor=a;
    }

    public void setEditorial(String a){
        editorial=a;
    }

    public void setId(int a){
        ID=a;
    }

    public void setNumPaginas(int a){
        numPaginas=a;
    }

    public String getNombre(){
        return nombre;
    }

    public String getAutor(){
        return nombre;
    }

    public String getEditorial(){
        return editorial;
    }

    public String toString(){
        String cad="\nNombre: "+nombre;
        cad+="\nAutor: "+autor;
        cad+="\nEditorial: "+editorial;
        return cad;
    }

    
}
