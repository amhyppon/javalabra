/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import olioLuokat.*;

/**
 *
 * @author Hyppönen
 */


public class toiminto {
    
    /*
    public void vaistaminen(hahmo toimivaHahmo, hahmo kohdeHahmo) {
    
        if(noppa.heitaNoppaa(toimivaHahmo.getHahmonKetteryys() + 3)){
            if()
        } else {
            
        }
            
    
    } */

    public static void vastaisku(hahmo annettuToimivaHahmo, hahmo annettuKohdeHahmo){
    
       hahmo toimivaHahmo = annettuToimivaHahmo;
       hahmo kohdeHahmo = annettuKohdeHahmo;
       
       if(toimivaHahmo.getHahmonAseenLuokka() == "miekka"){
           if(noppa.heitaNoppaa(2)){
               kohdeHahmo.osuma(1);
           }
       } else {
           if(noppa.heitaNoppaa(1)){
               kohdeHahmo.osuma(1);
           }
       }
        
    
    }
    
}
