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
public class TeherGepkocsi extends Gepkocsi{
    private double raksuly;

    public TeherGepkocsi(double raksuly, int szemelyek, int kerekek, double suly) {
        super(szemelyek, kerekek, suly);
        this.raksuly = raksuly;
    }
    
    public String kerekTerheles () {
        return "TeherGepkocsi " + String.valueOf((raksuly + getSuly() + getSzemelyek() * 80) / getKerekek());
    }
}
