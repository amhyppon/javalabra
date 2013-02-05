/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class haarniska {

    private String haarniskanNimi;
    private int haarniskanKetteryys;
    private int haarniskanKestavyys;

    /**
     * Haarniska lisää hahmon kestävyyttä, mutta raskaampi haarniska vähentää
     * myös ketteryyttä.
     *
     * @param annettuNimi
     * @param annettuKetteryys
     * @param annettuKestavyys
     */
    public haarniska(String annettuNimi, int annettuKetteryys, int annettuKestavyys) {
        this.haarniskanNimi = annettuNimi;
        this.haarniskanKetteryys = annettuKetteryys;
        this.haarniskanKestavyys = annettuKestavyys;
    }

    public String getHaarniskanNimi() {
        return this.haarniskanNimi;
    }

    public int getHaarniskanKetteryys() {
        return this.haarniskanKetteryys;
    }

    public int getHaarniskanKestavyys() {
        return this.haarniskanKestavyys;
    }
}
