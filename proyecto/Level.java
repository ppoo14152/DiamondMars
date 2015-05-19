import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define los letreros de los niveles
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
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
