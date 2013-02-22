/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class Hahmo {

    private String hahmonNimi;
    private int hahmonKetteryys;
    private int hahmonKestavyys;
    private Rotu hahmonRotu;
    private Haarniska hahmonHaarniska;
    private Ase hahmonAse;
    private int voitot = 0;

    /**
     * Hahmolla on muuttumaton nimi ja rotu. Hahmon kestävyys ja ketteryys
     * määräytyy hahmon rodun ja haarniskan avulla. Hahmon voittoja voidaan myös
     * seurava voitot muttujalla tarvittaessa.
     *
     * @param nimi
     * @param hahmonRotu
     * @param hahmonHaarniska
     * @param hahmonAse
     */
    public Hahmo(String nimi, Rotu hahmonRotu, Haarniska hahmonHaarniska, Ase hahmonAse) {
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
    public void palautaKestavyys() {
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys() + this.hahmonHaarniska.getHaarniskanKestavyys();
    }

    public String getHahmonRodunNimi() {
        return this.hahmonRotu.getRodunNimi();
    }

    public Rotu getHahmonRotu() {
        return this.hahmonRotu;
    }

    public String getHahmonAse() {
        return this.hahmonAse.getAseenNimi();
    }

    public String getHahmonAseenLuokka() {
        return this.hahmonAse.getAseenLuokka();
    }

    public void setHahmonAse(Ase uusiAse) {
        this.hahmonAse = uusiAse;
    }

    public String getHahmonHaarniska() {
        return this.hahmonHaarniska.getHaarniskanNimi();
    }

    public void setHahmonHaarniska(Haarniska uusiHaarniska) {
        this.hahmonHaarniska = uusiHaarniska;
        this.hahmonKetteryys = this.hahmonRotu.getRodunKetteryys() + this.hahmonHaarniska.getHaarniskanKetteryys();
        this.hahmonKestavyys = this.hahmonRotu.getRodunKestavyys() + this.hahmonHaarniska.getHaarniskanKestavyys();
    }

    public void hahmolleVoittoPiste() {
        voitot++;
    }

    public int getHahmonVoitot() {
        return voitot;
    }
    
    /**
     * Palauttaa hahmon nimen, rodun, aseen, haarniskan ja kestävyyden stringinä.
     * @return 
     */ 
    public String toString() {
        
        String hahmoKiteytettyna;
        
        hahmoKiteytettyna = getHahmonNimi() + ", " + getHahmonRodunNimi() + ", " +  getHahmonAse() + ", " +  getHahmonHaarniska() + ", " + "KST: " + getHahmonKestavyys();
        
        return hahmoKiteytettyna;
    }
}
