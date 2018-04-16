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
    private static ArrayList<String> listMorseCopy;
    private static ArrayList<String> listAlphaCopy;
    //Properties object to set values
    private static Properties prop;
    //File to input
    private static FileInputStream propFile;
    //Random object
    private static Random random;
    //
    private final static String SLASH = prop.getProperty("slash");
    private final static String SPACE = prop.getProperty("space");
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException, IOException
    {
        //Properties object to get the properties values
        prop = new Properties();
        //Objet randomique
        random = new Random();
        //The file properties and load
        propFile = new FileInputStream("test/morse/valeursTest.properties");
        prop.load(propFile);
        //
        String BCK = prop.getProperty("BCK");
        String FRT = prop.getProperty("FRT");
        EnumMorse [] ARRAY_ENUM_MORSE = EnumMorse.values();
        //Object declaration morse
        morseObj = new Morse(BCK, FRT, ARRAY_ENUM_MORSE);
        //The string values
        String morseString = prop.getProperty("morse");
        String alphaString = prop.getProperty("alpha");
        //Fill the list 
        for (String i: alphaString.split(" "))
        {
            listAlpha.add(i.trim());
        }
        for (String i: morseString.split(" "))
        {
            listMorse.add(i.trim());
        }
        listAlphaCopy = new ArrayList<>();
        listMorseCopy = new ArrayList<>();
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception
    {
        //Ferme le fichier lorsque le teste fini
        propFile.close();
    }
    
    @Before
    public void setUp()
    {
        //Addicionne les nombres pour tester
        for (String a : listAlpha)
        {
            listAlphaCopy.add(a);
        }
        for (String m : listMorse)
        {
            listMorseCopy.add(m);
        }
    }
    
    @After
    public void tearDown()
    {
        listAlphaCopy.clear();
        listMorseCopy.clear();
    }

    /**
     * Test of toAlpha method, of class Morse.
     */
    @Test
    public void testToAlpha()
    {
        System.out.println("Test toAlpha =============================== ");
        //Variables
        String morseToEnter;
        String expResult, result;
        //Teste pour tous les valeurs des morse-alpha
        while (!listMorseCopy.isEmpty())
        {
            //Index choisit au hasard
            int index = random.nextInt(listMorseCopy.size());
            //Valeur choisi
            morseToEnter = listMorseCopy.get(index);
            //Results
            expResult = listAlphaCopy.get(index);
            result = morseObj.toAlpha(morseToEnter);
            //Comparaison des resultats
            assertEquals(expResult, result);
            //Exclusion des indexes choisis
            listAlphaCopy.remove(index);
            listMorseCopy.remove(index);
        }
        //Tester le / à space.
        expResult = SPACE;
        result = morseObj.toAlpha(SLASH);
        assertEquals(expResult, result);
        System.out.println("Fin test toAlpha =========================== ");
    }

    /**
     * Test of toMorse method, of class Morse.
     */
    @Test
    public void testToMorse()
    {
        System.out.println("Test toMorse =============================== ");
        //Variables
        String alphaToEnter;
        String expResult, result;
        //Teste pour tous les valeurs des morse-alpha
        while (!listAlphaCopy.isEmpty())
        {
            //Index choisit au hasard
            int index = random.nextInt(listAlphaCopy.size());
            //Valeur choisi
            alphaToEnter = listAlphaCopy.get(index);
            //Results
            expResult = listMorseCopy.get(index);
            result = morseObj.toAlpha(alphaToEnter);
            //Comparaison des resultats
            assertEquals(expResult, result);
            //Exclusion des indexes choisis
            listAlphaCopy.remove(index);
            listMorseCopy.remove(index);
        }
        //Tester le space à /.
        expResult = SLASH;
        result = morseObj.toAlpha(SPACE);
        assertEquals(expResult, result);
        
        System.out.println("Fin test tomorse =========================== ");
    }

    /**
     * Test of nettoyerAlpha method, of class Morse.
     */
    @Test
    public void testNettoyerAlpha()
    {
        System.out.println("Teste nettoyerAlpha ======================== ");
        
        for (int i = 0; i < listAlphaCopy.size(); i++)
        {
            String pourNettoyer = listAlphaCopy.get(i);
            String expResult = "";
            String result = morseObj.nettoyerAlpha(pourNettoyer);
            assertEquals(expResult, result);
        }
        
        System.out.println("Fin teste nettoyerAlpha ======================== ");
    }

    /**
     * Test of getNomProgrammeurs method, of class Morse.
     */
    @Test
    public void testGetNomProgrammeurs()
    {
    }
    
}
