/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittyma;

import logiikka.*;
import olioLuokat.*;
import olioVarasto.*;

/**
 *
 * @author Hyppönen
 */
public class pelinKulku {
    
    hahmo pelaajanHahmo = pelaajanHahmonLuonti.pelaajanHahmonLuonti();
    hahmo vastustajanHahmo = vastustajanHahmonLuonti.vastustajanHahmonLuonti();
    
    vuoro tamanhetkinenVuoro = new vuoro(pelaajanHahmo, vastustajanHahmo);
    
}
