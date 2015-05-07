import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase contiene a Marvin, asi como sus comportamientos en el juego.
 * @author Angélica María Infante Barbosa 
 * @version 28 de abril de 2015
 */
public class Marvin extends Actor
{
    private int vel=10;
    private int velSalto=30;
    private int acel;
    private boolean salto;
    private int jump;
    private boolean choca=false;
    private int tiempo;
    private int pts;
    private int vidas;
    private Enemy2 e2;
    //private GreenfootImage marI= new GreenfootImage("marvinnaveizq.gif");
    private GreenfootImage mar= new GreenfootImage("marvinnave.gif");
    private GreenfootSound take;
    /**
     * metodo constructor de Marvin, en el se especifican las variables
     * de las cuales depende el comportamiento de Marvin
     */    
    public Marvin()
    {
       setImage(mar);
       velSalto=0;
       acel=2;
       jump=10;
       pts=0;
       vidas=3;
       take=new GreenfootSound("disparolaser.mp3");
       
       
    }
     /***
      * Método actúa, en el cual se llaman a los metodos 
      * que generan el movimiento de Marvin y sus caracteristicas.
      * 
      */
    public void act() 
    {
        
        mueveMarvin();
        checkFall();
        tomaGemas();
        subeNivel();
        
   }
   
     /**
    *En este metodo se checa cuando Marvin toca las gemas, 
    *lo cual incrementa sus puntos. 
    */
   
   public void tomaGemas()
   {
       if(this.isTouching(Gema5.class)){
           take.play();
           pts+=5;
           removeTouching(Gema5.class);
        }
       
       if(this.isTouching(gema10.class)){
           take.play();
           pts+=10;
           removeTouching(gema10.class);
        }
        
       if(this.isTouching(gema20.class)){
           take.play();
           pts+=20;
           removeTouching(gema20.class);
        }
        
        if(this.isTouching(Enemy2.class)){//(Enemy2.class)){
            pts-=20;
            removeTouching(Enemy2.class);
        
        }
    }
    
   /**
    * Metodo que checa las condiciones necesarias para que suba de nivel 
    * el jugador.
    */
   public void subeNivel()
   {
       if(pts>=100 && ((DiamondMars)getWorld()).getNivel()==1){
           ((DiamondMars)getWorld()).setNivel(2);
           ((DiamondMars)(getWorld())).act();
        }
        
       if(pts>=200 && ((DiamondMars)getWorld()).getNivel()==2){
           ((DiamondMars)getWorld()).setNivel(3);
           ((DiamondMars)(getWorld())).act();
        }
        
       if(pts>=300){
           ((DiamondMars)getWorld()).fin();
        }
        
    }
    
    /** 
      * En este método se indican los movimientos de Marvin
      */
    public void mueveMarvin()
    { 
    
        if(Greenfoot.isKeyDown("right")){
          moveDer(); 
        }
        
        if(Greenfoot.isKeyDown("left")){
           mar.mirrorHorizontally();
           moveIzq(); 
        }
        
        if(Greenfoot.isKeyDown("up")){
           saltar();
         }
        if(getY()>=550){//Checa si Marvin cayó de la barra{ 
             //((DiamondMars)getWorld()).stopped();//
             Greenfoot.stop();
             
          }
    
      }
      
    /**
     * En el metodo saltar se le asigna a la velocidad del salto de marvin
     * una especie de gravedad.
     */  
      public void saltar()
      {
         velSalto = -jump;
         fall();
      }
      
    /**
     * Metodo onGround, en este metodo se checa si Marvin toca una barra o no.
     */  
      public boolean onGround()
      {
         if(!isTouching(Barra1.class)){//Si NO esta tocando el piso
             return false;
            }else{
                return true;
            }
      }
     /**
      * Metodo que checa si marvin cayó
      */
      
      public void checkFall()//Checa si cayó
      {
          if(onGround()){
              velSalto=0;
            }else{
                fall();
            }
      }
      /**
       * Método donde Marvin cae, aplicacion de la gravedad
       */
      
      public void fall()
      {
          setLocation(getX(),getY()+velSalto);
          velSalto = velSalto + acel;
        
        }
      /**
       * Método que efectua el movimiento hacia la derecha
       */
      public void moveDer()
      {
         if(getX()<=getWorld().getWidth()/2){
            setLocation(getX()+1,getY());
            } 
                
          if(tiempo==2)
          {
             setImage(mar);
             tiempo=0;
           }
            tiempo++; 
      }
      
      /**
       * Método que efectua el movimiento hacia la izquierda
       */
      public void moveIzq()
      {
          
          if(getX()>=40){
             setLocation(getX()-1,getY());
          }  
                
          if(tiempo==2){
             setImage(mar);
             tiempo=0;
               }
          tiempo++;
      }
      /**
       * Método para poder modificar los puntos que tiene marvin.
       */
      public void setPts(int aPts)
      {
          pts=aPts;
      }
      
      /**
       * Método que permite acceder a los puntos
       */
      public int getPts()
      {
          return pts;   
      }
      
      /**
       * Método que permite acceder a las vidas
       */
      public int getVidas()
      {
       return vidas;
       }
    }