/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import java.util.Scanner;
import logiikka.Noppa;
import olioLuokat.*;
import olioVarasto.*;

/**
 *
 * @author Hyppönen
 */
public class VastustajanHahmonLuonti {

    private Scanner lukija = new Scanner(System.in);
    private Noppa noppa = new Noppa();

    /**
     * Luokan perusidea, luodaan arvottu hahmo vastustajaksi.
     *
     * @return
     */
    public Hahmo vastustajanHahmonLuonti() {

        Hahmo vastustajanHahmo;
        String valittuVastustajanHahmonNimi;
        Rotu valittuVastustajanHahmonRotu;
        Ase valittuVastustajanHahmonAse;
        Haarniska valittuVastustajanHahmonHaarniska;

        valittuVastustajanHahmonRotu = arvoVastustajanHahmonRotu();
        valittuVastustajanHahmonAse = arvoVastustajanHahmonAse();
        valittuVastustajanHahmonHaarniska = arvoVastustajanHahmonHaarniska();
        valittuVastustajanHahmonNimi = nimeaVastustajanHahmo();

        vastustajanHahmo = new Hahmo(valittuVastustajanHahmonNimi, valittuVastustajanHahmonRotu, valittuVastustajanHahmonHaarniska, valittuVastustajanHahmonAse);

        return vastustajanHahmo;

    }

    /**
     * Nimeää vastustajan hahmon nimellä "Vastustajan hahmo".
     * @return palauttaa annetun nimen
     */
    public String nimeaVastustajanHahmo() {

        String vastustajanHahmonNimi = "Vastustajan hahmo";

        return vastustajanHahmonNimi;
    }

    /**
     * Metodi arpoo (vastustajan hahmolle) rodun noppa -luokan arvoNumero metodia käyttäen.
     * @return palauttaa arvotun rodun
     */
    
    public Rotu arvoVastustajanHahmonRotu() {

        int syotettyValinta = noppa.arvoNumero(3);
        Rotu vastustajanHahmonRotu = RotuVarasto.luoIhminen();

        if (syotettyValinta == 2) {
            vastustajanHahmonRotu = RotuVarasto.luoHaltia();
        }

        if (syotettyValinta == 3) {
            vastustajanHahmonRotu = RotuVarasto.luoKaapio();
        }

        return vastustajanHahmonRotu;

    }
    
/**
 * Metodi arpoo (vastustajan hahmolle) aseen käyttäen noppa -luokan arvoNumero metodia käyttäen.
 * @return palattaa arvotun aseen
 */
    
    public Ase arvoVastustajanHahmonAse() {

        int syotettyValinta = noppa.arvoNumero(3);
        Ase vastustajanHahmonAse = AseVarasto.luoMiekka();

        if (syotettyValinta == 2) {
            vastustajanHahmonAse = AseVarasto.luoKirves();
        }

        if (syotettyValinta == 3) {
            vastustajanHahmonAse = AseVarasto.luoMoukari();
        }

        return vastustajanHahmonAse;

    }

    /**
     * Metodi arpoo (vastustajan hahmolle) haarniskan käyttäen noppa -luokan arvoNumero metodia käyttäen.
     * @return palauttaa arvotun haarniskan
     */
    
    public Haarniska arvoVastustajanHahmonHaarniska() {

        int syotettyValinta = noppa.arvoNumero(2);
        Haarniska vastustajanHahmonHaarniska = HaarniskaVarasto.luoKevytHaarniska();

        if (syotettyValinta == 2) {
            vastustajanHahmonHaarniska = HaarniskaVarasto.luoRaskasHaarniska();
        }

        return vastustajanHahmonHaarniska;

    }
}
