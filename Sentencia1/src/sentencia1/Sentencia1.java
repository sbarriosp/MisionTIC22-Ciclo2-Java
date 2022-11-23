// TODO calcule estaciones del año usando IF and ELSE

package sentencia1;

import java.util.Scanner;

public class Sentencia1 {

    public static void main(String[] args) {
        Scanner estacion= new Scanner(System.in);
        System.out.println("Digite el mes del año en numero del 1 al 12: ");
       
        var mes = estacion.nextInt(); 
        var estaciones = "Estacion no es disponible.";
              
        if(mes ==2 || mes == 12 || mes ==1){
            estaciones = "Invierno.";
        }
        
        else if (mes == 3 || mes== 4 || mes == 5){
            estaciones = "Primavera.";
        }
        
        else if (mes == 6 || mes== 7 || mes == 8){
            estaciones = "Verano.";
        }
        
        else if (mes == 9 || mes== 10 || mes == 11){
            estaciones = "Otoño.";
        }
        
        System.out.println("La estacion del año es: " + estaciones);
    }
    
}
