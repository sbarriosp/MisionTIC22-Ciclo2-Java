// TODO Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos 
//ellos y la media.

package array4;

public class Array4 {

    public static void main(String[] args) {
        int numeros []=new int [100]; 
        
        int suma = 0;
        double media;
        
        //recorre el arreglo, asigno valores y los suma.
        for (int i=0; i<numeros.length; i++){
            numeros [i]= i+1;
            suma += numeros[i];
        }
        // lo que hace es 1+2+3+4+5+6+7 hasta que llegue a 100. 
        System.out.println("La suma de los valores es: "+suma);
        media= (double)suma/numeros.length;
        System.out.println("La suma media de los valores es: "+media);
    }
    
}
