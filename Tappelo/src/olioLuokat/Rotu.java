/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class Rotu {

    private String rodunNimi;
    private int rodunKetteryys;
    private int rodunKestavyys;

    /**
     * Rodun ketteryyttä ja kestävyyttä käytetään hahmon ketteryyden ja
     * kestävyyden laskemiseen.
     *
     * @param annettuNimi
     * @param annettuKetteryys
     * @param annettuKestavyys
     */
    public Rotu(String annettuNimi, int annettuKetteryys, int annettuKestavyys) {
        this.rodunNimi = annettuNimi;
        this.rodunKetteryys = annettuKetteryys;
        this.rodunKestavyys = annettuKestavyys;
    }

    public String getRodunNimi() {
        return this.rodunNimi;
    }

    public int getRodunKetteryys() {
        return this.rodunKetteryys;
    }

    public int getRodunKestavyys() {
        return this.rodunKestavyys;
    }
}
