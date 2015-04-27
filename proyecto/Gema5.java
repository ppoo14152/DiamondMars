import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gema5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gema5 extends Gema
{
    /**
     * Act - do whatever the Gema5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gema5()
    {
        GreenfootImage imagen = new GreenfootImage("gema3.gif");
        setImage(imagen);
    }
    public void act() 
    {
      super.act();
      if(isTouching(Marvin.class)){
            ((DiamondMars)getWorld()).getPuntos().add(5);
            getWorld().removeObject(this);
            
         }
    }    
}
