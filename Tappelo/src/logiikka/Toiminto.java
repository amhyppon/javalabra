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
public class Toiminto {

    /**
     * Metodi mikäli väistäminen onnistuu yrittää väistäjä vastaiskua.
     * Vastaiskun onnistumiseen vaikuttaa onko väistäjällä miekka vai ei.
     *
     * @param annettuToimivaHahmo
     * @param annettuKohdeHahmo
     */
    Noppa noppa = new Noppa();

    public void vastaisku(Hahmo annettuToimivaHahmo, Hahmo annettuKohdeHahmo) {

        Hahmo toimivaHahmo = annettuToimivaHahmo;
        Hahmo kohdeHahmo = annettuKohdeHahmo;

        if (toimivaHahmo.getHahmonAseenLuokka() == "miekka") {
            if (noppa.heitaNoppaa(3)) {

                System.out.println("Vastaisku onnistuu!");
                osuvaIsku(toimivaHahmo, kohdeHahmo);
            } else {
                System.out.println("Vastaisku ei onnistunut...");
            }
        }
        if (toimivaHahmo.getHahmonAseenLuokka() != "miekka") {
            if (noppa.heitaNoppaa(2)) {

                System.out.println("Vastaisku onnistuu!");
                osuvaIsku(toimivaHahmo, kohdeHahmo);
            } else {
                System.out.println("Vastaisku ei onnistunut...");
            }
        }
    }

    /**
     * Metodi mikäli pelaaja tai tietokone päättää väistää hyökkäyksen heitetään
     * noppaa jonka onnistumiseen vaikuttaa väistävän hahmon ketteryys.
     *
     * @param annettuHyokkaavaHahmo
     * @param annettuVaistavaHahmo
     */
    public void vaistaminen(Hahmo annettuHyokkaavaHahmo, Hahmo annettuVaistavaHahmo) {

        Hahmo hyokkaavaHahmo = annettuHyokkaavaHahmo;
        Hahmo vaistavaHahmo = annettuVaistavaHahmo;

        if (noppa.heitaNoppaa(vaistavaHahmo.getHahmonKetteryys())) {

            System.out.println(vaistavaHahmo.getHahmonNimi() + " onnistuu väistämään iskun ja yrittää vastaiskua!");
            vastaisku(vaistavaHahmo, hyokkaavaHahmo);
        } else {

            System.out.println(vaistavaHahmo.getHahmonNimi() + " ei onnistunu väistämään iskua...");
            osuvaIsku(hyokkaavaHahmo, vaistavaHahmo);

        }

    }

    /**
     * Metodi mikäli pelaaja tai tietokone päättää torjua hykkäyksen heitetään
     * nopaa jonka onnistumiseen vaikuttaa hyökkävään hahmon ase.
     *
     * @param annettuHyokkaavaHahmo
     * @param annettuTorjuvaHahmo
     */
    public void torjuminen(Hahmo annettuHyokkaavaHahmo, Hahmo annettuTorjuvaHahmo) {

        Hahmo hyokkaavaHahmo = annettuHyokkaavaHahmo;
        Hahmo torjuvaHahmo = annettuTorjuvaHahmo;

        if (hyokkaavaHahmo.getHahmonAseenLuokka() == "moukari") {
            if (noppa.heitaNoppaa(2) == false) {

                System.out.println(torjuvaHahmo.getHahmonNimi() + " epäonnistuu moukarillaan iskun torjumisessa...");
                osuvaIsku(hyokkaavaHahmo, torjuvaHahmo);
            } else {
                System.out.println(torjuvaHahmo.getHahmonNimi() + " onnistuu torjumaan iskun!");
            }
        } else {
            if (noppa.heitaNoppaa(4) == false) {

                System.out.println(torjuvaHahmo.getHahmonNimi() + " epäonnistuu iskun torjumisessa...");
                osuvaIsku(hyokkaavaHahmo, torjuvaHahmo);

            } else {
                System.out.println(torjuvaHahmo.getHahmonNimi() + " onnistuu torjumaan iskun!");
            }
        }
    }

    /**
     * Metodi mikäli hyökkäyksen torjuminen tai väistämien epäonnistuu tai
     * vastaisku onnistuu. Mikäli osuvalla hahmolla on kirves käytössä heitetään
     * ylimääräinen noppa lisä vauriosta.
     *
     * @param annettuOsuvaHahmo
     * @param annettuKohdeHahmo
     */
    public void osuvaIsku(Hahmo annettuOsuvaHahmo, Hahmo annettuKohdeHahmo) {

        Hahmo osuvaHahmo = annettuOsuvaHahmo;
        Hahmo kohdeHahmo = annettuKohdeHahmo;

        kohdeHahmo.osuma(1);
        System.out.println(osuvaHahmo.getHahmonNimi() + " osuu iskullaan!");

        if (osuvaHahmo.getHahmonAseenLuokka() == "kirves") {
            if (noppa.heitaNoppaa(1)) {
                kohdeHahmo.osuma(1);
                System.out.println(osuvaHahmo.getHahmonNimi() + " osuu toistamiseen kirveellä!");
            }
        }
    }

    /**
     * Metodissa loukkaava hahmo pyrkii loukkaamaan vastustajansa rotua. Mikäli
     * rotu kohtainen loukkaus onnistuu saa loukkaava hahmo helpohkon
     * hyökkäyksen, jonka epäonnistuessa vastustaja saa vaikean hyökkäyksen.
     * Mikäli loukkaus epäonnistuu loukkauksensa valinnassa saa loukkaaja
     * kumminkin yrittää keskivaikeaa hyökkäystä, jonka epäonnistuessa myös
     * vastustaja saa yrittää keskivaikeaa hyökkäystä.
     *
     * @param loukattavaRotu
     * @param loukkaavaHahmo
     * @param loukattavaHahmo
     */
    public void loukkaaVastustajaa(Rotu loukattavaRotu, Hahmo loukkaavaHahmo, Hahmo loukattavaHahmo) {

        if (loukattavaRotu.getRodunNimi() == loukattavaHahmo.getHahmonRodunNimi()) {

            if (noppa.heitaNoppaa(4)) {

                System.out.println(loukattavaHahmo.getHahmonNimi() + " hyökkää raivoissaan, mutta " + loukkaavaHahmo.getHahmonNimi() + " käyttää tätä hyväkseen iskeäkseen!");
                osuvaIsku(loukkaavaHahmo, loukattavaHahmo);
            } else {

                if (noppa.heitaNoppaa(1)) {

                    System.out.println(loukattavaHahmo.getHahmonNimi() + " hyökkää raivoissaan ja onnistuu hurjassa hyökkäyksessään!");
                    osuvaIsku(loukattavaHahmo, loukkaavaHahmo);
                } else {
                    System.out.println("Vain heinäsirkat vastaavat...");
                }
            }

        }

        if (loukattavaRotu.getRodunNimi() != loukattavaHahmo.getHahmonRodunNimi()) {

            if (noppa.heitaNoppaa(2)) {

                System.out.println(loukattavaHahmo.getHahmonNimi() + " harmistuu loukkauksesta ja hyökkää, mutta " + loukkaavaHahmo.getHahmonNimi() + " onnistuu välttämään hyökkäyksen ja saa iskun lävitse!");
                osuvaIsku(loukkaavaHahmo, loukattavaHahmo);
            } else {

                if (noppa.heitaNoppaa(2)) {


                    System.out.println(loukattavaHahmo.getHahmonNimi() + " ei ole moksiskaan loukkauksesta ja hyökkää!");
                    osuvaIsku(loukattavaHahmo, loukkaavaHahmo);
                } else {
                    System.out.println("Vain heinäsirkat vastaavat...");
                }
            }

        }

    }

    /**
     * Metodi kutsuttaessa lopettaa ohjelman.
     */
    public void poistuPelista() {

        System.out.println("Kiitos pelaamisesta!");
        System.exit(0);

    }
}
