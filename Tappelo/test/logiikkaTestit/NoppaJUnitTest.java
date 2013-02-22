package logiikkaTestit;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import logiikka.Noppa;

/**
 *
 * @author Hyppönen
 */
public class NoppaJUnitTest {
    
    Noppa noppa = new Noppa();

    public NoppaJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        
    
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoNoppa() {

        System.out.println(noppa.heitaNoppaa(4));
    }
    
    @Test
    public void toimiikoArvonta() {

        System.out.println(noppa.arvoNumero(2));
    }
}
