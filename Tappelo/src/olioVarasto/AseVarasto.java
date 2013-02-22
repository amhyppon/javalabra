/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioVarasto;
import olioLuokat.*;
/**
 * Ase varastoa käytetään luomaan aseita jotka palautetaan returneilla.
 * @author Hyppönen
 */

public class AseVarasto {
    
    public static Ase luoMiekka() {
        Ase miekka = new Ase("Miekka", "miekka");
        return miekka;
    }
    
    public static Ase luoKirves() {
        Ase kirves = new Ase("Kirves", "kirves");
        return kirves;
    }
    
    public static Ase luoMoukari() {
        Ase moukari = new Ase("Moukari", "moukari");
        return moukari;
    }

}
