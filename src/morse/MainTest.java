
package morse;

/**
 *
 * @author Sire Marcos Gomes
 */
public class MainTest
{
    private static final String BCK = "Marcos Gomes", FRT = "Mohamed Nhidal use";
    private static final EnumMorse [] ARRAY_ENUM_MORSES = EnumMorse.values();
    
    public static void main(String[] args)
    {
        String str = "L'acheter";
        
        String mor = ".--. .... .-. .- ... . / -.. . / - . ... - / .---- / "
                + "..--- / ...--";
        
        Morse morse = new Morse(BCK, FRT, ARRAY_ENUM_MORSES);
        
        System.out.println(morse.toMorse(str));
    }
}
