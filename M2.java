//evaluador de lotes de inventario//
import java.util.Scanner;

public class M2 {
    public static void main (String[]args) {
        
        Scanner pepe = new Scanner (System.in);

        int cantidadProductos;
        int contador = 1;
        String nombreProducto;
        double costoBase;
        double totalCostos = 0;
        int cantidadCategoriaAlta = 0;

        System.out.print("Cuantos productos ingresaran al lote? \n");
        cantidadProductos = pepe.nextInt ();
        pepe.nextLine();
        
        do {
            System.out.println("ingrese el nombre del producto");
            nombreProducto = pepe.nextLine();

            System.out.println("ingrese el costo del producto");
            costoBase = pepe.nextDouble();
            pepe.nextLine();

            totalCostos = totalCostos + costoBase;
            
            if (costoBase < 10000) {
                System.out.println("categoria baja -> "  + nombreProducto);
            } else if (costoBase <= 50000) {
                System.out.println("categoria media -> "   + nombreProducto);
            } else {
                System.out.println("categoria alta -> "   + nombreProducto);
                cantidadCategoriaAlta = cantidadCategoriaAlta +1;
            }
            
            contador = contador +1;

        } while (contador <= cantidadProductos);
        
        double promedio = totalCostos / cantidadProductos;

        System.out.println("el costo promedio es: " + promedio);
        System.out.println("productos de categoria alta"   + cantidadCategoriaAlta);
            
            pepe.close();
        }

    }
