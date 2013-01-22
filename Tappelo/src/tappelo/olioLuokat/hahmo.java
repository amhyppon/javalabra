/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tappelo.olioLuokat;

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

    public hahmo(String nimi, rotu hahmonRotu, haarniska hahmonHaarniska, ase hahmonAse) {
        this.hahmonNimi = nimi;
        this.hahmonRotu = hahmonRotu;
        this.hahmonHaarniska = hahmonHaarniska;
        this.hahmonAse = hahmonAse;
        this.hahmonKetteryys = this.hahmonRotu.getRodunKetteryys + this.hahmonHaarniska.getHaarniskanKetteryys;
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys + this.hahmonHaarniska.getHaarniskanKestavyys;
    }

    public String getNimi() {
        return this.hahmonNimi;
    }

    public int getKetteryys() {
        return this.hahmonKetteryys;
    }

    public int getKestavyys() {
        return this.hahmonKestavyys;
    }

    public void osuma(int i) {
        this.hahmonKestavyys = this.hahmonKestavyys - i;
    }

    public String getRotu() {
        return this.hahmonRotu.rodunNimi;
    }

    public String getAse() {
        return this.hahmonAse.aseenNimi;
    }

    public void setAse(ase uusiAse) {
        this.hahmonAse = uusiAse;
    }

    public String getHaarniska() {
        return this.hahmonHaarniska.haarniskanNimi;
    }

    public void setHaarniska(haarniska uusiHaarniska) {
        this.hahmonHaarniska = uusiHaarniska;
    }
}
