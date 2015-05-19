import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase contiene el menú principal del juego.
 * 
 * @author Angélica María Infante Barbosa 
 * @version 28/abril/2015
 */
public class DiamondMarsMenu extends World
{
    
    private GreenfootImage fmenu;
    private Jugar jugar;
    private Ayuda ayuda;
    private Creditos cred;
    private Records rec;
    private ImgIni img;
    private MouseInfo mInf;
    private GreenfootSound press;
    
    private Titulo tittle;
    /**
     * Constructor for objects of class DiamondMarsMenu. Posiciona los botones del menú
     * 
     */
    public DiamondMarsMenu()
    {    
         super(800, 500, 1);
         jugar= new Jugar();
         ayuda= new Ayuda();
         cred= new Creditos();
         rec= new Records();
         img= new ImgIni();
         press=new GreenfootSound("boton_1.mp3");
         
         tittle=new Titulo("DiamondMars");
         posiciona();
    }
    
    /**
     * El método posiciona, se encarga de ubicar en el escenario los distintos botones del menú.
     */
    
    public void posiciona()
    {
        addObject(jugar, getWidth()/2+200,getHeight()/2-100);
        addObject(ayuda, getWidth()/2+200,getHeight()/2);
        addObject(cred,getWidth()/2+200,getHeight()/2+100);
        addObject(rec,getWidth()/2+200,getHeight()/2+200);
        addObject(img,250,280);
        addObject(tittle,340,80);
    }
    
    /**
     * El método actua checa si se presionan los botones del menu y las acciones posteriores a dicha acción.
     */
    public void act()
    {
       if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == jugar){
                press.play();
                Greenfoot.delay(30);
                Greenfoot.setWorld(new DiamondMars());
            }
        
       }
       
       if(Greenfoot.getMouseInfo()!=null){
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==ayuda){
               press.play();
               Greenfoot.delay(5);
               Greenfoot.setWorld(new DiamondMarsAyuda());
            }
       }
       
       if(Greenfoot.getMouseInfo()!=null){
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==cred){
               press.play();
               Greenfoot.delay(5);
               Greenfoot.setWorld(new DiamondMarsCreditos());
            }
       }
       
        if(Greenfoot.getMouseInfo()!=null){
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==rec){
               press.play();
               Greenfoot.delay(5);
               Greenfoot.setWorld(new DiamondMarsRecords());
            }
       }
    }
}

