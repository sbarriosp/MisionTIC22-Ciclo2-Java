// TODO 

package matriz2;

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite las filas de la matriz");
        
        int filas = entrada.nextInt();
        System.out.println("Por favor digite las columnas de la matriz");
        
        int columnas = entrada.nextInt();
        int matriz [][]= new int [filas][columnas];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j]= generarNumeroAleatorio(0,10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
        
    public static int generarNumeroAleatorio (int minimo, int maximo) {
        return ((int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)));
        
    }
        
}
