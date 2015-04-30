import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Portada
{
    private GreenfootImage ayuda; 
    
    public Ayuda()
    {
      ayuda = new GreenfootImage("bottonAyuda.png");
      setImage(ayuda);  
    }
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  /*  public void act() 
    {
       
               
        if(Greenfoot.mouseClicked(this))
        {
         // ((DiamondMars)getWorld()).cambiaNivel();
            getWorld().removeObject(this);
                    imagenPosicion=0;
        }
            
      
    }     // Add your action code here.
    }*/    
}
