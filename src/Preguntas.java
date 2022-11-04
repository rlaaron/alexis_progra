import java.util.ArrayList;

public class Preguntas {
    //array list de preguntas
    private ArrayList<Pregunta> preguntas;

    public Preguntas() {
        preguntas = new ArrayList<>();
    }

    public void addPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void removePregunta(Pregunta pregunta) {
        preguntas.remove(pregunta);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Boolean getPreguntaActiva() {
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getActiva()) {
                return true;
            }
        }
        return false;
    }
    
    public Pregunta getPreguntaRandom(){
        if(getPreguntaActiva()){
            int random = (int) (Math.random() * preguntas.size());
            preguntas.get(random).setActiva(false);
            return preguntas.get(random);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "Preguntas{" + "preguntas=" + preguntas + '}';
    }

}
