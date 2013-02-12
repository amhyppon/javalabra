/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import java.util.Scanner;
import olioLuokat.*;
import olioVarasto.*;

/**
 *
 * @author Hyppönen
 */
public class pelaajanHahmonLuonti {

    static Scanner lukija = new Scanner(System.in);

    /**
     * Luokalla rakennetaan pelaajalle hahmo kysymällä tältä listattuja
     * valintoja.
     *
     * @return palauttaa käyttäjän muokkaaman hahmon
     */
    public static hahmo pelaajanHahmonLuonti() {

        hahmo pelaajanHahmo;
        String valittuPelaajanHahmonNimi;
        rotu valittuPelaajanHahmonRotu;
        ase valittuPelaajanHahmonAse;
        haarniska valittuPelaajanHahmonHaarniska;

        valittuPelaajanHahmonRotu = kysyPelaajanHahmonRotua();
        valittuPelaajanHahmonAse = kysyPelaajanHahmonAsetta();
        valittuPelaajanHahmonHaarniska = kysyPelaajanHahmonHaarniskaa();
        valittuPelaajanHahmonNimi = kysyPelaajanHahmonNimea();

        pelaajanHahmo = new hahmo(valittuPelaajanHahmonNimi, valittuPelaajanHahmonRotu, valittuPelaajanHahmonHaarniska, valittuPelaajanHahmonAse);

        return pelaajanHahmo;

    }

    /**
     * Kysytään käyttäjältä hahmon nimeä. Mikäli käyttäjä ei anna nimeä tai
     * yrittää nimetä hahmon nimellä "Vastustajan hahmo" asetetaan nimeksi
     * "Pelaajan hahmo".
     *
     * @return palauttaa valitun nimen
     */
    public static String kysyPelaajanHahmonNimea() {

        System.out.println("Anna hahmosi nimi:");

        String pelaajanHahmonNimi = lukija.nextLine();

        if (pelaajanHahmonNimi == "" || pelaajanHahmonNimi == "Vastustajan hahmo") {
            pelaajanHahmonNimi = "Pelaajan hahmo";
        }

        return pelaajanHahmonNimi;
    }

    /**
     * Pyydetään käyttäjää valitsemaan hahmon rotu listasta. Tyhjä valinta
     * lasketaan valinnaksi 1.
     *
     * @return palautetaan valittu rotu
     */
    public static rotu kysyPelaajanHahmonRotua() {

        String syotettyValinta = "ei valittu";
        rotu pelaajanHahmonRotu = rotuVarasto.luoIhminen();

        System.out.println("Valitse hahmosi rotu numerolla:");
        System.out.println("1. Ihminen");
        System.out.println("2. Haltia");
        System.out.println("3. Kääpiö");

        while (syotettyValinta == "ei valittu" || syotettyValinta == "1" || syotettyValinta == "2" || syotettyValinta == "3" || syotettyValinta == "") {

            syotettyValinta = lukija.nextLine();

            if (syotettyValinta != "1" || syotettyValinta != "2" || syotettyValinta != "3" || syotettyValinta != "") {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta == "1" || syotettyValinta == "") {
                System.out.println("Valitsit hahmosi roduksi ihmisen");
            }

            if (syotettyValinta == "2") {
                System.out.println("Valitsit hahmosi roduksi haltian");
                pelaajanHahmonRotu = rotuVarasto.luoHaltia();
            }

            if (syotettyValinta == "3") {
                System.out.println("Valitsit hahmosi roduksi kääpiön");
                pelaajanHahmonRotu = rotuVarasto.luoKaapio();
            }

        }

        return pelaajanHahmonRotu;

    }

    /**
     * Pyydetään käyttäjää valitsemaan hahmon ase listasta. Tyhjä valinta
     * lasketaan valinnaksi 1.
     *
     * @return palautetaan valittu ase
     */
    public static ase kysyPelaajanHahmonAsetta() {

        String syotettyValinta = "ei valittu";
        ase pelaajanHahmonAse = aseVarasto.luoMiekka();

        System.out.println("Valitse hahmosi ase numerolla:");
        System.out.println("1. Miekka");
        System.out.println("2. Kirves");
        System.out.println("3. Moukari");

        while (syotettyValinta == "ei valittu" || syotettyValinta == "1" || syotettyValinta == "2" || syotettyValinta == "3" || syotettyValinta == "") {

            syotettyValinta = lukija.nextLine();

            if (syotettyValinta != "1" || syotettyValinta != "2" || syotettyValinta != "3" || syotettyValinta != "") {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta == "1" || syotettyValinta == "") {
                System.out.println("Valitsit hahmosi aseeksi miekan");
            }

            if (syotettyValinta == "2") {
                System.out.println("Valitsit hahmosi aseeksi kirveen");
                pelaajanHahmonAse = aseVarasto.luoKirves();
            }

            if (syotettyValinta == "3") {
                System.out.println("Valitsit hahmosi aseeksi moukarin");
                pelaajanHahmonAse = aseVarasto.luoMoukari();
            }

        }

        return pelaajanHahmonAse;

    }

    /**
     * Pyydetään käyttäjää valitsemaan hahmon haarniska listasta. Tyhjä valinta
     * lasketaan valinnaksi 1.
     *
     * @return palautetaan valittu haarniska
     */
    public static haarniska kysyPelaajanHahmonHaarniskaa() {

        String syotettyValinta = "ei valittu";
        haarniska pelaajanHahmonHaarniska = haarniskaVarasto.luoKevytHaarniska();

        System.out.println("Valitse hahmosi haarniska numerolla:");
        System.out.println("1. Kevyt haarniska");
        System.out.println("2. Raskas haarniska");

        while (syotettyValinta == "ei valittu" || syotettyValinta == "1" || syotettyValinta == "2" || syotettyValinta == "") {

            syotettyValinta = lukija.nextLine();

            if (syotettyValinta != "1" || syotettyValinta != "2" || syotettyValinta != "") {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta == "1" || syotettyValinta == "") {
                System.out.println("Valitsit hahmosi haarniskaksi kevyt haarniskan");
            }

            if (syotettyValinta == "2") {
                System.out.println("Valitsit hahmosi haarniskaksi raskas haarniskan");
                pelaajanHahmonHaarniska = haarniskaVarasto.luoRaskasHaarniska();
            }


        }

        return pelaajanHahmonHaarniska;

    }
}
