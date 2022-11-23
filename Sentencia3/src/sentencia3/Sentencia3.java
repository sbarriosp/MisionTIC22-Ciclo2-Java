// TODO importar ejercicio 2 y Mostrar en las notas si es aprobado o no el alumno.

package sentencia3;
import java.util.Scanner;
public class Sentencia3 {
    public static void main(String[] args) {
        
        Scanner notas = new Scanner (System.in);
        
        System.out.println("Digite la primera nota: ");
        float nota1= notas.nextFloat();
        
        System.out.println("Digite la segunda nota: ");
        float nota2= notas.nextFloat();
        
        System.out.println("Digite la tercera nota: ");
        float nota3= notas.nextFloat();
        
        System.out.println("Digite la cuarta nota: ");
        float nota4= notas.nextFloat();
        
        float promedio = (nota1+ nota2 + nota3 + nota4)/4;
        
        System.out.println ("El promedio de notas es: "+ promedio);
              
        if (promedio >=0 && promedio <3){
            System.out.println ("El alumno NO APROBO.");
        }
        
        else if (promedio >=3 && promedio <=5) {
            System.out.println ("El alumno APROBO.");
        }

        else{
            System.out.println ("Promedio fuera de rango.");
        }
    }
    
}
         
   

