import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase tiene como objetivo proporcionar un mensaje, para que éste pueda ser mostrado.
 * 
 * @author Anélica María Infante Barbosa
 * @version 28 de abril de 2015
 */
public class Titulo extends Portada
{
    private String cad;
    
    /**
     * El contructor, recibira una cadena como imagen
     * @param unaCad cadena con el mensaje que se mostrará
     */
    public Titulo(String unaCad)
    {  
        cad=unaCad;
        GreenfootImage tittle;
        tittle= new GreenfootImage(cad,65,java.awt.Color.red,java.awt.Color.black);
        setImage(tittle);
    }
    
    public Titulo()
    {
        
    }
    /**
     * Act - do whatever the Titulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
