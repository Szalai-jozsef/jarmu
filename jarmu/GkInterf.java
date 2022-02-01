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
public interface GkInterf {
    Jarmu ujSkoda();

    abstract Jarmu ujZsiga(); // nem kell, alapból abstract

    default Gepkocsi ujDacia() { //implement
        return new Gepkocsi(5, 4, 1410);
    }
    
    static String getVer(Jarmu j) {
        return Jarmu.getVerzio() + "/" + j.getKerekek();
    }
    
}
