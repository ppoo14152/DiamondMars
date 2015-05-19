import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Define por default el movimiento de los enemigos
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Enemigo extends Actor
{
    private boolean choca=false;
    /**
     * Método actua de clase enemigo
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

