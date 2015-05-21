import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Fuego, en ella se muestran los principales comportamientos del enemigo fuego
 * 
 * @autor (Angélica María Infante Barbosa  ) 
 * @versión (18 mayo 2015)
 */
public class Fuego extends Enemigo
{
    
    private GreenfootSound quema;
    
    /**
     * Método contructor de la clase
     */
    public Fuego()
    {
        GreenfootImage imagen = new GreenfootImage("fuego.gif");
        quema=new GreenfootSound("clic.mp3");
        setImage(imagen);
    }
    
    /**
     * Act - hace lo que Fuego quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     * metodo donde se inicializa la imagen de este actor
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
