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
public class Noppa {

    private Random random = new Random();

    /**
     * Metodilla heitetään noppaa kuutosen toivossa.
     *
     * @param heittojenMaara haluttu heittojen määrä, vaikuttaa
     * todennäköisyyteen saada kutonen
     * @return palautetaan boolean tuliko heitoista kuutonen
     */
    public boolean heitaNoppaa(int heittojenMaara) {

        boolean onkoKutosta = false;

        for (int j = 0; j < heittojenMaara; j++) {
            int heitto = random.nextInt(6) + 1;

            if (heitto == 6) {
                onkoKutosta = true;
            }
        }
        return onkoKutosta;
    }

    /**
     * Metodi arpoo numeron halutulta väliltä 1-suurinNumero. Käytetään
     * valitsemaan tietokoneelle.
     *
     * @param suurinNumero määrää halutun arvovälin
     * @return palauttaa arvotun numeron arvon
     */
    public int arvoNumero(int suurinNumero) {

        int arvottuNumero;

        arvottuNumero = random.nextInt(suurinNumero) + 1;

        return arvottuNumero;
    }
}
