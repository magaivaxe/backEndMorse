
package morse;

/**
 * Classe pour convertir du code morse en alpha charactères et vice-versa.
 * @author Sire Marcos Gomes
 */
public class Morse implements TraducteurMorse
{
    final String BCK= "Back-End: Marcos Gomes";
    final String FTE = "Front_End: Nedal use";
    final EnumMorse [] ARRAY_ENUM_MORSE = EnumMorse.values();
    
    public Morse(){}
          
    @Override
    public String toAlpha(String morse){
        String stringToReturn = "";
        //Tableau sans space
        String [] arrayMorse = morse.split(" ");
        //Boucle pour choisir le string morse
        for (String mor : arrayMorse){
            //Boucle pour choisir le string du EnumMorse
            for (EnumMorse aem : ARRAY_ENUM_MORSE){
                //Condition pour concaténer le string avec des charactères
                if (mor.equals(aem.getMorse())){
                    stringToReturn += aem.getLettre();
                    break;
                }
            }
        }
        return stringToReturn;
    }

    /**
     * Méthode pour convertir un mot en format morse.
     * @param alpha Le mot entré
     * @return Un string sur le format morse
     */
    @Override
    public String toMorse(String alpha){
        String stringToReturn = "";
        //Tableau de String pour le boucle
        final char [] CHAR_MORSE = alpha.toLowerCase().toCharArray();
        //Boucle pour choisir le charactère
        for (char chm: CHAR_MORSE){
            //Boucle pour choisir le EnumMorse pour comparer
            for (EnumMorse aem : ARRAY_ENUM_MORSE){
                //Condition pour concaténer et retourner le String
                if (chm == aem.getLettre()){
                    stringToReturn += aem.getMorse();
                    //Condition pour ne pas ajouter space après le dernier mot
                    if(chm != CHAR_MORSE[CHAR_MORSE.length - 1])
                    {stringToReturn += " ";}
                    break;
                }
            }
        }
        return stringToReturn;
    }
    
    /**
     * Méthode pour effacer un string
     * @param alpha string à nottoyer.
     * @return a string vide
     */
    @Override
    public String nettoyerAlpha(String alpha) {return "";}
    
    /**
     * 
     * @return Les auteurs du logiciel
     */
    @Override
    public String getNomProgrammeurs() {return FTE + " " + BCK; }
    
    
}
