/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tappelo.olioLuokat;

/**
 *
 * @author Hyppönen
 */
public class rotu {
    private String rodunNimi;
    private int rodunKetteryys;
    private int rodunKestavyys;
    
    public rotu(String annettuNimi, int annettuKetteryys, int annettuKestavyys) {
        this.rodunNimi = annettuNimi;
        this.rodunKetteryys = annettuKetteryys;
        this.rodunKestavyys = annettuKestavyys;
    }
    
    public String getRodunNimi(){
        return this.rodunNimi;
    }
    
    public int getRodunKetteryys(){
        return this.rodunKetteryys;
    }
    
    public int getRodunKestavyys(){
        return this.rodunKestavyys;
    }
        
}


