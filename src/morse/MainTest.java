/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author sire_marcos
 */
public class MainTest
{
    public static void main(String[] args)
    {
        String str = "Phrase de test 1 2 3";
        
        String mor = ".--. .... .-. .- ... . / -.. . / - . ... - / .---- / "
                + "..--- / ...--";
        
        Morse morse = new Morse();
        
        System.out.println(morse.toMorse(str));
        System.out.println(morse.toAlpha(mor));
    }
}
