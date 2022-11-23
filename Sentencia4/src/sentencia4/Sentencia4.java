// TODO code application logic here Sentencia If Else para un cliente que hará un pedido.

package sentencia4;

import java.util.Scanner;

public class Sentencia4 {

    public static void main(String[] args) {
        Scanner articulos = new Scanner (System.in);
        System.out.println("Por favor digite el nombre del cliente: ");
        String nombre = articulos.nextLine(); 
        System.out.println("Digite la cantidad de articulos a comprar: ");
        int cantidad= articulos.nextInt ();
        if (cantidad >0 &&  cantidad <5) {
            System.out.println("El cliente " + nombre+ " compró " + cantidad+ " de articulos y debe pagar en efectivo.");
        }
        else if (cantidad >=5 && cantidad <12) {
            System.out.println("El cliente " + nombre+ " compró " + cantidad+ " de articulos y debe pagar con tarjeta.");
        }
        else if (cantidad >11) {
            System.out.println("El cliente " + nombre+ " compró " + cantidad+ " de articulos y debe pagar con cheque.");
        }
        else {
            System.out.println("Ha digitado una cantidad no válida pedazo de genio subnormal.");
        }
        
    }   
    
}
