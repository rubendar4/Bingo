package modelo.logic1;
import modelo.beans1.Jugador;
import modelo.dao1.JugadorDAO;
import java.util.ArrayList;
import java.util.List;
/**
Clase que nos permitira usar los objetos de tipo jugador, que se encuentran registrados en la interfaz gráfica.
 **/
public class JugadorLogic {
    
    private static JugadorDAO jugadordao = new JugadorDAO();
    /**
     *verificar que el usuario y contraseña sean correctas.
     * @param contraseña Ingresar usuario registrado.
     * @param jugador Ingresr contraseña registrada.
     * @return boolean ¿Los datos ingresados son correctos?
     **/
    public static boolean autentificar(String jugador, String contraseña){
        if(obtener(jugador)!= null){
            Jugador jugadorConsulta = obtener(jugador);
            if(obtener(jugador).getJugador().equals(jugador)&& jugadorConsulta.getContraseña().equals(contraseña)){
            return true;
            }else{
            return false;
            }
        }else{
        return false;
        }
    }
    /**
     * Insertar jugador.
     * @param jugador Ingresar jugador que deseemos insertar.
     **/
    public static boolean insertar(Jugador jugador){
        return jugadordao.insertar(jugador) ;
    }
    /**
     * Devuelve la lista de jugadores registrados
     * @return Lista completa de jugadores registrados.
     **/
    public static List<Jugador> getJugadores(){
        return jugadordao.getJugadores();
    }
    /**
     * Obtener jugador.
     * @param jugador ingresar usuario del jugador.
     * @return Jugador.
     **/
    public static Jugador obtener(String jugador){
        return jugadordao.obtener(jugador);
    }
}
