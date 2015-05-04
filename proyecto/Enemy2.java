import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (Infante Barbosa Angélica María ) 
 * @version (3 mayo 2015)
 */
public class Enemy2 extends Enemigo
{
   // private GreenfootImage e2;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy2()
    {
        GreenfootImage e2 = new GreenfootImage("en_orbita.gif");
        setImage(e2);
    }
    public void act() 
    {
        super.act();
        move(-10);
         /*if(isTouching(Marvin.class)){
            ((DiamondMars)getWorld()).getPuntos().add(-20);
             getWorld().removeObject(this);
       
           } */   
    }
}
