package modelo.beans1;
import java.util.ArrayList;
import modelo.beans1.Jugador;
/**
 *Encargado de administrar el juego.
 **/
public class Locutor{
    private Tambor tambor;
    private ArrayList<Jugador> listaJugadores;
    String cartonGan;
    String ganador;
    public Locutor(){
        tambor = new Tambor();
        listaJugadores = new ArrayList<>();

    }
    /**
     *Devuelve la lista de jugadores registrados.
     * @return Lista de jugadores.
     **/
public ArrayList<Jugador> getLista(){
    return listaJugadores;
}
/**
 * Anunciar el número de bolillo.
 * @return int Devuelve el último número sacado del tambor.
 **/
    public int anunciarBol(){
        int res = tambor.sacarBol();
        return res;
    }
/**
 * Registrar jugadores.
 * @param inscrito Jugador requerido para inscribirse. 
 **/
    public void registrar(Jugador inscrito){
        listaJugadores.add(inscrito);
    }
/**
 *¿Habrá un jugador ganador, hasta este momento?
 * @return boolean Determina si hay un ganador del juego.
 **/
    public boolean hayGan(){
        return hayGan(0);
    }

    private boolean hayGan(int pos){
        int numJug = listaJugadores.size();
        boolean res = false;
        if(numJug > pos){
            if(listaJugadores.get(pos).cantarBingo()){
                res = true;
            }
            else{
                res = hayGan(pos + 1);
            }
        }else{}
        return res;
    }
/**
 *Iniciar juego.
 **/
    public void iniciarJuego(){
        iniciarJuego(0,0);
    }

    private void iniciarJuego(int pos,int ultBol){
        int numJug = listaJugadores.size();
        if(numJug -1 < pos){
            iniciarJuego(0,tambor.sacarBol());
        }else{
            listaJugadores.get(pos).marcarCasilla(ultBol);
            if(hayGan()){
                ganador = listaJugadores.get(pos).getNombre() + " ganó 100000 fichas.";
                cartonGan = listaJugadores.get(pos).cartonGan(pos);
                listaJugadores.get(pos).aumentarDin(100000);
                System.out.println(listaJugadores.get(pos).getNombre() +" ganó el juego");
            }else{
                iniciarJuego(pos + 1, ultBol);
            }
        }
    }
    /**
     *Regresar el carton del jugador ganador.
     * @return String Carton ganador.
     **/
    public String getCartonGan(){
        return cartonGan;
    }
    /**
     *regresa el nombre del jugador ganador.
     * @return String Nombre del jugador ganador.
     **/
    public String getGanador(){
        return ganador;
    }
}