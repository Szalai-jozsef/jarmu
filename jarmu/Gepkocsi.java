/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarmu;

/**
 *
 * @author szalaijo
 */
public class Gepkocsi extends Jarmu{
    private int szemelyek;

    public Gepkocsi(int szemelyek, int kerekek, double suly) {
        super(kerekek, suly);
        //setKerekek(kerekek); A fenti sor helyett ezek is lehetnek, ekkor egy implicit üres 
        //super.setSuly(suly); konstrutor hívás történik a Jarmu-re. super() -> Jarmu-ben kell: Jarmu()
        this.szemelyek = szemelyek;
    }
    
    //@Override
    //public double kerekTerheles () {
       //return (getSuly() + szemelyek * 80) / getKerekek();
        //return (suly + szemelyek * 80) / kerekek; ha public az ősben, működik
    //}

    public String kerekTerheles () {
        return "Gepkocsi " + String.valueOf((getSuly() + szemelyek * 80) / getKerekek());
    }

    public void setSzemelyek(int szemelyek) {
        this.szemelyek = szemelyek;
    }

    public int getSzemelyek() {
        return szemelyek;
    }
    
    
}
