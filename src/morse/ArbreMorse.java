
package morse;

/**
 *
 * @author Marcos Gomes
 */
public class ArbreMorse
{
    private Noeud start,videOg,videOd,videUg;
    private Noeud T,M,N,O,G,K,D,Q,Z,Y,C,X,B;
    private Noeud E,A,I,W,R,U,S,J,P,L,F,V,H;
    private Noeud N0,N1,N2,N3,N4,N5,N6,N7,N8,N9;

    public ArbreMorse()
    {
        start = new Noeud("", T, E);
        T = new Noeud("t", M, N);
        M = new Noeud("m", O, G);
        N = new Noeud("n", K, D);
        O = new Noeud("o", videOg, videOd);
        G = new Noeud("g", Q, Z);
        K = new Noeud("k", Y, C);
        D = new Noeud("d", X, B);
        videOg = new Noeud("", N0, N9);
        videOd = new Noeud("", null, N8);
        Q = new Noeud("q", null, null);
        Z = new Noeud("z", null, N7);
        Y = new Noeud("y", null, null);
        C = new Noeud("c", null, null);
        X = new Noeud("x", null, null);
        B = new Noeud("b", null, N6);
        N0 = new Noeud("0", null, null);
        N9 = new Noeud("9", null, null);
        N7 = new Noeud("7", null, null);
        N6 = new Noeud("6", null, null);
        E = new Noeud("e", A, I);
        A = new Noeud("a", W, R);
        I = new Noeud("i", U, S);
        W = new Noeud("w", J, P);
        R = new Noeud("r", null, L);
        U = new Noeud("u", videUg, F);
        S = new Noeud("s", V, H);
        J = new Noeud("j", N1, null);
        P = new Noeud("p", null, null);
        L = new Noeud("l", null, null);
        videUg = new Noeud("", N2, null);
        F = new Noeud("f", null, null);
        V = new Noeud("v", N3, null);
        H = new Noeud("h", N4, N5);
        N1 = new Noeud("1", null, null);
        N2 = new Noeud("2", null, null);
        N3 = new Noeud("3", null, null);
        N4 = new Noeud("4", null, null);
        N5 = new Noeud("5", null, null);
    }

    public char lireNoeuds(Noeud noeud)
    {
        char toreturn = '2';
        
        return toreturn;
    }
    
    
    
}
