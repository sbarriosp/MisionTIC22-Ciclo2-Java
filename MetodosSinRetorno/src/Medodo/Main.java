package Medodo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero1: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el numero2: "));
    
        Operacion operacion1= new Operacion();
        
        float suma = operacion1.sumar(0, 0);
        float resta = operacion1.restar(0, 0);
        float multi = operacion1.multiplicar(0, 0);
        float div = operacion1.dividir(0, 0);
        operacion1.mostrarDatos(0, 0, 0, 0);
    }
    
    
}
