public class Estrella {
    private String nombre, constelacion, distanciaLuz, luminosidadSoles, clasificacion;
    
    public Estrella(String nombre, String constelacion, String distanciaLuz, String luminosidadSoles){
        this.nombre = nombre;
        this.constelacion = constelacion;
        this.distanciaLuz = distanciaLuz;
        this.luminosidadSoles = luminosidadSoles;
    }

    //Gets and Sets de atributos.
    public String getNombre() {
        return nombre;
    }

    public String getConstelacion() {
        return constelacion;
    }

    public String getDistanciaLuz() {
        return distanciaLuz;
    }

    public String getLuminosidadSoles() {
        return luminosidadSoles;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    
    //Metodo toString(Muestra los datos ordenados en una cadena)
    @Override
    public String toString() {
        return "estrellas{" + "nombre=" + nombre + ", constelacion=" + constelacion + ", distancia en años Luz=" + distanciaLuz + ", luminosidad en Soles=" + luminosidadSoles + '}';
    }
    
    
}
