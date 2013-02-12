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

    private static hahmo vuorossaOlevaHahmo;
    private static hahmo vuoroaOdottavaHahmo;

    /**
     * Vuoro olio pitää kirjaa minkä hahmon vuoro milloinki on.
     * @param annettuPelaajanHahmo
     * @param annettuVastustajanHahmo 
     */
    public vuoro(hahmo annettuPelaajanHahmo, hahmo annettuVastustajanHahmo) {

        vuorossaOlevaHahmo = annettuPelaajanHahmo;
        vuoroaOdottavaHahmo = annettuVastustajanHahmo;

    }
/**
 * Metodi vaihtaa vuorossa olevaa hahmoa.
 */
    public static void seuraavaVuoro() {

        hahmo valiaikainenHahmoPaikka = vuorossaOlevaHahmo;
        vuorossaOlevaHahmo = vuoroaOdottavaHahmo;
        vuoroaOdottavaHahmo = valiaikainenHahmoPaikka;
    }

    public static hahmo getVuorossaOlevaHahmo() {
        return vuorossaOlevaHahmo;
    }
    
    public static hahmo getVuoroaOdottavaHahmo() {
        return vuoroaOdottavaHahmo;
    }
}
