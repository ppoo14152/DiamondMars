import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Clase que define la imagen del boton creditos
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Creditos extends Portada
{
    private GreenfootImage cred;
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Creditos() 
    {
        cred= new GreenfootImage("bottonCreditos.png");
        setImage(cred);
    }    
}
