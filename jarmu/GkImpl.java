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
public class GkImpl implements GkInterf
{

    public GkImpl() {
    }

    //@Override
    public Gepkocsi ujSkoda() {
        Gepkocsi skoda = new Gepkocsi(5, 4, 1300);
        return skoda;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Gepkocsi ujZsiga() {
        return new Gepkocsi(5, 4, 1350);
    }
    
    public Jarmu ujBmx() {
        return new Jarmu(2, 25);
    }
}
