import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define la imagen regresar, así como su comportamiento.
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Atras extends Portada
{
    private GreenfootImage atras;
    private GreenfootSound press;
    /**
     * Constructor de la clase Atras
     */
    public Atras()
    {
        atras= new GreenfootImage("atras.png");
        setImage(atras);
        press=new GreenfootSound("boton_1.mp3");
    }
    /**
     * Act - do whatever the Atras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==this){
            Greenfoot.setWorld(new DiamondMarsMenu());
            }
        }    
    }
}
