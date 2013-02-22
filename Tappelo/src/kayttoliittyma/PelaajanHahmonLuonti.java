/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import java.util.Scanner;
import olioLuokat.*;
import olioVarasto.*;
import logiikka.*;

/**
 *
 * @author Hyppönen
 */
public class PelaajanHahmonLuonti {

    private Scanner lukija = new Scanner(System.in);
    private Toiminto toiminto = new Toiminto();

    /**
     * Luokalla rakennetaan pelaajalle hahmo kysymällä tältä listattuja
     * valintoja.
     *
     * @return palauttaa käyttäjän muokkaaman hahmon
     */
    public Hahmo pelaajanHahmonLuonti() {

        Hahmo pelaajanHahmo;
        String valittuPelaajanHahmonNimi;
        Rotu valittuPelaajanHahmonRotu;
        Ase valittuPelaajanHahmonAse;
        Haarniska valittuPelaajanHahmonHaarniska;

        valittuPelaajanHahmonRotu = kysyPelaajanHahmonRotua();
        valittuPelaajanHahmonAse = kysyPelaajanHahmonAsetta();
        valittuPelaajanHahmonHaarniska = kysyPelaajanHahmonHaarniskaa();
        valittuPelaajanHahmonNimi = kysyPelaajanHahmonNimea();

        pelaajanHahmo = new Hahmo(valittuPelaajanHahmonNimi, valittuPelaajanHahmonRotu, valittuPelaajanHahmonHaarniska, valittuPelaajanHahmonAse);

        return pelaajanHahmo;

    }

    /**
     * Kysytään käyttäjältä hahmon nimeä. Mikäli käyttäjä ei anna nimeä tai
     * yrittää nimetä hahmon nimellä "Vastustajan hahmo" asetetaan nimeksi
     * "Pelaajan hahmo".
     *
     * @return palauttaa valitun nimen
     */
    public String kysyPelaajanHahmonNimea() {

        System.out.println("Anna hahmosi nimi:");

        String pelaajanHahmonNimi = lukija.nextLine();

        if (pelaajanHahmonNimi.equals("") || pelaajanHahmonNimi.equals("Vastustajan hahmo")) {
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
    public Rotu kysyPelaajanHahmonRotua() {

        String syotettyValinta = "ei valittu";
        Rotu pelaajanHahmonRotu = RotuVarasto.luoIhminen();
        boolean validiRotuValinta = false;

        System.out.println("Valitse hahmosi rotu numerolla:");
        System.out.println("1. Ihminen");
        System.out.println("2. Haltia");
        System.out.println("3. Kääpiö");
        System.out.println("0. Poistu pelistä");

        while (validiRotuValinta == false) {

            syotettyValinta = lukija.nextLine();

            if (!syotettyValinta.equals("1") && !syotettyValinta.equals("2") && !syotettyValinta.equals("3") && !syotettyValinta.equals("") && !syotettyValinta.equals("0")) {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta.equals("1") || syotettyValinta.equals("")) {
                System.out.println("Valitsit hahmosi roduksi ihmisen");
                validiRotuValinta = true;
            }

            if (syotettyValinta.equals("2")) {
                System.out.println("Valitsit hahmosi roduksi haltian");
                pelaajanHahmonRotu = RotuVarasto.luoHaltia();
                validiRotuValinta = true;
            }

            if (syotettyValinta.equals("3")) {
                System.out.println("Valitsit hahmosi roduksi kääpiön");
                pelaajanHahmonRotu = RotuVarasto.luoKaapio();
                validiRotuValinta = true;
            }
            
            if (syotettyValinta.equals("0")) {
                toiminto.poistuPelista();
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
    public Ase kysyPelaajanHahmonAsetta() {

        String syotettyValinta = "ei valittu";
        Ase pelaajanHahmonAse = AseVarasto.luoMiekka();
        boolean validiAseValinta = false;

        System.out.println("Valitse hahmosi ase numerolla:");
        System.out.println("1. Miekka");
        System.out.println("2. Kirves");
        System.out.println("3. Moukari");
        System.out.println("0. Poistu pelistä");

        while (validiAseValinta == false) {

            syotettyValinta = lukija.nextLine();

            if (!syotettyValinta.equals("1") && !syotettyValinta.equals("2") && !syotettyValinta.equals("3") && !syotettyValinta.equals("") && !syotettyValinta.equals("0")) {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta.equals("1") || syotettyValinta.equals("")) {
                System.out.println("Valitsit hahmosi aseeksi miekan");
                validiAseValinta = true;
            }

            if (syotettyValinta.equals("2")) {
                System.out.println("Valitsit hahmosi aseeksi kirveen");
                pelaajanHahmonAse = AseVarasto.luoKirves();
                validiAseValinta = true;
            }

            if (syotettyValinta.equals("3")) {
                System.out.println("Valitsit hahmosi aseeksi moukarin");
                pelaajanHahmonAse = AseVarasto.luoMoukari();
                validiAseValinta = true;
            }
            
            if (syotettyValinta.equals("0")) {
                toiminto.poistuPelista();
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
    public Haarniska kysyPelaajanHahmonHaarniskaa() {

        String syotettyValinta = "ei valittu";
        Haarniska pelaajanHahmonHaarniska = HaarniskaVarasto.luoKevytHaarniska();
        boolean validiHaarniskaValinta = false;

        System.out.println("Valitse hahmosi haarniska numerolla:");
        System.out.println("1. Kevyt haarniska");
        System.out.println("2. Raskas haarniska");
        System.out.println("0. Poistu pelistä");

        while (validiHaarniskaValinta == false) {

            syotettyValinta = lukija.nextLine();

            if (!syotettyValinta.equals("1") && !syotettyValinta.equals("2") && !syotettyValinta.equals("") && !syotettyValinta.equals("0")) {
                System.out.println("Valintasi oli virheellinen, tarkista antamasi valinta!");
            }

            if (syotettyValinta.equals("1") || syotettyValinta.equals("")) {
                System.out.println("Valitsit hahmosi haarniskaksi kevyt haarniskan");
                validiHaarniskaValinta = true;
            }

            if (syotettyValinta.equals("2")) {
                System.out.println("Valitsit hahmosi haarniskaksi raskas haarniskan");
                pelaajanHahmonHaarniska = HaarniskaVarasto.luoRaskasHaarniska();
                validiHaarniskaValinta = true;
            }
            
            if (syotettyValinta.equals("0")) {
                toiminto.poistuPelista();
            }


        }

        return pelaajanHahmonHaarniska;

    }
}
