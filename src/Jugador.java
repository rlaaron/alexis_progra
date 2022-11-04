public class Jugador {
    int puntos, numeroJugador;

    public Jugador(int numeroJugador) {
        puntos = 0;
        this.numeroJugador = numeroJugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public void addPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void removePuntos(int puntos) {
        if(this.puntos - puntos < 0) {
            setPuntos(0);
        } else {
            this.puntos -= puntos;
        }
    }

    @Override

    public String toString() {
        return "Jugador: " + numeroJugador + "{" + "puntos=" + puntos + '}';
    }
}
