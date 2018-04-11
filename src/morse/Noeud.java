/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author eleves
 */
public class Noeud
{
    private String lettre;
    private Noeud gauche;
    private Noeud droit;
    
    /**
     * 
     * @param lettre La lettre du alphabet
     * @param morse Le code morse correspondant à la lettre 
     * @param gauche Le prochain Noeud gauche
     * @param droit Le prochain Noeud droit
     */
    public Noeud(String lettre,
                 Noeud gauche,
                 Noeud droit)
    {
        this.lettre = lettre;
        this.gauche = gauche;
        this.droit = droit;
    }
    /**
     * Constructeur vide
     */
    public Noeud()
    {
    }
    
    //Setters and getters =====================================
    public String getLettre()
    {
        return lettre;
    }

    public void setLettre(String lettre)
    {
        this.lettre = lettre;
    }


    public Noeud getGauche()
    {
        return gauche;
    }

    public void setGauche(Noeud gauche)
    {
        this.gauche = gauche;
    }

    public Noeud getDroit()
    {
        return droit;
    }

    public void setDroit(Noeud droit)
    {
        this.droit = droit;
    }

    @Override
    public String toString()
    {
        return "Noeud{" + 
                "lettre=" + lettre + '}';
    }
    
    
    
    
}
