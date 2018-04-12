
package morse;

/**
 *
 * @author Sire Marcos Gomes
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
