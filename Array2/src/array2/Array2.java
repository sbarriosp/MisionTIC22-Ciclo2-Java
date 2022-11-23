//TODO crea un array de 10 posiciones de numeros con valores pedidos en el teclado

package array2;
import javax.swing.JOptionPane; 
public class Array2 {

    public static void main(String[] args) {
        final int size = 10;
        int numeros[] = new int [size];
        rellenarArray(numeros);
        mostrarArray(numeros); 
    }
    
    public static void rellenarArray(int arreglo []) {
        for (int i=0; i<arreglo.length; i++) {
            String texto = JOptionPane.showInputDialog ("Digite el numero del arreglo: " + (i+1)); 
            arreglo[i] = Integer.parseInt(texto);
            }
        
    }
    
    public static void mostrarArray(int arreglo []) {
        for(int i=0; i<arreglo.length; i++){
            System.out.println("En el indice "+i+" se encuentra el numero: " + arreglo[i]);
            }
    }

}
