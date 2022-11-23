// TODO Realizar un programa que realice el promedio de las notas de un alumno

package ejercicio2;

public class Ejercicio2 {
  
    public static void main(String[] args) {
        
        float nota1, nota2, nota3, promedio; 
        nota1 = 5.25f;
        nota2 = 7.85f;
        nota3 = 3.4f;
        promedio = (nota1 + nota2 + nota3)/3;
                
        promedio += 1; //promedio = promedio +1
        
        System.out.println("El promedio de las notas es: " + promedio);
                
    }
    
}
