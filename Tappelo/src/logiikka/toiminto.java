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
public class toiminto {

    /**
     * Metodi mikäli väistäminen onnistuu yrittää väistäjä vastaiskua.
     * Vastaiskun onnistumiseen vaikuttaa onko väistäjällä miekka vai ei.
     *
     * @param annettuToimivaHahmo
     * @param annettuKohdeHahmo
     */
    public static void vastaisku(hahmo annettuToimivaHahmo, hahmo annettuKohdeHahmo) {

        hahmo toimivaHahmo = annettuToimivaHahmo;
        hahmo kohdeHahmo = annettuKohdeHahmo;

        if (toimivaHahmo.getHahmonAseenLuokka() == "miekka") {
            if (noppa.heitaNoppaa(3)) {
                osuvaIsku(toimivaHahmo, kohdeHahmo);
            }
        }
        if (toimivaHahmo.getHahmonAseenLuokka() != "miekka") {
            if (noppa.heitaNoppaa(2)) {
                osuvaIsku(toimivaHahmo, kohdeHahmo);
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
    public static void vaistaminen(hahmo annettuHyokkaavaHahmo, hahmo annettuVaistavaHahmo) {

        hahmo hyokkaavaHahmo = annettuHyokkaavaHahmo;
        hahmo vaistavaHahmo = annettuVaistavaHahmo;

        if (noppa.heitaNoppaa(vaistavaHahmo.getHahmonKetteryys())) {
            vastaisku(vaistavaHahmo, hyokkaavaHahmo);
        } else {
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
    public static void torjuminen(hahmo annettuHyokkaavaHahmo, hahmo annettuTorjuvaHahmo) {

        hahmo hyokkaavaHahmo = annettuHyokkaavaHahmo;
        hahmo torjuvaHahmo = annettuTorjuvaHahmo;

        if (hyokkaavaHahmo.getHahmonAseenLuokka() == "moukari") {
            if (noppa.heitaNoppaa(2) == false) {
                osuvaIsku(hyokkaavaHahmo, torjuvaHahmo);
            }
        } else {
            if (noppa.heitaNoppaa(4) == false) {
                osuvaIsku(hyokkaavaHahmo, torjuvaHahmo);
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
    public static void osuvaIsku(hahmo annettuOsuvaHahmo, hahmo annettuKohdeHahmo) {

        hahmo osuvaHahmo = annettuOsuvaHahmo;
        hahmo kohdeHahmo = annettuKohdeHahmo;

        if (osuvaHahmo.getHahmonAseenLuokka() == "kirves") {
            if (noppa.heitaNoppaa(1)) {
                kohdeHahmo.osuma(1);
            }
        }

        kohdeHahmo.osuma(1);

    }
}
