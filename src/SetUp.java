import java.util.ArrayList;

public class SetUp {
    ArrayList<Nebulosa> nebulosas;
    ArrayList<Estrella> estrellas;
    ArrayList<Planeta> planetas;

    Preguntas preguntasNebulosas, preguntasEstrellas, preguntasPlanetas;

    ArrayList<String> respuestasNebulosas, respuestasEstrellas, respuestasPlanetas;

    public SetUp() {
        nebulosas = new ArrayList<>();
        estrellas = new ArrayList<>();
        planetas = new ArrayList<>();

        preguntasNebulosas = new Preguntas();
        preguntasPlanetas = new Preguntas();
        preguntasEstrellas = new Preguntas();
    }

    //getters and setters
    public ArrayList<Nebulosa> getNebulosas() {
        return nebulosas;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public Preguntas getPreguntasNebulosas() {
        return preguntasNebulosas;
    }

    public Preguntas getPreguntasEstrellas() {
        return preguntasEstrellas;
    }

    public Preguntas getPreguntasPlanetas() {
        return preguntasPlanetas;
    }


    public void setNebulosas(ArrayList<Nebulosa> nebulosas) {
        this.nebulosas = nebulosas;
    }

    public void setEstrellas(ArrayList<Estrella> Estrellas) {
        this.estrellas = Estrellas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }


    
    //functions to execution
    public void addAllNebulosas(){
        nebulosas.add(new Nebulosa("Del anillo", "1779","930","lyra"));
        nebulosas.add(new Nebulosa("De la hormiga", "1922","-176","norma"));
        nebulosas.add(new Nebulosa("Esquimal", "1787","-218","geminis"));
        nebulosas.add(new Nebulosa("Del Insecto", "1888","453","scorpius"));
        nebulosas.add(new Nebulosa("Ojo de gato", "1786","-129","draco"));
        nebulosas.add(new Nebulosa("Reloj de arena", "1996","-220","musca"));
        nebulosas.add(new Nebulosa("Saturno", "1782","-240","acuario"));
    }

    public void addAllEstrellas(){
        estrellas.add(new Estrella("Arcturo", "bootes","36","215"));
        estrellas.add(new Estrella("Alpha Caeli", "caelum","66", "5.2"));
        estrellas.add(new Estrella("Beta Camepardalis", "camelopardis","1000","1592"));
        estrellas.add(new Estrella("Muhlifain", "centaurus",  "4.39","95"));
        estrellas.add(new Estrella("Cor Caroli", "canes","110","83"));
        estrellas.add(new Estrella("Omicron", "cetus","96","8400"));
        estrellas.add(new Estrella("Deneb Algiedi", "capricornius","39", "8.5"));
        estrellas.add(new Estrella("Rigel Kentaurus", "centaurus","4.39","85000"));
        estrellas.add(new Estrella("Diphda", "cetus","96","145"));
        estrellas.add(new Estrella("Alpha Circini", "circinus","53","11"));
    }

    public void addAllPlanetas(){
        planetas.add(new Planeta("Jupiter", "588800000", "930", "gaseoso", "11", "314", "10"));
        planetas.add(new Planeta("Saturno","1300000000","-176","gaseoso","29","167","11"));
        planetas.add(new Planeta("Urano","2721","-218","gaseoso","84","0","17"));
        planetas.add(new Planeta("Venus","40000000","453","rocoso","225","0","5832"));
        planetas.add(new Planeta("Marte","102000000","-129","rocoso","2","687","25"));
        planetas.add(new Planeta("Neptuno","450000000","-220","gaseoso","164","0","16"));
        planetas.add(new Planeta("Pluton","600000000","-240","rocoso","11","247","6387"));
    }

    public void addAllPreguntasNebulosas(){
        preguntasNebulosas.addPregunta(new Pregunta("¿Año que fue descubierta?"));
        preguntasNebulosas.addPregunta(new Pregunta("¿Constelacion a la que pertenece?" ));
        preguntasNebulosas.addPregunta(new Pregunta("¿Cual es su temperatura maxima?"));
    }

    public void addAllPreguntasEstrellas(){
        preguntasEstrellas.addPregunta(new Pregunta("¿Constelacion a la que pertenece?"));
        preguntasEstrellas.addPregunta(new Pregunta("¿Distancia en años luz de la tierra?"));
        preguntasEstrellas.addPregunta(new Pregunta("¿Luminosidad de la estrella en soles?"));
    }

    public void addAllPreguntasPlanetas(){
        preguntasPlanetas.addPregunta(new Pregunta("¿Distancia desde la tierra?"));
        preguntasPlanetas.addPregunta(new Pregunta("¿Tiempo de traslacion?"));
        preguntasPlanetas.addPregunta(new Pregunta("¿Tipo de planeta?"));
        preguntasPlanetas.addPregunta(new Pregunta("¿Temperatura minima?"));
    }

    // public void addAllRespuestasNebulosas(){
    //     for(Nebulosas n: nebulosas){
    //         respuestasNebulosas.add(n.getDescubrimineto();)
    //     }
    // }

    public void startSetUp(){
        addAllNebulosas();
        addAllEstrellas();
        addAllPlanetas();
        addAllPreguntasNebulosas();
        addAllPreguntasEstrellas();
        addAllPreguntasPlanetas();
    }

    @Override
    public String toString() {
        return "setUp{" + "nebulosas=" + nebulosas + ", Estrellas=" + Estrellas + ", planetas=" + planetas + ", preguntasNebulosas=" + preguntasNebulosas + ", preguntasConstelaciones=" + preguntasPlanetas + ", preguntasEstrellas=" + preguntasEstrellas + '}';
    }
}
