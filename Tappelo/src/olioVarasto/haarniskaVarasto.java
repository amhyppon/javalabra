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
public class haarniskaVarasto {
    
    public static haarniska luoKevytHaarniska() {
        haarniska kevytHaarniska = new haarniska("Kevyt haarniska", 0, 1);
        return kevytHaarniska;
    }
    
    public static haarniska luoRaskasHaarniska() {
        haarniska raskasHaarniska = new haarniska("Raskas haarniska", -1, 2);
        return raskasHaarniska;
    }
}
