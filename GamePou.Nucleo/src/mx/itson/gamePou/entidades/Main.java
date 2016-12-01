/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.entidades;
/*
import java.util.List;
import mx.itson.libreriaPou.implementacion.NegocioPou;
import mx.itson.libreriaPou.implementacion.NegocioRegistroInventario;
import mx.itson.libreriaPou.implementacion.PersistenciaPou;
import mx.itson.libreriaPou.implementacion.PersistenciaProducto;
import mx.itson.libreriaPou.implementacion.PersistenciaRegistroInventario;
import mx.itson.libreriaPou.interfaz.IPouNegocio;
import mx.itson.libreriaPou.interfaz.IPouPersistencia;
import mx.itson.libreriaPou.interfaz.IProductoPersistencia;
import mx.itson.libreriaPou.interfaz.IRegistroInventarioNegocio;
import mx.itson.libreriaPou.interfaz.IRegistroInventarioPersistencia;
*/

/**
 *  Entidad utilizada para realizar pruebas
 * @author SaulUrias
 */
public class Main {
    public static void main(String[] args) {
/*        
        
        IPouPersistencia pouPersistencia = new PersistenciaPou();
        IProductoPersistencia productoPersistencia = new PersistenciaProducto();
        IRegistroInventarioPersistencia registroInventarioPersistencia = new PersistenciaRegistroInventario();
        
        IPouNegocio negocioPou = new NegocioPou();
        IRegistroInventarioNegocio registroInventarioNegocio = new NegocioRegistroInventario();
        
        
        Pou pou = pouPersistencia.obtenerPou();
        List<RegistroInventario> registros = registroInventarioPersistencia.obtenerRegistrosInventario();
        List<Producto> productos = productoPersistencia.obtenerProductos();
        
        
        System.out.println("*************************");
        String valoresPou = "Valores Pou: " + "Hambre: " + pou.getValorHambre() + " Salud: " + pou.getValorSalud() +
                                            " Energia: " + pou.getValorEnergia() + " Felicidad: " + pou.getValorFelicidad() + " Dinero: " + pou.getDinero();
        System.out.println(valoresPou);
        
        System.out.println("*************************");
        System.out.println("Articulos Refrigerador");
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getProducro().getSeccion() == Seccion.COCINA) {
                System.out.println(registros.get(i).getProducro().getNombre() + " X " + registros.get(i).getCantidad());
            }
        }
        
        System.out.println("*************************");
        
        RegistroInventario registro = registros.get(0);
        
        
        negocioPou.consumir(registro, pou);
        
        pou = pouPersistencia.obtenerPou();
        
        
        System.out.println("Pou se comio: " + registro.getProducro().getNombre());
        System.out.println("*************************");
        System.out.println("Los valores de pou se modificaron y ahora sus valores son:");
        System.out.println(valoresPou);
        
        
        
        System.out.println("*************************");
        System.out.println("Dentro de la tienda se encuentra:");
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getSeccion() == Seccion.COCINA) {
                System.out.println(productos.get(i).getNombre() + " $" + productos.get(i).getCosto());
            }
        }

        
        System.out.println("*************************");
        registro = registros.get(1);
        
        System.out.println("Pou tiene: $" + pou.getDinero());
        
        negocioPou.comprar(registro.getProducro(), pou);
        registroInventarioNegocio.comprar(registro, pou);
        
        pou = pouPersistencia.obtenerPou();

        System.out.println("Pou se compro: " + registro.getProducro().getNombre());
        System.out.println("Ahora tiene: " + registro.getProducro().getNombre() + " X " + registro.getCantidad());
        System.out.println("Pou ahora tiene $" + pou.getDinero());
        
*/        
    }
}
