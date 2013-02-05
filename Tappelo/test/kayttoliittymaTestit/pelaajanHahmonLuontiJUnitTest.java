/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kayttoliittymaTestit;

import kayttoliittyma.pelaajanHahmonLuonti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hyppönen
 */
public class pelaajanHahmonLuontiJUnitTest {
    
    public pelaajanHahmonLuontiJUnitTest() {
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
    public void hahmonLuontiTesti() {
        pelaajanHahmonLuonti.pelaajanHahmonLuonti();
    }
    
    //TODO: selvitä miten käyttäjän syötöt voisi testata...
}
