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

        boolean peliJatkuu = true;
        hahmo vuorossaOlevaHahmo;

        while (peliJatkuu = true) {

            vuorossaOlevaHahmo = tamanhetkinenVuoro.getVuorossaOlevaHahmo();

            System.out.println(pelaajanHahmo.toString());
            System.out.println(vastustajanHahmo.toString());

            if (pelaajanHahmo.getHahmonNimi() == vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("Pelaajan vuoro");
                pelaajanVuoro();
            }

            if (pelaajanHahmo.getHahmonNimi() != vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("Vastustajan vuoro");
            }

            peliJatkuu = jatkuukoPeli();

            tamanhetkinenVuoro.seuraavaVuoro();
        }
    }

    /**
     * Käyttäjältä kysytään valinta hyökkäyksen ja loukkausen välillä.
     * Valittaessa hyökkäys vastustaja arpoo vastatointonsa torjumisesta ja
     * väistämisestä. Valittaessa loukkaus kysytään käyttäjää valitsemaan
     * loukkaus. Loukkauksiin on sidottu loukattava rotu.
     */
    public static void pelaajanVuoro() {

        Scanner lukija = new Scanner(System.in);

        String valinta = "ei valintaa";

        while (valinta != "1" || valinta != "2") {
            System.out.println("Valitse toiminto numerolla:");
            System.out.println("1. Hyökkäys");
            System.out.println("2. Loukkaus");

            valinta = lukija.nextLine();
        }

        if (valinta == "1") {

            int vastustajanValinta = noppa.arvoNumero(2);

            if (vastustajanValinta == 1) {
                System.out.println("Vastustaja yrittää torjua iskun!");
                toiminto.torjuminen(vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 2) {
                System.out.println("Vastustaja yrittää väistää iskun!");
                toiminto.vaistaminen(vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }
        }

        if (valinta == "2") {

            valinta = "ei valintaa";

            while (valinta != "1" || valinta != "2" || valinta != "3") {
                System.out.println("Valitse loukkaus numerolla:");
                System.out.println("1. Loukkaa vastustajasi keskinkertaisuutta");
                System.out.println("2. Loukkaa vastustajasi korvia");
                System.out.println("3. Loukkaa vastustajasi pituutta");

                valinta = lukija.nextLine();
            }

            if (valinta == "1") {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoIhminen(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta == "2") {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoKaapio(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta == "3") {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoHaltia(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

        }
    }

    public static void vastustajanVuoro() {

        Scanner lukija = new Scanner(System.in);

        int vastustajanValinta = noppa.arvoNumero(2);

        if (vastustajanValinta == 1) {

            String valinta = "ei valintaa";

            System.out.println("Vastustaja valitsi hyökkäyksen!");

            while (valinta != "1" || valinta != "2") {

                System.out.println("Valitse vastatoimintosi numerolla:");
                System.out.println("1. Yritä torjua isku");
                System.out.println("2. Yritä väistää isku");

                valinta = lukija.nextLine();
            }

            if (valinta == "1") {
                toiminto.torjuminen(vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta == "2") {
                toiminto.vaistaminen(vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }
        }

        if (vastustajanValinta == 2) {

            System.out.println("Vastustaja valitsi loukkausen!");

            vastustajanValinta = noppa.arvoNumero(3);

            if (vastustajanValinta == 1) {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoIhminen(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 2) {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoKaapio(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 3) {
                toiminto.loukkaaVastustajaa(olioVarasto.rotuVarasto.luoHaltia(), vuoro.getVuorossaOlevaHahmo(), vuoro.getVuoroaOdottavaHahmo());
            }
        }

    }
    
    /**
     * 
     * @return 
     */
    public static boolean jatkuukoPeli() {
    
        boolean jatkuvuus = true;
        
        if (pelaajanHahmo.getHahmonKestavyys() <= 0 || vastustajanHahmo.getHahmonKestavyys() <= 0) {
        
            jatkuvuus = false;
            
            if (pelaajanHahmo.getHahmonKestavyys() <= 0) {
                System.out.println("Hahmosi kärsi häviön... Parempaa tuuria seuraavalle kerralle!");
            }
            
            if (vastustajanHahmo.getHahmonKestavyys() <= 0) {
                System.out.println("Hahmosi oli voitokas!");
                
                pelaajanHahmo.hahmolleVoittoPiste();
            }
            
           pelaajanHahmo.palautaKestävyys(); 
        }
        
        return jatkuvuus;
    }
}
