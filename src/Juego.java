public class Juego {
    SetUp stp;
    Jugador j1,j2;

    public Juego(Jugador j1) {
        stp = new SetUp();
        stp.startSetUp();
        this.j1 = j1;
    }
    
    public Juego(Jugador j1, Jugador j2) {
        stp = new SetUp();
        stp.startSetUp();
        this.j1 = j1;
        this.j2 = j2;
    }



    
}
