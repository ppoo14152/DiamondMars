import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que contiene como subclases a las gemas del juego, 
 * aqui se define el comportamiento de movimiento de las gemas.
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (15 mayo 2015)
 */
public class Gema extends Actor
{
    /**
     * Act - do whatever the Gema wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()+10,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()-10,getY());
        }
            
   }
   
}