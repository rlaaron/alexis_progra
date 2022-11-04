public class Nebulosa{
    private String nombre, descubrimineto, temperatura, constelacion;
    
    public Nebulosa(String nombre, String descubrimiento, String temperatura,String constelacion){
        this.nombre = nombre;
        this.descubrimineto = descubrimiento; 
        this.temperatura = temperatura;
        this.constelacion = constelacion;
    }
    
    //Gets and Sets de atributos.
    public String getNombre() {
        return nombre;
    }

    public String getDescubrimineto() {
        return descubrimineto;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getConstelacion() {
        return constelacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescubrimineto(String descubrimineto) {
        this.descubrimineto = descubrimineto;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setConstelacion(String constelacion) {
        this.constelacion = constelacion;
    }

    //Metodo toString(Muestra los datos ordenados en una cadena).
    @Override
    public String toString() {
        return "Nebulosas{" + "nombre=" + nombre + ", descubrimineto=" + descubrimineto + ", temperatura=" + temperatura + ", constelacion=" + constelacion + '}';
    }
    
}

