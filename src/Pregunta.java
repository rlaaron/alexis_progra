public class Pregunta {
    String pregunta;
    Boolean activa;


    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.activa = true;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Boolean getActiva() {
        return activa;
        //Este es un comentario
        //te devuelvo el comentario
        //Este cambio es sobre mi rama
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "pregunta=" + pregunta + ", activa=" + activa + '}';
    }
    
}
