import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define la imagen del boton de ayuda
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Ayuda extends Portada
{
    private GreenfootImage ayuda; 
    
    /**
     * Constructor de la clase Ayuda
     */
    public Ayuda()
    {
      ayuda = new GreenfootImage("bottonAyuda.png");
      setImage(ayuda);  
    }
     
}
