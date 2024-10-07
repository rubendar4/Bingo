package modelo.dao1;

import java.util.ArrayList;
import java.util.List;
import modelo.beans1.Jugador;

/**
Clase para guardar usuarios registrados en la interfaz gráfica.
 **/
public class JugadorDAO {
    
    private List<Jugador> jugadores;
    public JugadorDAO(){
        jugadores = new ArrayList<>();
    } 
    /**
     * Dame la lista de jugadores registrados.
     * @return Lista completa de jugadores registrados.
     **/
    public List<Jugador> getJugadores(){
    return jugadores;}
    /**
     * Buscar jugador.
     * @param usuario Ingresar usuario del jugador.
     * @return int Posicion en la lista de jugadores registrados.
     **/
    public int buscar(String usuario){
        int n = -1;
        for(int i = 0 ; i < jugadores.size();i++){
            if(jugadores.get(i).getJugador().equals(usuario)){
                n = i ;
                break;
            }
                }
        return n;
    }
    
    /**
     * Insertar jugador.
     * @param jugador Ingresar jugador que deseemos insertar.
     * @return boolean.
     **/
    public boolean insertar(Jugador jugador){
        if(buscar(jugador.getJugador() )==-1){
            jugadores.add(jugador);
            return true;
        }else{
            return false;
        }
    }
    /**
     * Obtener jugador.
     * @param jugador ingresar usuario del jugador.
     * @return Jugador.
     **/
    public Jugador obtener(String jugador){
        if(buscar(jugador) != -1){
            return jugadores.get(buscar(jugador));
        }else{return null;}
    }
    
}
