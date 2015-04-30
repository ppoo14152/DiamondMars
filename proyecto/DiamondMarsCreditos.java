import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DiamondMarsCreditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamondMarsCreditos extends World
{
    private Atras imgAtras;
    private GreenfootSound press;

    /**
     * Constructor for objects of class DiamondMarsCreditos.
     * 
     */
    public DiamondMarsCreditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. 
        super(800,500, 1);
        imgAtras= new Atras();
        addObject(imgAtras,750,450);
        press=new GreenfootSound("boton_1.mp3");
    }
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
