import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Portada
{
    /**
     * Act - do whatever the boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int imagenPosicion=0;
    
    public Jugar()
    {
      GreenfootImage imagen = new GreenfootImage("jugar2.png");
      setImage(imagen);  
    }
    
    /** 
      * este metodo se utiliza para que el objeto se mueva el actor 
      * con las indicaciones que le de el jugador
      */
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this))
        {
          ((DiamondMars)getWorld()).cambiaNivel();
            getWorld().removeObject(this);
        }
            
        if(Greenfoot.mouseMoved(this)){
            switch(imagenPosicion){
             case 0:GreenfootImage imagen = new GreenfootImage("jugar2.png");
                    setImage(imagen);
                    imagenPosicion=1;
                    break;
           
             case 1:GreenfootImage imagen2 = new GreenfootImage("jugar3.png");
                    setImage(imagen2);
                    imagenPosicion=0;
                    break;
           }
        }else
        {
            GreenfootImage imagen = new GreenfootImage("jugar2.png");
            setImage(imagen);
        }
    }    
}


