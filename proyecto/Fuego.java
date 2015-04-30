import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escribe una descrición de la clase Fuego aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Fuego extends Enemigo
{
    private GreenfootImage fuego1;
    private GreenfootSound quema;
    /**
     * Act - hace lo que Fuego quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     * metodo donde se inicializa la imagen de este actor
     */
    public Fuego()
    {
        GreenfootImage imagen = new GreenfootImage("fuego.gif");
        quema=new GreenfootSound("clic.mp3");
        setImage(imagen);
    }
    
    /**
     * metodo para llamar al contructor de la clase padre
     */
    public void act() 
    {
        super.act();
         if(isTouching(Marvin.class)){
             quema.play();
             quema.setVolume(50);
            ((DiamondMars)getWorld()).getVidas().add(-1);
            getWorld().removeObject(this);
            
        }
    }
}
