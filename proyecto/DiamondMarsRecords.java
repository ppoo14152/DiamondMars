import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se crean los objetos que conformarán al mundo de los records. Se implementa la clase ScoreBoard
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (6 mayo 2015)
 */
public class DiamondMarsRecords extends World
{
    private Atras atras;
    private ScoreBoard score;
    private GreenfootSound press;

    /**
     * Constructor for objects of class DiamondMarsRecords.
     * 
     */
    public DiamondMarsRecords()
    {    
        super(800, 500, 1); 
         
        score=new ScoreBoard(600, 400);
        addObject(score, getWidth()/2, getHeight()/2);
        atras=new Atras();
        addObject(atras,750,450);
        press=new GreenfootSound("boton_1.mp3");
    }
    /**
     * Método actúa del mundo de records, checa si se presiona el icono de regresar.
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==atras){
               press.play();
                Greenfoot.setWorld(new DiamondMarsMenu());
            }
            
        }   
    }
}
