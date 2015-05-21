import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase, muestra la información que el jugador necesita saber para poder manejar el juego.
 * 
 * @author Angélica María Infante Barbosa 
 * @version 28/abril/2015
 */
public class DiamondMarsAyuda extends World
{
    private Atras imgAtras;
    private GreenfootSound press;

    /**
     * Constructor for objects of class DiamondMarsAyuda.
     * 
     */
    public DiamondMarsAyuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,500, 1);
        imgAtras= new Atras();
        addObject(imgAtras,750,450);
        press=new GreenfootSound("boton_1.mp3");
    }
    /**
     *  El método actua de la ayuda es lo que se va hacer si se presiona el icono de atras para poder regresar al menú
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null){
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==imgAtras){
                press.play();
                Greenfoot.setWorld(new DiamondMarsMenu());
            }
        }
    }
}
        
    
