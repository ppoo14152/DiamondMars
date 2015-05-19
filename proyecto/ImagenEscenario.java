import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define el comportamiento de las imagene q componen el escenario
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class ImagenEscenario extends Actor
{
    public ImagenEscenario()
    {
        
    }
    
    /**
     * este metodo se utiliza para que el objeto se mueva 
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
