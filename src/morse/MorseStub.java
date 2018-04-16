
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
        if (morse.equals("."))
        {
            return "e";
        }
        if (morse.equals(".."))
        {
            return "i";
        }
        if (morse.equals("..."))
        {
            return "s";
        }
        return null;
    }

    @Override
    public String toMorse(String alpha)
    {
        if (alpha.equals("e"))
        {
            return ".";
        }
        if (alpha.equals("i"))
        {
            return "..";
        }
        if (alpha.equals("s"))
        {
            return "...";
        }
        return null;
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
