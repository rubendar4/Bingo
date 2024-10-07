package modelo.beans1;

import java.util.ArrayList;
/**
*Almacena contenido de tipo Bolillo.
 **/
public class Tambor{
    private int cantBol;
    private ArrayList<Bolillo> listBolSac;
    private int ultBolSac;
    public Tambor(){
        cantBol = 90;
        listBolSac = new ArrayList<Bolillo>();
        ultBolSac = 0;
    }
/**
 *Sacar un bolillo del tambor.
 * @return int Bolillo sacado.
 **/
    public int sacarBol(){
        int numBol = (int)(Math.random()*(91));
        ultBolSac = numBol;
        ArrayList<Bolillo> listAux = new ArrayList<Bolillo>();
         if(listBolSac.equals(listAux)){
            Bolillo bolillo = new Bolillo(numBol);
            listBolSac.add(bolillo);
        }else{
            if(bolRep()){
                numBol = sacarBol();
            }else{
                if(numBol == 0){
                    numBol = sacarBol();
                }else{
                    Bolillo bolillo = new Bolillo(numBol);
                    listBolSac.add(bolillo);
                }
            }
        }
        return numBol;
    }
    public boolean bolRep(){
        boolean res = false;
        res = bolRep(0,false);
        return res;
    }

    private boolean bolRep(int pos,boolean res){
        if(res){
            res = true;
        }
        else{
            if(pos>= listBolSac.size()){
                res = false;
            }else{
                res = listBolSac.get(pos).getNumero() == ultBolSac;
                res = bolRep(pos+1,res);
            }
        }
        return res;
    }
/**
 *regresa el numero del último bolillo sacado
 * @return int Último bolillo sacado. 
 **/
    public int getUltBolSac(){
        return ultBolSac;
    }
}