
package Clases;

public class Mascota {

    private String codigo;
    private String nombre;
    private int annioNac;
    private String raza;
    private String color;

    public Mascota() {
    }

    public Mascota(String codigo, String nombre, int annioNac, String raza, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.annioNac = annioNac;
        this.raza = raza;
        this.color = color;
    }

    
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the annioNac
     */
    public int getAnnioNac() {
        return annioNac;
    }

    /**
     * @param annioNac the annioNac to set
     */
    public void setAnnioNac(int annioNac) {
        this.annioNac = annioNac;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
