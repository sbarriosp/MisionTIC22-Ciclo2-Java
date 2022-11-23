//Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
//Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el resultado.


package matriz3;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite el número de la matriz: ");
        int dimension = entrada.nextInt ();
        
        int matriz1 [] [] = new int [dimension] [dimension];
        int matriz2 [] [] = new int [dimension] [dimension];
        int matrizResultado [] [] = new int [dimension] [dimension];
    
        for (int i=0; 1<matriz1.length; i++) {
            for (int j=0; j<matriz1.length; j++){
                
                System.out.println("Digite el valor para la fila "+ i + "Digite el valor para la columna "+j+ "matriz1");
                matriz1[i][j]=entrada.nextInt();
                
                System.out.println("Digite el valor para la fila "+ i + "Digite el valor para la columna "+j+ "matriz2");
                matriz2[i][j]=entrada.nextInt();
                
                System.out.println("Digite el valor para la fila "+ i + "Digite el valor para la columna "+j+ "matrizResultado");
                matrizResultado[i][j]=entrada.nextInt();
                
    }        
                System.out.println("Matriz 1 ");
                 mostrarMatriz(matriz1);
                System.out.println("Matriz 2 ");
                mostrarMatriz(matriz2);
                System.out.println("Matriz Resultado");
                mostrarMatriz(matrizResultado);
        
    }
        public static void mostrarMatriz(int matriz[][]){
             for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
               System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }     
    }
}

