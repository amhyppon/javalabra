/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class hahmo {

    private String hahmonNimi;
    private int hahmonKetteryys;
    private int hahmonKestavyys;
    private rotu hahmonRotu;
    private haarniska hahmonHaarniska;
    private ase hahmonAse;

    /**
     * Hahmolla on muuttumaton nimi ja rotu. Hahmon kestävyys ja ketteryys
     * määräytyy hahmon rodun ja haarniskan avulla.
     *
     * @param nimi
     * @param hahmonRotu
     * @param hahmonHaarniska
     * @param hahmonAse
     */
    public hahmo(String nimi, rotu hahmonRotu, haarniska hahmonHaarniska, ase hahmonAse) {
        this.hahmonNimi = nimi;
        this.hahmonRotu = hahmonRotu;
        this.hahmonHaarniska = hahmonHaarniska;
        this.hahmonAse = hahmonAse;
        this.hahmonKetteryys = this.hahmonRotu.getRodunKetteryys() + this.hahmonHaarniska.getHaarniskanKetteryys();
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys() + this.hahmonHaarniska.getHaarniskanKestavyys();
    }

    public String getHahmonNimi() {
        return this.hahmonNimi;
    }

    public int getHahmonKetteryys() {
        return this.hahmonKetteryys;
    }

    public int getHahmonKestavyys() {
        return this.hahmonKestavyys;
    }

    /**
     * Metodi hahmon vaurioittamiseen, tarkoituksena, että ottelu loppuu kun
     * hahmolla on jäljellä 0 kestävyyttä.
     *
     * @param kestavyysVahinko haluttu kestävyys vaurion määrä, yleensä 1
     */
    public void osuma(int kestavyysVahinko) {
        this.hahmonKestavyys = this.hahmonKestavyys - kestavyysVahinko;
    }

    /**
     * Metodi hahmon kestävyyden palauttamiseen ottelun loputtua.
     */
    public void palautaKestävyys() {
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys() + this.hahmonHaarniska.getHaarniskanKestavyys();
    }

    public String getHahmonRotu() {
        return this.hahmonRotu.getRodunNimi();
    }

    public String getHahmonAse() {
        return this.hahmonAse.getAseenNimi();
    }

    public String getHahmonAseenLuokka() {
        return this.hahmonAse.getAseenLuokka();
    }

    public void setHahmonAse(ase uusiAse) {
        this.hahmonAse = uusiAse;
    }

    public String getHahmonHaarniska() {
        return this.hahmonHaarniska.getHaarniskanNimi();
    }

    public void setHahmonHaarniska(haarniska uusiHaarniska) {
        this.hahmonHaarniska = uusiHaarniska;
        this.hahmonKetteryys = this.hahmonRotu.getRodunKetteryys() + this.hahmonHaarniska.getHaarniskanKetteryys();
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys() + this.hahmonHaarniska.getHaarniskanKestavyys();
    }
}
