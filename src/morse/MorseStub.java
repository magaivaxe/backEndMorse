
package morse;

/**
 *
 * @author eleves
 */
public class MorseStub implements TraducteurMorse
{

    public MorseStub()
    {
    }

    @Override
    public String toAlpha(String morse)
    {
        if (morse.equals("-"))
        {
            return "t";
        }
        else if (morse.equals("--"))
        {
            return "m";
        }
        else if (morse.equals("---"))
        {
            return "o";
        }
        else if(morse.equals("-----"))
        {
            return "0";
        }
        else
        {
            return "Pas trouvé";
        }
    }

    @Override
    public String toMorse(String alpha)
    {
        if (alpha.equals("!"))
        {
            return "-.-.--";
        }
        else if (alpha.equals("@"))
        {
            return ".--.-.";
        }
        else if (alpha.equals("$"))
        {
            return "...-..-";
        }
        else if(alpha.equals(" "))
        {
            return "/";
        }
        else if(alpha.equals("x"))
        {
            return "-..-";
        }
        else if(alpha.equals("2"))
        {
            return "..---";
        }
        else if(alpha.equals("="))
        {
            return "-...-";
        }
        else
        {
            return "Pas trouvé";
        }
    }

    @Override
    public String nettoyerAlpha(String alpha)
    {
        if (!alpha.isEmpty())
        {
            return "";
        }
        return null;
    }

    @Override
    public String getNomProgrammeurs()
    {
        return "Stub";
    }
    
}
