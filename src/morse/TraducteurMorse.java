package morse;


/**
 * Contrat pour suive au TP3 de POO1
 * @author Rébecca Lapointe
 */
public interface TraducteurMorse
{
    public String toAlpha(String morse);
    
    public String toMorse(String alpha);
    
    public String nettoyerAlpha(String alpha);
    
    public String getNomProgrammeurs();
}
