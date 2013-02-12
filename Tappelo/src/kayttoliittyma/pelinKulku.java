/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import logiikka.*;
import olioLuokat.*;
import olioVarasto.*;
import java.util.Scanner;

/**
 *
 * @author Hyppönen
 */
public class pelinKulku {

    private static hahmo pelaajanHahmo;
    private static hahmo vastustajanHahmo;
    private static vuoro tamanhetkinenVuoro;

    /**
     * Tällä metodilla aloitetaan peli. Metodin avulla luodaan hahmot ja
     * asetetaan ensimmäinen vuoro.
     */
    public static void pelinAloitus() {

        pelaajanHahmo = pelaajanHahmonLuonti.pelaajanHahmonLuonti();
        vastustajanHahmo = vastustajanHahmonLuonti.vastustajanHahmonLuonti();

        tamanhetkinenVuoro = new vuoro(pelaajanHahmo, vastustajanHahmo);
    }

    /**
     * Nimensä mukaisesti vastaa vuorojen etenemisestä ja mitä vuorolla
     * tapahtuu. While loopin if-lauseet määrittävät kumman hahmon vuoro on.
     */
    public static void vuoroRotaatio() {

        Scanner lukija = new Scanner(System.in);

        String valinta = "ei valintaa";
        hahmo vuorossaOlevaHahmo;

        while (valinta != "0") {

            vuorossaOlevaHahmo = tamanhetkinenVuoro.getVuorossaOlevaHahmo();

            if (pelaajanHahmo.getHahmonNimi() == vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("Pelaajan vuoro");
            }

            if (pelaajanHahmo.getHahmonNimi() != vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("Pelaajan vuoro");
            }

            tamanhetkinenVuoro.seuraavaVuoro();
        }
    }
}
