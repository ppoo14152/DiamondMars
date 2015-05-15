import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    private String cad;
    
    public Level(String unaCad)
    {  
        cad=unaCad;
        GreenfootImage level;
        level= new GreenfootImage(cad,35,java.awt.Color.black,java.awt.Color.yellow);
        setImage(level);
    }
    
    public Level()
    {
        
    }
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
