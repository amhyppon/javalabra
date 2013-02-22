/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioVarasto;
import olioLuokat.*;

/**
 * Haarniska varastoa käytetään luomaan haarniskoja jotka palautetaan returneilla.
 * @author Hyppönen
 */
public class HaarniskaVarasto {
    
    public static Haarniska luoKevytHaarniska() {
        Haarniska kevytHaarniska = new Haarniska("Kevyt haarniska", 0, 1);
        return kevytHaarniska;
    }
    
    public static Haarniska luoRaskasHaarniska() {
        Haarniska raskasHaarniska = new Haarniska("Raskas haarniska", -1, 2);
        return raskasHaarniska;
    }
}
