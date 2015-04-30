import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Portada
{
    private GreenfootImage juega;
    /**
     * Act - do whatever the boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public Jugar()
    {
      juega = new GreenfootImage("bottonJugar.png");
      setImage(juega);  
    }
}


