import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * movimiento que seguiran todos los actores
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
        if(isTouching(Marvin.class)){
            ((DiamondMars)getWorld()).getPuntos().add(-1);
            getWorld().removeObject(this);
            
        }
    }    
  }    
