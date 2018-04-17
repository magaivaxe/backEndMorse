
package morse;


/**
 *  Enumération qui cree la liste des lettres, numéros et symboles. Chaque item
 *  de la liste est construit avec le charactère correspondant et son morse.
 * @author Sire Marcos Gomes
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
    S1('\'',".----."),S2(':',"---..."),S3(',',"--..--"),S4('-',"-....-"),
    S5('(',"-.--."),S6('.',".-.-.-"),S7('?',"..--.."),S8(';',"-.-.-."),
    S9('/',"-..-."),S10(')',"-.--.-"),S11('=',"-...-"),S12('@',".--.-."),
    S13('"',".-..-."),S14('+',".-.-."),S15(' ',"/"),S16('!',"-.-.--"),
    S17('&',".-..."),S18('_',"..--.-"),S19('$',"...-..-");
    //Atributts 
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
}
