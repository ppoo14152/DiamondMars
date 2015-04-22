import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marvin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marvin extends Actor
{
    private int vel=10;
    private int velSalto=40;
    private int acel;
    private boolean salto;
    private int jump;
    private boolean choca=false;
    private int tiempo;
   
    
    GifImage imagen = new GifImage("ani_marv.gif");
        
    public Marvin()
    {
      setImage(imagen.getCurrentImage());
       tiempo=0;
       velSalto=0;
       acel=2;
       jump=10; 
       salto=false;
      
    }
     /***
      * este metodo hace que el objeto se mueva
      * 
      */
    public void act() 
    {
        // Add your action code here.
        mueveMarvin();
        checkFall();
   }
   
    /** 
      * este metodo se utiliza para que el objeto se mueva el actor con las indicaciones que le de 
      * el jugador
      */
    public void mueveMarvin()
    { 
    
    
        if(Greenfoot.isKeyDown("right"))
        {
          moveDer(); 
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
           moveIzq(); 
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
           saltar();
         }
        if(getY()>=550)//Checa si Marvin cayó de la barra
         {  
             setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2+getWorld().getHeight()/4);//Indica la nueva posicion despues de que Marvin caiga
             getWorld().addObject(new Barra1(),getWorld().getWidth()/3+getWorld().getWidth()/4,getWorld().getHeight()-30);//Indica la posicion de las Barras (piso)
             ((DiamondMars)getWorld()).getVidas().add(-1);//Decrementa Vidas
        }
        
        
      }
      
      
      public void saltar()
      {
         velSalto = -jump;
         fall();
      }
      
      public boolean onGround()
      {
         if(!isTouching(Barra1.class)&&(!isTouching(Barra2.class)))//Si NO esta tocando el piso
         {
             return false;
            }else
            {
                return true;
            }
      }
      
      public void checkFall()//Checa si cayó
      {
          if(onGround())
          {
              velSalto=0;
            }else
            {
                fall();
            }
      }
      
      public void fall()//Metodo para que Marvin Caiga(Gravedad)
      {
          setLocation(getX(),getY()+velSalto);
          velSalto = velSalto + acel;
        
        }
      
      public void moveDer()
      {
         if(getX()<=getWorld().getWidth()/2)
         {
            setLocation(getX()+1,getY());
            } 
                
          if(tiempo==2)
          {
             setImage(imagen.getCurrentImage());
             tiempo=0;
           }
            tiempo++; 
      }
      
      public void moveIzq()
      {
          
          if(getX()>=40)
          {
             setLocation(getX()-1,getY());
          }  
                
          if(tiempo==2){
             setImage(imagen.getCurrentImage());
             tiempo=0;
               }
          tiempo++;
      }
    }