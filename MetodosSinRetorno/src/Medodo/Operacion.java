package Medodo;
public class Operacion {
    
    public float sumar (int num1, int num2) {
        float suma = num1 + num2; 
        return suma;
    }
    
    public float restar (int num1, int num2) {
        float resta = num1 - num2; 
        return resta; 
    }
    
    public float multiplicar (int num1, int num2) {
        float multi = num1 * num2;
        return multi;
    }
    
    public float dividir (int num1, int num2) {
        float div = num1 / num2;
        return div;
    }    
    
    public void mostrarDatos (float suma, float resta, float multi, float div) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La division es: " + div);
    }
}
