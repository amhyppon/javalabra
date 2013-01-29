/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import olioLuokat.*;

/**
 *
 * @author Hyppönen
 */
public class vuoro {

    static hahmo vuorossaOlevaHahmo;
    static hahmo vuoroaOdottavaHahmo;

    public static void ensimmainenVuoro(hahmo annettuPelaajanHahmo, hahmo annettuVastustajanHahmo) {

        vuorossaOlevaHahmo = annettuPelaajanHahmo;
        vuoroaOdottavaHahmo = annettuVastustajanHahmo;

    }

    public static void seuraavaVuoro() {

        hahmo valiaikainenHahmoPaikka = vuorossaOlevaHahmo;
        vuorossaOlevaHahmo = vuoroaOdottavaHahmo;
        vuoroaOdottavaHahmo = valiaikainenHahmoPaikka;
    }

    public static hahmo kenenVuoro() {
        return vuorossaOlevaHahmo;
    }
}
