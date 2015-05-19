import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Define la imagen del enemigo 2
 * 
 * @author (Infante Barbosa Angélica María ) 
 * @version (3 mayo 2015)
 */
public class Enemy2 extends Enemigo
{
   /**
    * Método constructor de la clase enemy2
    */   
    public Enemy2()
    {
        GreenfootImage e2 = new GreenfootImage("en_orbita.gif");
        setImage(e2);
    }
     /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        super.act();
        move(-10);
           
    }
}
