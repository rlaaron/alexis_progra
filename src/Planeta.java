public class Planeta {
    private String nombre, distanciaTierra, temperaturaMinima, composicion, translacionYears, translacionDias, rotacion;
    
    public Planeta(String nombre, String distanciaTierra, String temperaturaMinima, String composicion, String translacionYears, String translacionDias, String rotacion) {
        this.nombre = nombre;
        this.distanciaTierra=distanciaTierra;
        this.temperaturaMinima = temperaturaMinima;
        this.composicion = composicion;
        this.translacionYears= translacionYears;
        this.translacionDias = translacionDias;
        this.rotacion = rotacion;
    }

    //Gets and Set de atributos.
    public String getNombre() {
        return nombre;
    }

    public String getDistanciaTierra() {
        return distanciaTierra;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public String getComposicion() {
        return composicion;
    }
    
    public String getTranslacionYears() {
        return translacionYears;
    }

    public String getTranslacionDias() {
        return translacionDias;
    }

    public String getRotacion() {
        return rotacion;
    }

    //Metodo toString(Muestra los datos ordenados en una cadena).
    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", distanciaTierra=" + distanciaTierra + ", temperaturaMinima=" + temperaturaMinima + ", composicion=" + composicion + ", translacionYears=" + translacionYears + ", translacionDias=" + translacionDias + ", rotacion=" + rotacion + '}';
    }
}
