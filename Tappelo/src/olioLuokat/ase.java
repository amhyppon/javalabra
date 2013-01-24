/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class ase {

    private String aseenNimi;
    private String aseenLuokka;

    public ase(String annettuNimi, String annettuAseluokka) {
        this.aseenNimi = annettuNimi;
        this.aseenLuokka = annettuAseluokka;
    }

    public String getAseenNimi() {
        return aseenNimi;
    }
    
    public String getAseenLuokka() {
        return aseenLuokka;
    }
}
