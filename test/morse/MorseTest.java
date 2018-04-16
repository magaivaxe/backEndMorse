/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eleves
 */
public class MorseTest
{
    private static final String BCK = "Marcos Gomes"; 
    private static final String FRT = "Mohamed Nhidal use"; 
    private static final EnumMorse [] ARRAY_ENUM_MORSE = EnumMorse.values();
    //Constructor standard
    public MorseTest()
    {
    }
    //Attribut pur le test
    
    //======== OBJECTS ALLOCATIONS to test before, afterclass, before and after 
    //Morse Object
    private static Morse morseObj;
    //Lists to test morse-alpha, alpha-morse;
    private static ArrayList<String> listMorse;
    private static ArrayList<String> listAlpha;
    //Properties object to set values
    private static Properties prop;
    //File to input
    private static FileInputStream propFile;
    //Random object
    private static Random random;
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException, IOException
    {
        //Properties object to get the properties values
        prop = new Properties();
        //The file properties and load
        propFile = new FileInputStream("test/morse/valeursTest.properties");
        prop.load(propFile);
        morseObj = new Morse(BCK, FRT, ARRAY_ENUM_MORSE);
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        //Il n'y a pas rien à arrêter après le teste.
    }
    
    @Before
    public void setUp()
    {
        String morseToEnter = 
    }
    
    @After
    public void tearDown()
    {
        
    }

    /**
     * Test of toAlpha method, of class Morse.
     */
    @Test
    public void testToAlpha()
    {
        System.out.println("Test toAlpha =============================== ");
        String morseToEnter = ".--. .... .-. .- ... . / -.. . / - . ... - /"
                + " .---- / ..--- / ...--";
        String expResult = "Phrase de test 1 2 3";
        String result = morseObj.toAlpha(morseToEnter);
        assertEquals(expResult, result);
        
        System.out.println("Fin test toAlpha =========================== ");
    }

    /**
     * Test of toMorse method, of class Morse.
     */
    @Test
    public void testToMorse()
    {
        System.out.println("toMorse");
        String alpha = "";
        Morse instance = new Morse();
        String expResult = "";
        String result = instance.toMorse(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nettoyerAlpha method, of class Morse.
     */
    @Test
    public void testNettoyerAlpha()
    {
        System.out.println("nettoyerAlpha");
        String alpha = "";
        Morse instance = new Morse();
        String expResult = "";
        String result = instance.nettoyerAlpha(alpha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomProgrammeurs method, of class Morse.
     */
    @Test
    public void testGetNomProgrammeurs()
    {
        System.out.println("getNomProgrammeurs");
        Morse instance = new Morse();
        String expResult = "";
        String result = instance.getNomProgrammeurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
