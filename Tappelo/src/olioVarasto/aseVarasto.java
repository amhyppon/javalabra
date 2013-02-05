/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioVarasto;
import olioLuokat.*;
/**
 *
 * @author Hyppönen
 */

public class aseVarasto {
    
    public static ase luoMiekka() {
        ase miekka = new ase("Miekka", "miekka");
        return miekka;
    }
    
    public static ase luoKirves() {
        ase kirves = new ase("Kirves", "kirves");
        return kirves;
    }
    
    public static ase luoMoukari() {
        ase moukari = new ase("Moukari", "moukari");
        return moukari;
    }

}
