
package morse;

/**
 *
 * @author Marcos Gomes
 */
public class Morse implements TraducteurMorse
{
    private String alpha;
    private String morse;
    
    private ArbreMorse am;

    public Morse(String mot, String morse)
    {
        this.alpha = mot;
        this.morse = morse;
        this.am = new ArbreMorse();
    }
          
    @Override
    public String toAlpha(String morse)
    {
        String [] splitMorse = morse.split(" ");
        
        for (int i = 0; i < splitMorse.length; i++)
        {
            char [] charMorse = splitMorse[i].toCharArray();
            for (int j = 0; j < charMorse.length; j++)
            {
                
            }
        }
        
        
        String toString = "";
        return toString;
    }

    @Override
    public String toMorse(String alpha)
    {
        String toString = "";
        return toString;
    }

    @Override
    public String nettoyerAlpha(String alpha)
    {
        String toString = "";
        return toString;
    }

    @Override
    public String getNomProgrammeurs(boolean choix)
    {
        final String BACK_END = "Marcos Gomes";
        final String FRONT_END = "Mohamed Nedal use";
        
        String toReturn = choix == true ? BACK_END:FRONT_END;
        
        return toReturn;
    }
    
}
