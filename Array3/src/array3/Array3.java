// TODO crear un nuevo array donde digite el tamaño del arreglo

package array3;
import javax.swing.JOptionPane; 
public class Array3 {
    public static void main(String[] args) {
        String texto;
        texto = JOptionPane.showInputDialog("Digite el tamaño del arreglo: ");
        int numeros[]= new int [Integer.parseInt(texto)]; 
        rellenarAleatorioArray(numeros, 0,30);
        mostrarArray (numeros);
    }
    
    public static void rellenarAleatorioArray (int arreglo [], int a, int b) {
        for (int i=0; i<arreglo.length; i++){
        //generar numeros aleatorios del 0 al 30
        arreglo [i]= ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    
    public static void mostrarArray(int arreglo []) {
        for(int i=0; i<arreglo.length; i++){
            System.out.println("En el indice "+i+" se encuentra el numero: " + arreglo[i]);
        }
    
    }
}
