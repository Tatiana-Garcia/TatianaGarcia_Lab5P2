
package tatianagarcia_lab5p2;

public class Personajes {
    private String nombre;
    private String poder; 
    private String debilidad; 
    private String universo;
    
    private double fuerza; 
    private double ag_fisica; 
    private double ag_mental;
    private double vida;

    public Personajes() {
    }

    public Personajes(String nombre, String poder, String debilidad, String universo, double fuerza, double ag_fisica, double ag_mental, double vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.ag_fisica = ag_fisica;
        this.ag_mental = ag_mental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAg_fisica() {
        return ag_fisica;
    }

    public void setAg_fisica(double ag_fisica) {
        this.ag_fisica = ag_fisica;
    }

    public double getAg_mental() {
        return ag_mental;
    }

    public void setAg_mental(double ag_mental) {
        this.ag_mental = ag_mental;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", poder=" + poder + 
                ", debilidad=" + debilidad + ", universo=" + universo + 
                ", fuerza=" + fuerza + ", ag_fisica=" + ag_fisica + 
                ", ag_mental=" + ag_mental + ", vida=" + vida + '}';
    }
    
    

}
