/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tappelo;

import logiikka.*;
import olioLuokat.*;
import kayttoliittyma.*;
/**
 *
 * @author Hyppönen
 */
public class Tappelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Tervetuloa pelaamaan Tappeloa!");
        
        pelinKulku.pelinAloitus();
        
        pelinKulku.vuoroRotaatio();
    }
}
