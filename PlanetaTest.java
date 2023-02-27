import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlanetaTest {    

    @Test 
    public void testPlanetaEnano()
    {     
        String nom1 = "Marte";
        String nom2 = "Pluto";
        int pes1 = 1000;
        int pes2 = 1500;
        int diametre = 5000;
        int diametre2 = 500;
        Planeta planetaEnano1 = new Planeta (nom1, diametre, pes1);
        Planeta planetaEnano2 = new Planeta (nom2, diametre2, pes2);
        assertEquals(1, planetaEnano1.planetaEnano());
        assertEquals(0, planetaEnano2.planetaEnano());   

    }


 

    

    @Test 
    public void testExpansio()
    {
        String nom = "xd";
        int diametre = 1000;
        int pes = 1000;

        Planeta planetaExpansio = new Planeta(nom,diametre, pes);

        boolean expansio = true;
        planetaExpansio.expansio();
       
    }

    @Test 
    public void testColisio()
    {        
        String nom1 = "Marte";
        int pes1 = 2500;
        int diametre = 5000;
        Planeta planetaEnano1 = new Planeta (nom1, diametre, pes1);
        assertEquals(1, planetaEnano1.colisio());
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
