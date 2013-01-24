/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.util.Random;

/**
 *
 * @author Hyppönen
 */
public class noppa {

    public static boolean heitaNoppaa(int heittojenMaara) {
        Random rand = new Random();
        boolean onkoKutosta = false;

        for (int j = 0; j < heittojenMaara; j++) {
            int pick = rand.nextInt(6) + 1;

            if (pick == 6) {
                onkoKutosta = true;
            }
        }
        return onkoKutosta;
    }
}
