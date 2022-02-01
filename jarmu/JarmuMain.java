/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarmu;

import jarmu.GkImpl;

/**
 *
 * @author szalaijo
 */
public class JarmuMain {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Object bObj = new Jarmu(3, 18.0); // Az Object osztály mindennek az őse (implicit exdends)
        System.out.println("Object bicikli:" + bObj.toString()); // Az Object-ben van toString, de a Jarmu-ben felülírtuk. A Jarmu metódusait NEM LÁTJUK!
        Jarmu bicikli = new Jarmu(2, 15.0);
        System.out.println("Bicikli kerékterhelés: " + bicikli.kerekTerheles());
        Jarmu trabant = new Gepkocsi(4, 4, 600.0);
        System.out.println("Trabant jármű kerékterhelés: " + trabant.kerekTerheles());
        Gepkocsi trabant2 = new Gepkocsi(4, 4, 600.0);
        System.out.println("Trabant gépkocsi kerékterhelés: " + trabant2.kerekTerheles());
        Gepkocsi wartburg = new Gepkocsi(5, 4, 1300.0);
        System.out.println("Wartburg kerékterhelés: " + wartburg.kerekTerheles());
        TeherGepkocsi Ifa = new TeherGepkocsi(3000, 3, 4, 2500);
        System.out.println("Ifa kerékterhelés: " + Ifa.kerekTerheles());
        //Jarmu.set_verzio("v2");
        gkGen();
    }
    
    public static void gkGen() {
        Jarmu volga = new Gepkocsi(5, 4, 1000);
        GkImpl jarmuvek = new GkImpl();
        Jarmu bmx = jarmuvek.ujBmx();
        System.out.println("Volga kerékterhelés: " + volga.kerekTerheles() + " verz:" + GkInterf.getVer(volga));
        System.out.println("Bmx kerékterhelés: " + bmx.kerekTerheles() + " verz:" + GkInterf.getVer(bmx));
        Gepkocsi skoda = jarmuvek.ujSkoda();
        Gepkocsi.set_verzio("v2"); //Jarmuben van, static, a getVer az ibterface-ben, ez is static
        System.out.println("ujSkoda kerékterhelés: " + skoda.kerekTerheles() + " verz:" + GkInterf.getVer(skoda));
        System.out.println("ujZsiga kerékterhelés: " + jarmuvek.ujZsiga().kerekTerheles());
        System.out.println("ujDacia kerékterhelés: " + jarmuvek.ujDacia().kerekTerheles()); // Ez default az interface-ben
    }
    
}
