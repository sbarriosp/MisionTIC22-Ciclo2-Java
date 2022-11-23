// TODO calcule estaciones del año usando CASE:

package sentencia2;
import java.util.Scanner; 
public class Sentencia2 {
    
    public static void main(String[] args) {
        Scanner estacion = new Scanner (System.in);
        System.out.println("Por favor digite el mes del año en numero: ");
        var mes = estacion.nextInt();
        var estaciones= "Estacion del año no disponible, pedazo de impedido de mierda."; 
        
        switch(mes) {
        
            case 1: case 2: case 12: 
                estaciones= "Invierno.";
                    break; 
                    
            case 3: case 4: case 5: 
                estaciones = "Primavera.";
                    break; 
                    
            case 6: case 7: case 8:
                estaciones = "Verano.";
                    break;
                    
            case 9: case 10: case 11:
                estaciones = "Otoño.";
                    break;  
        }
        
        System.out.println("La estacion del año es: " +estaciones);
    }
    
}
 