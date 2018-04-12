
package morse;

import java.util.logging.Logger;

/**
 *  
 * @author Marcos Gomes
 */
public enum EnumMorse
{
    //Lettres
    A('a', ".-"),B('b', "-..."),C('c', "-.-."),D('d', "-.."),E('e', "."),
    F('f', "..-."),G('g', "--."),H('h', "...."),I('i', ".."),J('j', ".---"),
    K('k', "-.-"),L('l', ".-.."),M('m', "--"),N('n', "-."),O('o', "---"),
    P('p', ".--."),Q('q', "--.-"),R('r', ".-."),S('s', "..."),T('t', "-"),
    U('u',"..-"),V('v', "...-"),W('w', ".--"),X('x', "-..-"),Y('y', "-.--"),
    Z('z', "--.."),
    //Nombres
    N0('0',"-----"),N1('1',".----"),N2('2',"..---"),N3('3',"...--"),
    N4('4',"....-"),N5('5',"....."),N6('6',".---."),N7('7',"--..."),
    N8('8',"---.."),N9('9',"----."),
    //Symboles
    S1('\'',".----."),S2(':',"---..."),S3(',',"--..--"),S4('-',"-...-"),
    S5('(',"-.--.-"),S6('.',".-.-.-"),S7('?',"..--.."),S8(';',"-.-.-."),
    S9('/',"-..-."),S10(')',"---.."),S11('=',"-...-"),S12('@',".--.-."),
    S13('"',".-..-."),S14('+',".-.-."),S15(' ',"/");

    private char lettre;
    private String morse;
    /**
     * @param lettre Charactère pour comparer avec le char entré
     * @param morse String correspondant à la lettre
     */
    private EnumMorse(char lettre, String morse)
    {
        this.lettre = lettre;
        this.morse = morse;
    }
    
    //Getters
    public char getLettre(){return lettre;}
    public String getMorse(){return morse;}
    //Get an EnumMorses array 
    public EnumMorse [] getArrayEnumMorses()
    {
        EnumMorse [] ems = EnumMorse.values();
        return ems;
    }

    
    
}
