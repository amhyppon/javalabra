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
public class rotuVarasto {

    public static rotu luoIhminen() {
        rotu ihminen = new rotu("Ihminen", 2, 2);
        return ihminen;
    }

    public static rotu luoHaltia() {
        rotu haltia = new rotu("Haltia", 3, 1);
        return haltia;
    }

    public static rotu luoKaapio() {
        rotu kaapio = new rotu("Kääpiö", 1, 3);
        return kaapio;
    }
}
