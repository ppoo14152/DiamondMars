import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define el boton jugar
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Jugar extends Portada
{
    private GreenfootImage juega;
    /**
     * Act - do whatever the boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public Jugar()
    {
      juega = new GreenfootImage("bottonJugar.png");
      setImage(juega);  
    }
}


