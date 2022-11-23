// TODO Crear arreglo para mostrar n productos con sus respectivos precios.

package array1;
public class Array1 {
    public static void main(String[] args) {
        String utiles[]={"Lapiceros", "Cuadernos", "Marcadores", "Colores"};
        double precios [] = {2.5, 10.6, 3.7, 8.9};
        System.out.println("La lista de productos con sus precios son: ");
        for (int i=0; i<utiles.length; i++) {
            System.err.println(utiles[i]+" = " +precios [i]);
        }
    }
        
}
