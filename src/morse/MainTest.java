
package morse;

/**
 *
 * @author Sire Marcos Gomes
 */
public class MainTest
{
    
    public static void main(String[] args)
    {
        String str = "L'acheter";
        
        String mor = ".--. .... .-. .- ... . / -.. . / - . ... - / .---- / "
                + "..--- / ...--";
        
        Morse morse = new Morse();
        
        System.out.println(morse.toMorse(str));
    }
}
