//Viridiana Leal Ramos
//Herencia 4- Clase Negocio
//Con lo visto en la clase realizar de tarea el mapa de relación de clases

package Herencia4;

public class Principal {
    public static void main(String[] args) {

        Cliente n = new Cliente();
        n.pedirDatos();
        n.RealizarPedido();
        n.generarReporte();
        System.out.println(n);

        Proveedor p=new Proveedor();
        p.registrar();
        p.generarReporte();
        p.generarFactura();
        System.out.println(p);

        Marca m=new Marca();
        m.registrar();
        m.generarReporte();
        m.suministrarProductos();
        m.generarFactura();
        m.enviarProductos();
        System.out.println(m);

    }
}
