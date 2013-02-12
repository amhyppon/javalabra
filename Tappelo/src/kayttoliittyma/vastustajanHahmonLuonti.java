/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import java.util.Scanner;
import logiikka.noppa;
import olioLuokat.*;
import olioVarasto.*;

/**
 *
 * @author Hyppönen
 */
public class vastustajanHahmonLuonti {

    static Scanner lukija = new Scanner(System.in);

    /**
     * Luokan perusidea, luodaan arvottu hahmo vastustajaksi.
     *
     * @return
     */
    public static hahmo vastustajanHahmonLuonti() {

        hahmo vastustajanHahmo;
        String valittuVastustajanHahmonNimi;
        rotu valittuVastustajanHahmonRotu;
        ase valittuVastustajanHahmonAse;
        haarniska valittuVastustajanHahmonHaarniska;

        valittuVastustajanHahmonRotu = arvoVastustajanHahmonRotu();
        valittuVastustajanHahmonAse = arvoVastustajanHahmonAse();
        valittuVastustajanHahmonHaarniska = arvoVastustajanHahmonHaarniska();
        valittuVastustajanHahmonNimi = nimeaVastustajanHahmo();

        vastustajanHahmo = new hahmo(valittuVastustajanHahmonNimi, valittuVastustajanHahmonRotu, valittuVastustajanHahmonHaarniska, valittuVastustajanHahmonAse);

        return vastustajanHahmo;

    }

    /**
     * Nimeää vastustajan hahmon nimellä "Vastustajan hahmo".
     * @return palauttaa annetun nimen
     */
    public static String nimeaVastustajanHahmo() {

        String vastustajanHahmonNimi = "Vastustajan hahmo";

        return vastustajanHahmonNimi;
    }

    /**
     * Metodi arpoo (vastustajan hahmolle) rodun noppa -luokan arvoNumero metodia käyttäen.
     * @return palauttaa arvotun rodun
     */
    
    public static rotu arvoVastustajanHahmonRotu() {

        int syotettyValinta = noppa.arvoNumero(3);
        rotu vastustajanHahmonRotu = rotuVarasto.luoIhminen();

        if (syotettyValinta == 2) {
            vastustajanHahmonRotu = rotuVarasto.luoHaltia();
        }

        if (syotettyValinta == 3) {
            vastustajanHahmonRotu = rotuVarasto.luoKaapio();
        }

        return vastustajanHahmonRotu;

    }
    
/**
 * Metodi arpoo (vastustajan hahmolle) aseen käyttäen noppa -luokan arvoNumero metodia käyttäen.
 * @return palattaa arvotun aseen
 */
    
    public static ase arvoVastustajanHahmonAse() {

        int syotettyValinta = noppa.arvoNumero(3);
        ase vastustajanHahmonAse = aseVarasto.luoMiekka();

        if (syotettyValinta == 2) {
            vastustajanHahmonAse = aseVarasto.luoKirves();
        }

        if (syotettyValinta == 3) {
            vastustajanHahmonAse = aseVarasto.luoMoukari();
        }

        return vastustajanHahmonAse;

    }

    /**
     * Metodi arpoo (vastustajan hahmolle) haarniskan käyttäen noppa -luokan arvoNumero metodia käyttäen.
     * @return palauttaa arvotun haarniskan
     */
    
    public static haarniska arvoVastustajanHahmonHaarniska() {

        int syotettyValinta = noppa.arvoNumero(2);
        haarniska vastustajanHahmonHaarniska = haarniskaVarasto.luoKevytHaarniska();

        if (syotettyValinta == 2) {
            vastustajanHahmonHaarniska = haarniskaVarasto.luoRaskasHaarniska();
        }

        return vastustajanHahmonHaarniska;

    }
}
