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
    public MorseTest(){}
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
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException, IOException{
        //Les listes
        listAlphaCopy = new ArrayList<>();
        listMorseCopy = new ArrayList<>();
        listAlpha = new ArrayList<>();
        listMorse = new ArrayList<>();
        //Properties object to get the properties values
        prop = new Properties();
        //Objet randomique
        random = new Random();
        //The file properties and load
        propFile = new FileInputStream("test/morse/valeursTest.properties");
        prop.load(propFile);
        //Object declaration morse
        morseObj = new Morse();
        //The string values
        String morseString = prop.getProperty("morse");
        String alphaString = prop.getProperty("alpha");
        //Fill the list 
        for (String i: alphaString.split(" ")){
            listAlpha.add(i.trim());
        }
        for (String i: morseString.split(" ")){
            listMorse.add(i.trim());
        } 
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
        //Ferme le fichier lorsque le teste fini
        propFile.close();
    }
    @Before
    public void setUp(){
        //Addicionne les nombres pour tester
        for (String a : listAlpha){
            listAlphaCopy.add(a);
        }
        for (String m : listMorse){
            listMorseCopy.add(m);
        }
    }
    @After
    public void tearDown(){
        listAlphaCopy.clear();
        listMorseCopy.clear();
    }
    /**
     * Test of toAlpha method, of class Morse.
     */
    @Test
    public void testToAlpha(){
        System.out.println("Test toAlpha =============================== ");
        //Variables
        String morseToEnter;
        String expResult, result;
        //Teste pour tous les valeurs des morse-alpha
        while (!listMorseCopy.isEmpty()){
            //Index choisit au hasard
            int index = random.nextInt(listMorseCopy.size());
            //Valeur choisi
            morseToEnter = listMorseCopy.get(index);
            //Results
            expResult = listAlphaCopy.get(index);
            result = morseObj.toAlpha(morseToEnter);
            //System.out.println(expResult + "\t" + result);
            //Comparaison des resultats
            assertEquals(expResult, result);
            //Exclusion des indexes choisis
            listAlphaCopy.remove(index);
            listMorseCopy.remove(index);
        }
        //Tester le / à space.
        expResult = " ";
        result = morseObj.toAlpha("/");
        assertEquals(expResult, result);
        System.out.println("Fin test toAlpha =========================== ");
    }

    /**
     * Test of toMorse method, of class Morse.
     */
    @Test
    public void testToMorse(){
        System.out.println("Test toMorse =============================== ");
        //Variables
        String alphaToEnter;
        String expResult, result;
        //Teste pour tous les valeurs des morse-alpha
        while (!listAlphaCopy.isEmpty()){
            //Index choisit au hasard
            int index = random.nextInt(listAlphaCopy.size());
            //Valeur choisi
            alphaToEnter = listAlphaCopy.get(index);
            //Results
            expResult = listMorseCopy.get(index);
            result = morseObj.toMorse(alphaToEnter);
            //System.out.println(expResult + "\t" + result);
            //Comparaison des resultats
            assertEquals(expResult, result);
            //Exclusion des indexes choisis
            listAlphaCopy.remove(index);
            listMorseCopy.remove(index);
        }
        //Tester le space à /.
        expResult = "/";
        result = morseObj.toMorse(" ");
        assertEquals(expResult, result);
        
        System.out.println("Fin test tomorse =========================== ");
    }

    /**
     * Test of nettoyerAlpha method, of class Morse.
     */
    @Test
    public void testNettoyerAlpha(){
        System.out.println("Teste nettoyerAlpha ======================== ");
        
        //Clean the edit text alpha 
        for (int i = 0; i < listAlphaCopy.size(); i++){
            String pourNettoyer = listAlphaCopy.get(i);
            String expResult = "";
            String result = morseObj.nettoyerAlpha(pourNettoyer);
            assertEquals(expResult, result);
        }
        //Clean the edit text morse
        for (int i = 0; i < listMorseCopy.size(); i++){
            String pourNettoyer = listMorseCopy.get(i);
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
    public void testGetNomProgrammeurs(){}
}
