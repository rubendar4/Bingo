package modelo.beans1;

/**
*Elemento que será contenido en cada carton.
*Contiene un número y un estado de: Marcado y no marcado.
 **/
public class Casilla{
    private String estado;
    private int num;
    public Casilla(){
        num = 0;
        estado = "No marcado";
    }
    public Casilla(int num){
        this.num = num;
        estado = "No marcado";
    }
     public Casilla(int num, String estado){
        this.num = num;
        this.estado = estado;
    }
    public boolean compCasilla(Casilla a, Casilla b, Casilla c){
        boolean res = false;
        if(res){
        }else{
            res = (a.getNum() == b.getNum() || b.getNum() == c.getNum()) || a.getNum() == c.getNum();
        }
        return res;
    }
    
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getEstado(){
    return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    @Override
    public String toString(){
        return "" + getNum();
    }
}