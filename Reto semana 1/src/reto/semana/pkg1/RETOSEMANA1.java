
public class BecaUniversitaria {
    
    private int pTiempo;
    private double pMonto;
    private double pInteres;
    
    
    public BecaUniversitaria (int pTiempo, double pMonto, double pInteres){
        this.pTiempo = pTiempo; 
        this.pMonto = pMonto; 
        this.pInteres = pInteres; 
    }

    public BecaUniversitaria (){
        this.pTiempo = 0;
        this.pMonto =0.0;
        this.pInteres= 0.0;
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple(); 
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }
    
    public String compararInversion(){
        
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";   
    }
    
    public double calcularInteresSimple(){
        double interesSimple = Math.round( pMonto * (pInteres/100) * pTiempo);  
        return interesSimple ; 
    }
    
    public double calcularInteresCompuesto (){
        double resultado = Math.pow((1+ (pInteres/100)), pTiempo);
        double interesCompuesto = Math.round (pMonto * ( resultado -1));
        return interesCompuesto;
    }

} 
 
    
    
    
    
