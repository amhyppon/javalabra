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

    /*
     public void vaistaminen(hahmo toimivaHahmo, hahmo kohdeHahmo) {
    
     if(noppa.heitaNoppaa(toimivaHahmo.getHahmonKetteryys() + 3)){
     if()
     } else {
            
     }
            
    
     } */
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

    public static void vaistaminen(hahmo annettuHyokkaavaHahmo, hahmo annettuVaistavaHahmo) {

        hahmo hyokkaavaHahmo = annettuHyokkaavaHahmo;
        hahmo vaistavaHahmo = annettuVaistavaHahmo;

        if (noppa.heitaNoppaa(vaistavaHahmo.getHahmonKetteryys())) {
            vastaisku(vaistavaHahmo, hyokkaavaHahmo);
        } else {
            osuvaIsku(hyokkaavaHahmo, vaistavaHahmo);
        }

    }

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
