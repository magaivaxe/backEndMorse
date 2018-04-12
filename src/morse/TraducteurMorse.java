package morse;


/**
 *
 * @author Marcos Gomes
 */
public interface TraducteurMorse
{
    public String toAlpha(String morse);
    
    public String toMorse(String alpha);
    
    public String nettoyerAlpha(String alpha);
    
    public String getNomProgrammeurs();
}
