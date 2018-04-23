
package morse;

import java.text.Normalizer;

/**
 * Classe pour convertir du code morse en alpha charactères et vice-versa.
 * @author Sire Marcos Gomes
 */
public class Morse implements TraducteurMorse{
    private final String BCK,FRT,MSG,VIDE,SPACE;
    private final EnumMorse [] ARRAY_ENUM_MORSE;
    
    public Morse(){
        this.BCK = "Marcos";
        this.FRT = "Nidhal";
        this.MSG = "Pas trouvé";
        this.VIDE = "";
        this.SPACE = " ";
        this.ARRAY_ENUM_MORSE = EnumMorse.values();
    }
          
    @Override
    public String toAlpha(String morse){
        try{
            String stringToReturn = VIDE;
            //Tableau sans space
            String [] arrayMorse = morse.split(SPACE);
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
            if(stringToReturn.equals(VIDE)){return MSG;}
            else {return stringToReturn.toUpperCase();}
        }
        catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
    /**
     * Méthode pour convertir un mot en format morse.
     * @param alpha Le mot entré
     * @return Un string sur le format morse
     */
    @Override
    public String toMorse(String alpha){
        try{
            String stringToReturn = VIDE;
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
                        {stringToReturn += SPACE;}
                        break;
                    }
                }
            }
            if(stringToReturn.equals(VIDE)){return MSG;}
            else {return stringToReturn;}
        }
        catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
    /**
     * Méthode pour effacer un string
     * @param alpha string à nottoyer.
     * @return a string vide
     */
    @Override
    public String nettoyerAlpha(String alpha) {return VIDE;}
    /**
     * 
     * @return Les auteurs du logiciel
     */
    @Override
    public String getNomProgrammeurs() {return FRT + SPACE + BCK; }
    /**
     * convert un string en autre string sans accents 
     * @param input string avec accents
     * @return un string sans accents
     */
    private String normaliser(String input){
        return Normalizer.normalize(input, Normalizer.Form.NFD);
    }
    public String getBCK(){return BCK;}
    public String getFRT(){return FRT;}
    public EnumMorse[] getARRAY_ENUM_MORSE(){return ARRAY_ENUM_MORSE;}
}
