import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Angélica María Infante Barbosa
 * @version 5.1
 */
public class DiamondMars extends World
{
    public static final int TAM_X=1000;
    public static final int TAM_Y=550;
    private SimpleTimer tiempo;
    private SimpleTimer vidasT;
     private SimpleTimer puntosT;
    private Contador cadReloj;
    private Contador cadVidas;
    private Contador cadPuntos;
       
   
    private boolean abreNivel0;
    private boolean abreNivel1;
    private boolean barraCreada;
    private int nivel;
    private Contador pts;
    private int numBarra;
   
    
    public DiamondMars()
    { 
       super(TAM_X,TAM_Y, 1,false);
       setActOrder(ImagenEscenario.class,Marvin.class);
       nivel=0;
       
       
       //INICIALIZA CONTADORES
       //CONTADOR DE TIEMPO
        tiempo=new SimpleTimer();//tiempo
        cadReloj=new Contador("Tiempo:  ");
        cadReloj.setValue(60);//valor inicial de 60 segundos
        
        //CONTADOR DE VIDAS
        vidasT=new SimpleTimer();//vidas
        cadVidas=new Contador("Vidas:  ");
        cadVidas.setValue(3);//CUENTA CON 3 VIDAS
        
        //CONTADOR DE PUNTOS
        puntosT=new SimpleTimer();//puntos
        cadPuntos=new Contador("Puntos:  ");
        cadPuntos.setValue(0);
        
        //SE INICIALIZAN BANDERAS 
       abreNivel0=false;//para checar si entra alos niveles
       abreNivel1=false;
       barraCreada=false;
       numBarra=0;
       
    }
    
    /** 
     * actua del mundo, donde los objetos que tienen un movimiento aleatorio o en cierta posicion se crean.
     */
    public void act()
     {
        
         
          if(tiempo.millisElapsed()>=1000)
          {
            tiempo.mark();
            cadReloj.add(-1);
            numBarra++;
            if(numBarra==4){
               addObject(new Barra1(),getWidth()+getWidth()/4,getHeight()-100);
               numBarra=0;
            }
            
          }
            
            
                           
        //MENU
        if(nivel==0 && abreNivel0==false)
        {  //POSICIONA LOS BOTONES DEL MENU
             addObject(new Jugar(),getWidth()-getWidth()/2,getHeight()/4);
             abreNivel0=true;//para que solo se realice esta accion 1 vez
        }
        //NIVELES
        if(nivel==1 && abreNivel1==false)
        {
           Fuego f1=new Fuego();
           addObject(f1,400,getHeight()/3);
          addObject(new Marvin(),getWidth()/2-getWidth()/4,getHeight()/2+getHeight()/4);//Se añade Marvin
          addObject(new Barra1(),getWidth()/2-getWidth()/4,getHeight()-20);//Se inicializa la barra debajo de Marvin
          //addObject(new Barra2(),getWidth()-getWidth()/2,getHeight()-200);//Se posiciona la segunda barra
          addObject(cadVidas,100,30);
          addObject(cadReloj,220,30);
          addObject(cadPuntos,340,30);
          abreNivel1=true;//para que se realice solo una vez esta accion
        }
      
    }
    
   /** 
     * metodo para poder acceder al nivel que es privado
     * 
     * @return int nivel
     */
    public int getNivel()
    {
        return nivel;
    }
    
    public Contador getPuntos()
    {
        return cadPuntos;
    }
    
    public Contador getVidas()
    {
        return cadVidas;
    }
    
      
    /**
     *  metodo para cambiar el nivel al interactuar con el menu 
     */
     public void cambiaNivel()
    {
       GreenfootImage imagen;
       
        switch(nivel)
        {
           case 1 :removeObjects(getObjects(Portada.class));
                   tiempo.mark();
                   break;
        }   
        nivel++;
    }
    
     public void stopped() 
    {
     super.stopped(); 
     
    }
}
