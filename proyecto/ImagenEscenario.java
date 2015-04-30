import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escribe una descrición de la clase ImagenEscenario aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class ImagenEscenario extends Actor
{
    /**
     * Act - hace lo que imagenFondo quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public ImagenEscenario()
    {
        
    }
    
    /**
     * este metodo se utiliza para que el objeto se mueva 
     */
    public void act() 
    {
        //if(getWorld().getNivel()==1){
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()+10,getY());
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()-10,getY());
        }
       
     //  }    
    }
}
