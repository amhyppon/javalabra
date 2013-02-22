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
public class Vuoro {

    private static Hahmo vuorossaOlevaHahmo;
    private static Hahmo vuoroaOdottavaHahmo;

    /**
     * Vuoro olio pitää kirjaa minkä hahmon vuoro milloinki on.
     *
     * @param annettuPelaajanHahmo
     * @param annettuVastustajanHahmo
     */
    public Vuoro(Hahmo annettuPelaajanHahmo, Hahmo annettuVastustajanHahmo) {

        vuorossaOlevaHahmo = annettuPelaajanHahmo;
        vuoroaOdottavaHahmo = annettuVastustajanHahmo;

    }

    /**
     * Metodi vaihtaa vuorossa olevaa hahmoa. Käytettäväksi vuoron lopussa
     * hahmon toimittua.
     */
    public static void seuraavaVuoro() {

        Hahmo valiaikainenHahmoPaikka = vuorossaOlevaHahmo;
        vuorossaOlevaHahmo = vuoroaOdottavaHahmo;
        vuoroaOdottavaHahmo = valiaikainenHahmoPaikka;
    }

    public static Hahmo getVuorossaOlevaHahmo() {
        return vuorossaOlevaHahmo;
    }

    public static Hahmo getVuoroaOdottavaHahmo() {
        return vuoroaOdottavaHahmo;
    }
}
