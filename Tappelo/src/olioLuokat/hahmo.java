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

    public void osuma(int kestavyysVahinko) {
        this.hahmonKestavyys = this.hahmonKestavyys - kestavyysVahinko;
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
