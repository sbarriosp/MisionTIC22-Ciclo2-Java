package MetodoConstructor;
public class Novia {
    
    //Atributos
    
    String nombre;
    String apellidos; 
    int edad; 
    double estatura; 
    
    //Metodos

    public Novia(String nombre, String apellidos, int edad, double estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }
        
    public void mostrarDatos () {
        System.out.println("el nombre de la novia es: " +nombre); 
        System.out.println("el apellido de la novia es: " +apellidos); 
        System.out.println("la edad de la novia es: " +edad); 
        System.out.println("la estatura de la novia es: "+estatura); 
        
    }
    
    public String Cosita () {
        return nombre; 
    }
    
    
}
