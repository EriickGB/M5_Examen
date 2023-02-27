/**
 * Aquesta es la classe planeta
 * @author: Erick Gomez
 * 
 */

public class Planeta 
{
    /*
    *Les variables globals de nom, diàmetre i pes que utilitzaràn els planetes.
    */
    String nom;
    static int diametre;
    static int pes;    

    /**A l'objecte planeta li pasem els atributs de nom, el diàmetre i el pes. 
    Contructor amb tots els parametres */ 
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    /**
     * Constructor buit
     */
    public Planeta(){}

    /**
     * Si el planeta té un diàmetre menor a 1300, es declararà com a planeta enano.
     * */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    /**
     * Si el planeta s'expandeix, el seu diametre sirà 3 cops major al que tenia.
     */
    public void expansio()
    {        
        boolean expansio = false;
        if(expansio == true){
            Planeta.diametre = Planeta.diametre * 3;
        }else{
            
        }
    }

    /**
    *Funcio de si hi ha una colisio amb un meteorit. 
    *Si hi ha una colisió, el pes del planeta 
    */
    public static int colisio(int meteorito){

        boolean colisio = false;
        if (colisio == true){
            Planeta.pes = Planeta.pes - meteorito.pes;
            if(Planeta.pes >= 1800){
                return 1;
            }
        }else{
            Planeta.diametre = Planeta.diametre + meteorito.pes / 50;
            return 0;
        }
        return -1;
       
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
