package modelo.beans1;
/**
 Elemento que será contenido en el tambor.
 **/
public class Bolillo{
    private int numero;
    /** 
     * Crea un bolillo con un numero.
     * @param numero  
     **/
    public Bolillo(int numero){
        this.numero = numero;
    }
    /** 
     * @return int 
    **/
    public int getNumero(){
        return numero;
    }
    /**
     * @param numero 
     */
    public void setNumero(int numero){
        this.numero = numero;
    }
}


