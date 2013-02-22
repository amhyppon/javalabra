/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioVarasto;

import olioLuokat.*;

/**
 * Rotu varastoa käytetään luomaan rotuja jotka palautetaan returneilla.
 * @author Hyppönen
 */
public class RotuVarasto {

    public static Rotu luoIhminen() {
        Rotu ihminen = new Rotu("Ihminen", 2, 2);
        return ihminen;
    }

    public static Rotu luoHaltia() {
        Rotu haltia = new Rotu("Haltia", 3, 1);
        return haltia;
    }

    public static Rotu luoKaapio() {
        Rotu kaapio = new Rotu("Kääpiö", 1, 3);
        return kaapio;
    }
}
