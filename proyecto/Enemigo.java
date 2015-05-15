import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    private boolean choca=false;
    
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

