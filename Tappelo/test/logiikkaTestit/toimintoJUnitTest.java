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
import logiikka.*;
import olioLuokat.*;

/**
 *
 * @author Hyppönen
 */
public class toimintoJUnitTest {

    rotu testiRotu1;
    ase testiAse1;
    haarniska testiHaarniska1;
    hahmo testiHahmo1;
    
    rotu testiRotu2;
    ase testiAse2;
    haarniska testiHaarniska2;
    hahmo testiHahmo2;
    
    rotu testiRotu3;
    ase testiAse3;
    haarniska testiHaarniska3;
    hahmo testiHahmo3;

    public toimintoJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testiRotu1 = new rotu("testiRodunNimi", 2, 2);
        testiAse1 = new ase("testiMiekka", "miekka");
        testiHaarniska1 = new haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo1 = new hahmo("testiHahmonNimi", testiRotu1, testiHaarniska1, testiAse1);

        testiRotu2 = new rotu("testiRodunNimi", 2, 2);
        testiAse2 = new ase("testiKirves", "kirves");
        testiHaarniska2 = new haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo2 = new hahmo("testiHahmonNimi", testiRotu2, testiHaarniska2, testiAse2);

        testiRotu3 = new rotu("testiRodunNimi", 2, 2);
        testiAse3 = new ase("testiMoukari", "moukari");
        testiHaarniska3 = new haarniska("testiRaskasHaarniskan", -1, 2);
        testiHahmo3 = new hahmo("testiHahmonNimi", testiRotu3, testiHaarniska3, testiAse3);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testataanMiekanVastaiskua() {
        toiminto.vastaisku(testiHahmo1, testiHahmo2);

        System.out.println("Kohde hahmon alkuperäinen kestävyys miekkatestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanMuutaVastaiskua() {
        toiminto.vastaisku(testiHahmo2, testiHahmo1);

        System.out.println("Kohde hahmon alkuperäinen kestävyys muuasetestissä: " + testiHahmo1.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanVaistamista() {
        toiminto.vaistaminen(testiHahmo1, testiHahmo2);

        System.out.println("hyökkäävän hahmon kestävyys väistämistestissä: " + testiHahmo1.getHahmonKestavyys() + "/4");
        System.out.println("väistävän hahmon kestävyys väistämistestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanTorjumista() {
        toiminto.torjuminen(testiHahmo1, testiHahmo2);

        System.out.println("torjuvan hahmon kestävyys torjuntatestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanMoukaria() {
        toiminto.torjuminen(testiHahmo3, testiHahmo2);

        System.out.println("torjuvan hahmon kestävyys moukarin torjuntatestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanKirvesta() {
        toiminto.osuvaIsku(testiHahmo2, testiHahmo1);

        System.out.println("kohde hahmon kestävyys kirvestestissä: " + testiHahmo1.getHahmonKestavyys() + "/4");
    }

    @Test
    public void testataanLoukataOikeaaRotua() {
        toiminto.loukkaaVastustajaa(testiRotu1, testiHahmo1, testiHahmo2);
        
        System.out.println("loukkaavan hahmon kestävyys oikea rotu loukkaustestissä: " + testiHahmo1.getHahmonKestavyys() + "/4");
        System.out.println("loukattavan hahmon kestävyys oikea rotu loukkaustestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }
    
    @Test
    public void testataanLoukataVäärääRotua() {
        
        rotu vaaraRotu = new rotu("Väärä rotu", 2, 2);
        
        toiminto.loukkaaVastustajaa(vaaraRotu, testiHahmo1, testiHahmo2);
        
        System.out.println("loukkaavan hahmon kestävyys väärän rotu loukkaustestissä: " + testiHahmo1.getHahmonKestavyys() + "/4");
        System.out.println("loukattavan hahmon kestävyys väärän rotu loukkaustestissä: " + testiHahmo2.getHahmonKestavyys() + "/4");
    }


}
