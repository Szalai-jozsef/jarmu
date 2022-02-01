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
public class Jarmu {
    private int kerekek;
    private double suly;
    private static String verzio = "v1";
    
    public Jarmu() {
        //kerekek = 0;
        //suly = 0.0;
    }
    
    public static void set_verzio(String ver) {
        verzio = ver;
    }

    public static String getVerzio() {
        return verzio;
    }

    public Jarmu(int kerekek, double suly) {
        this.kerekek = kerekek;
        this.suly = suly;
    }
    
    public String kerekTerheles() {
        return "Jarmu " + String.valueOf(suly / kerekek);
    }

    public int getKerekek() {
        return kerekek;
    }

    public double getSuly() {
        return suly;
    }

    public void setKerekek(int kerekek) {
        this.kerekek = kerekek;
    }

    public void setSuly(double suly) {
        this.suly = suly;
    }
    
    @Override
    public String toString() {
        return "Jarmu.toString=" + String.valueOf(kerekek) + " " + String.valueOf(suly);
    }
}
