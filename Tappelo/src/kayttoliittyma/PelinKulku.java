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
public class PelinKulku {

    private Hahmo pelaajanHahmo;
    private Hahmo vastustajanHahmo;
    private Vuoro tamanhetkinenVuoro;
    private Noppa noppa = new Noppa();
    private Toiminto toiminto = new Toiminto();

    /**
     * Tällä metodilla aloitetaan peli. Metodin avulla luodaan hahmot ja
     * asetetaan ensimmäinen vuoro.
     */
    public void pelinAloitus() {

        PelaajanHahmonLuonti pelaajanHahmonLuonti = new PelaajanHahmonLuonti();
        VastustajanHahmonLuonti vastustajanHahmonLuonti = new VastustajanHahmonLuonti();

        pelaajanHahmo = pelaajanHahmonLuonti.pelaajanHahmonLuonti();
        vastustajanHahmo = vastustajanHahmonLuonti.vastustajanHahmonLuonti();

        tamanhetkinenVuoro = new Vuoro(pelaajanHahmo, vastustajanHahmo);
    }

    /**
     * Nimensä mukaisesti vastaa vuorojen etenemisestä ja mitä vuorolla
     * tapahtuu. While loopin if-lauseet määrittävät kumman hahmon vuoro on.
     */
    public void vuoroRotaatio() {

        Scanner lukija = new Scanner(System.in);

        boolean peliJatkuu = true;
        Hahmo vuorossaOlevaHahmo;

        while (peliJatkuu == true) {

            vuorossaOlevaHahmo = tamanhetkinenVuoro.getVuorossaOlevaHahmo();

            if (pelaajanHahmo.getHahmonNimi() == vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("");
                System.out.println("---==# Pelaajan vuoro #==---");

                System.out.println(pelaajanHahmo.toString());
                System.out.println(vastustajanHahmo.toString());

                pelaajanVuoro();
            }

            if (pelaajanHahmo.getHahmonNimi() != vuorossaOlevaHahmo.getHahmonNimi()) {

                System.out.println("");
                System.out.println("---==# Vastustajan vuoro #==---");

                System.out.println(pelaajanHahmo.toString());
                System.out.println(vastustajanHahmo.toString());

                vastustajanVuoro();
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
    public void pelaajanVuoro() {

        Scanner lukija = new Scanner(System.in);

        String valinta = "ei valintaa";

        while (!valinta.equals("1") && !valinta.equals("2") && !valinta.equals("0")) {
            System.out.println("Valitse toiminto numerolla:");
            System.out.println("1. Hyökkäys");
            System.out.println("2. Loukkaus");
            System.out.println("0. Poistu pelistä");

            valinta = lukija.nextLine();
        }

        if (valinta.equals("1")) {

            int vastustajanValinta = noppa.arvoNumero(2);

            if (vastustajanValinta == 1) {
                System.out.println("Vastustaja yrittää torjua iskun!");
                toiminto.torjuminen(Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 2) {
                System.out.println("Vastustaja yrittää väistää iskun!");
                toiminto.vaistaminen(Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

        }

        if (valinta.equals("2")) {

            valinta = "ei valintaa";

            while (!valinta.equals("1") && !valinta.equals("2") && !valinta.equals("3") && !valinta.equals("0")) {
                System.out.println("Valitse loukkaus numerolla:");
                System.out.println("1. Loukkaa vastustajasi keskinkertaisuutta");
                System.out.println("2. Loukkaa vastustajasi korvia");
                System.out.println("3. Loukkaa vastustajasi pituutta");
                System.out.println("0. Poistu pelistä");

                valinta = lukija.nextLine();
            }

            if (valinta.equals("1")) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoIhminen(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta.equals("2")) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoKaapio(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta.equals("3")) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoHaltia(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta.equals("0")) {
                toiminto.poistuPelista();
            }

        }

        if (valinta.equals("0")) {
            toiminto.poistuPelista();
        }
    }

    /**
     * VastustajanVuoro hoitaa nimensä mukaisesti vastustajan vuoroa. Vuorollaan
     * vastustaja tekee samat valinnat kuin käyttäjä tekisi, mutta teköälyn
     * virkaa hoitaa Noppa luokan arvoNumero metodi.
     */
    public void vastustajanVuoro() {

        Scanner lukija = new Scanner(System.in);

        int vastustajanValinta = noppa.arvoNumero(2);

        if (vastustajanValinta == 1) {

            String valinta = "ei valintaa";

            System.out.println("Vastustaja valitsi hyökkäyksen!");

            while (!valinta.equals("1") && !valinta.equals("2") && !valinta.equals("0")) {

                System.out.println("Valitse vastatoimintosi numerolla:");
                System.out.println("1. Yritä torjua isku");
                System.out.println("2. Yritä väistää isku");
                System.out.println("0. Poistu pelistä");

                valinta = lukija.nextLine();
            }

            if (valinta.equals("1")) {
                toiminto.torjuminen(Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta.equals("2")) {
                toiminto.vaistaminen(Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (valinta.equals("0")) {
                toiminto.poistuPelista();
            }
        }

        if (vastustajanValinta == 2) {

            System.out.println("Vastustaja valitsi loukkausen!");

            vastustajanValinta = noppa.arvoNumero(3);

            if (vastustajanValinta == 1) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoIhminen(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 2) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoKaapio(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }

            if (vastustajanValinta == 3) {
                toiminto.loukkaaVastustajaa(olioVarasto.RotuVarasto.luoHaltia(), Vuoro.getVuorossaOlevaHahmo(), Vuoro.getVuoroaOdottavaHahmo());
            }
        }

    }

    /**
     * Metodi tarkistaa pelissä olevien hahmojen kestävyyden. Mikäli kummankaan
     * hahmon kestävyys on nolla tai alle muutetaan palautus arvo falseksi.
     * Metodi myös julistaa pelin lopputilanteen.
     *
     * @return palauttaa boolean arvon jota vuoroRotaatio metodi käyttää while looppinsa pyörittämiseen.
     */
    public boolean jatkuukoPeli() {

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

            pelaajanHahmo.palautaKestavyys();
        }

        return jatkuvuus;
    }
}
