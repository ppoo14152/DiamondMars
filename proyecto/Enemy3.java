import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Define la imagen del enemigo 3
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Enemy3 extends Enemigo
{
    /**
     * Constructor de la clase Enemy3
     */
    public Enemy3()
    {
        GreenfootImage e3 = new GreenfootImage("1563.gif");
        setImage(e3);
    }
    public void act() 
    {
        super.act();
        move(-10);
    }
    
}
