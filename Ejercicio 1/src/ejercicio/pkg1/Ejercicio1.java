//calcule el area de un triangulo formula: (base * alura)/2

package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner triangulo = new Scanner(System.in);     
        
        System.out.println("Por favor, digite la base del triangulo: ");
        float base = triangulo.nextFloat();
        
        System.out.println("Por favor, digute la altura del triangulo: ");
        float altura= triangulo.nextFloat();
        
        float area= (base*altura)/2;
        
        System.out.println("El area del triangulo es: " + area);
        
    }
    
}
