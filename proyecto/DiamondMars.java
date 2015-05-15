import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase, contiene el comportamiento de los objetos del juego.
 * asi como algunos getters para poder interactuar con ellos en más clases.
 * 
 * @author Angélica María Infante Barbosa
 * @version 28/abril/2015
 */
public class DiamondMars extends World
{
    public static final int TAM_X=800;
    public static final int TAM_Y=500;
    private Marvin marvin;
    private Fuego fuego1;
    private Enemy2 enemigo2;
    private Enemy3 enemigo3;
    private Barra1 b1;
    private Gema5 g5;
    private gema10 g10;
    private gema20 g20;
    private SimpleTimer tiempo, vidasT, puntosT;
    private Counter cadReloj, cadVidas,cadPuntos; 
    private Atras atras;
    private GameO imgFin;
    private Winner imgWin;
    private Gana marG;
    private GreenfootImage marI;

    private GreenfootSound press;
    private int nivel;
    private Counter pts;
    private int numBarra;
    private int numGema5;
    private int numGema10;
    private int numGema20;
    private int numFuego;
    private int numEnem2;
    private int numEnem3;
    private GreenfootSound musicFondo;
    private GreenfootSound finGame;
    private Level nivel2;
    private Level nivel3;
    private Level nivel1;
    private boolean creaObjetos;

    /**
     * En el constructor se inicializan los objetos que conforman el escenario
     * del juego.
     */

    public DiamondMars()
    { 
        super(TAM_X,TAM_Y, 1,false);
        setPaintOrder(Marvin.class,Barra1.class,Fuego.class,Gema5.class);
        setActOrder(ImagenEscenario.class,Marvin.class);

        marvin= new Marvin(); 
        b1= new Barra1();
        fuego1= new Fuego();
        enemigo2= new Enemy2();
        enemigo3=new Enemy3();
        g5= new Gema5();
        g20=new gema20(); 
        g10=new gema10();
        nivel1= new Level("*Nivel 1*");
        nivel2=new Level("** Nivel 2 **");
        nivel3=new Level("***Nivel 3***");

        tiempo=new SimpleTimer();//tiempo
        cadReloj=new Counter("Tiempo:  ");
        cadReloj.setValue(60);//valor inicial de 60 segundos

        vidasT=new SimpleTimer();//vidas
        cadVidas=new Counter("Vidas:  ");
        cadVidas.setValue(3);//CUENTA CON 3 VIDAS

        puntosT=new SimpleTimer();//puntos
        cadPuntos=new Counter("Puntaje:  ");
        cadPuntos.setValue(0);
        
        numBarra=0;
        numGema5=0;
        numGema10=0;
        numGema20=0;
        numFuego=0;
        numEnem2=0;
        numEnem3=0;
        creaObjetos=false;

        prepare();
        atras=new Atras();
        imgFin=new GameO();
        imgWin=new Winner();
        marG=new Gana();
        press=new GreenfootSound("boton_1.mp3");
        musicFondo=new GreenfootSound("Nicky Romero - Toulouse.mp3");
        finGame=new GreenfootSound("finJuego.mp3");

    }
    /** 
     *  Método prepare del mundo, en el, los objetos se posicionan en el escenario.
     */
    public void prepare()
    {
        Greenfoot.setWorld(new DiamondMarsMenu());
        addObject(marvin,100,400);
        addObject(fuego1,130,getHeight()-90);
        addObject(g5,Greenfoot.getRandomNumber(780),250);
        addObject(g10,Greenfoot.getRandomNumber(780),200);
        addObject(b1, 200,490);
        addObject(b1,300,480);
        addObject(cadVidas,300,30);
        addObject(cadReloj,500,30);
        addObject(cadPuntos,700,30);
        tiempo.mark();
        cadReloj.add(-1);
        nivel=1;
        

    }   

    /**
     * Metodo actua, en el se especifican los comportamientos de los contadores
     * los sonidos del juego, etc
     */
    public void act()
    { 
        musicFondo.playLoop();
        musicFondo.setVolume(20);
        cadPuntos.setValue(marvin.getPts());
        //if(marvin.getCrea()==false)
        switch(nivel){
            case 1: cambiaNivel1();
            break;      
            case 2: cambiaNivel2();
            break;
            case 3: cambiaNivel3();
            break;
        }
    }

    /**
     * Metodo cambia nivel 1, en este metodo se encuentra el comportamiento del juego en el nivel 1.
     */

    public void cambiaNivel1()
    {
        addObject(nivel1, 100, 30);                       
        if(marvin.getCrea()==true){
            
            if(tiempo.millisElapsed()>=1000){

                numBarra++;
                numFuego++;
                numGema10++;
                numGema20++; 
                tiempo.mark();
                cadReloj.add(-1);

                if(numBarra==2){
                    addObject(new Barra1(),getWidth()+getWidth()/4,getHeight()-150);
                    addObject(new Barra1(),getWidth()+getWidth()/3,getHeight()-380);
                    numBarra=0;
                }

                if(numGema5==0){
                    addObject(new Gema5(), getWidth()+getWidth()/4, getHeight()-250);
                    numGema5=0;
                }

                if(numGema10==2){
                    addObject(new gema10(),getWidth()+getWidth()/5,getHeight()-300);
                    numGema10=0;
                }

                if(numFuego==4){
                    addObject(new Fuego(), getWidth()+getWidth()/3, getHeight()-200);
                    numFuego=0;
                }
                if(cadVidas.getValue()==0){
                    removeObject(cadVidas);
                    fin();

                }
                if(cadReloj.getValue()==0){
                    removeObject(cadReloj);
                    fin();
                }
                if(cadPuntos.getValue()>=100){
                    removeObject(cadPuntos);
                    // cadVidas.setValue(3);
                    //cadReloj.setValue(60);
                    marvin.setPts(101);
                    

                    //nivel=2;

                }
            }  
            //}
            //creaObjetos=false; 
        }
       
    }

    /**
     * Metodo cambia nivel 2, en este metodo se encuentra el comportamiento del juego en el nivel 2.
     */

    public void cambiaNivel2()
    {
        removeObject(nivel1);
        addObject(nivel2, 100,30);

        GreenfootImage back2= new GreenfootImage("mars.jpg");
        setBackground(back2);
        if(marvin.getCrea()==true){ 
            if(tiempo.millisElapsed()>=1000){

                numGema10++;
                numGema20=0;
                numBarra++;
                numFuego++;
                numEnem2++;           

                tiempo.mark();
                cadReloj.add(-1);

                if(numBarra==2){
                    addObject(new Barra1(),getWidth()+getWidth()/4,getHeight()-50);
                    addObject(new Barra1(),getWidth()+getWidth()/2,getHeight()-340);
                    numBarra=0;
                }

                if(tiempo.millisElapsed()>=1000 || numGema10>=0){
                    addObject(new gema10(),getWidth()+getWidth()/4,getHeight()-300);
                    numGema10=0;
                }

                if(tiempo.millisElapsed()>=1000 || numGema20==0){
                    addObject(g20,getWidth()+getWidth()/5,getHeight()-280);
                    numGema20=0;
                }

                if(numFuego==4){
                    addObject(new Fuego(), getWidth()+getWidth()/2, getHeight()-95);
                    numFuego=0;
                }

                if(numEnem2==4){
                    addObject(new Enemy2(), getWidth()+ getWidth()/3, getHeight()-125);
                    addObject(new Enemy2(), getWidth()+ getWidth()/4, getHeight()-225);
                    numEnem2=0;
                }

                if(cadVidas.getValue()<=0){
                    removeObject(cadVidas);
                    fin();
                }

                if(cadReloj.getValue()<=0){
                    removeObject(cadReloj);
                    fin();
                }

                if(cadPuntos.getValue()>=300){
                    removeObject(cadPuntos);
                    marvin.setPts(301);

                    nivel=3;
                    tiempo.mark();
                    cadReloj.add(-1);

                }

            }
        }
        //  creaObjetos=false;
    }

    /**
     * Metodo cambia nivel 3, en este metodo se encuentra el comportamiento del juego en el nivel 3.
     */

    public void cambiaNivel3()
    {
        removeObject(nivel2);
        addObject(nivel3, 100,30);
        GreenfootImage back3= new GreenfootImage("fc.jpeg");
        //if(marvin.getCrea()==true){
        if(tiempo.millisElapsed()>=1000){
             
            setBackground(back3);
            tiempo.mark();
            cadReloj.add(-1);
            numBarra++;
            numGema5++;
            numGema10++;
            numGema20++;
            numFuego++;
            numEnem2++;
            numEnem3++;

            if(numBarra==2){
                addObject(new Barra1(),getWidth()+getWidth()/4,getHeight()-30);
                numBarra=0;
            }
            if(numGema5>=0){
                addObject(new Gema5(),getWidth()+getWidth()/4,getHeight()-180);
                numGema5=0;
            }
            if(numGema10>=0){
                addObject(new gema10(), getWidth()+getWidth()/2, getHeight()-200);
                numGema10=0;
            }
            if(numGema20>=0){
                addObject(new gema20(), getWidth()+getWidth()/3,getHeight()-380);
                numGema20=0;
            }

            if(numFuego==4){
                addObject(new Fuego(), 760, getHeight()-85);
                addObject(new Fuego(), 670, getHeight()-105);
                numFuego=0;
            }            
            if(numEnem2==2){
                addObject(new Enemy2(), getWidth(),getHeight()-100);
                addObject(new Enemy2(), getWidth(),getHeight()-250);
                numEnem2=0;
            }
            
            if(numEnem3==2){
                addObject(new Enemy3(), getWidth(),getHeight()-50);
                addObject(new Enemy3(), getWidth(),getHeight()-350);
                numEnem3=0;
            }
            if(cadReloj.getValue()<=0){
                removeObject(cadReloj);
                fin();
            }

            if(cadVidas.getValue()<=0){
                removeObject(cadVidas);
                fin();
            }

            if(cadPuntos.getValue()>=600){
                removeObject(cadPuntos);
                ganaste();

            }

            //  creaObjetos=false;
        }
       
    }

    /**
     * metodo para poder modificar el nivel del juego.
     * @param un Nivel que sustituirá al nivel actual.
     */
    public void setNivel(int unNivel)
    {
        nivel=unNivel;
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

    /**
     * metodo getter para acceder a los puntos que son privados
     */
    public Counter getPuntos()
    {
        return cadPuntos;
    }

    /**
     * Metodo para acceder a las vidas, ya que son privadas
     */

    public Counter getVidas()
    {
        return cadVidas;
    }

    /**
     * Método que permite acceder a Marvin ya que es privado.
     */
    public Marvin getMarvin()
    {
        return marvin;
    }

    /**
     * Método que permite acceder a la gema azul privada.
     */
    public Gema5 getGema5()
    {
        return g5;
    }

    /**
     * Metodo que permite acceder a la gema verde privada.
     */
    public gema10 getGema10()
    {
        return g10;
    }

    /**
     * Metodo para acceder a la gema roja. Ya que es privada
     */
    public gema20 getGema20()
    {
        return g20;
    }

    /**
     * Método para terminar el juego, checando cuantas vidas hay y cuanto tiempo hay
     */
    public void fin()
    {      
        if((cadVidas.getValue()==0) || (cadReloj.getValue()<=0) ){
            removeObjects(getObjects(Actor.class));
            addObject(imgFin,getWidth()/2,getHeight()/2);
            addObject(atras,760,420);
            finGame.play();
            this.stopped();

        }
    }

    public void ganaste()
    {
        if((cadPuntos.getValue()>=600)){
            removeObjects(getObjects(Actor.class));
            addObject(imgWin,getWidth()/2,getHeight()-400);
            addObject(marG,getWidth()/2,getHeight()-160);
            addObject(atras,760,420);
            this.stopped();
        }

    }

    public void started()
    {
        super.started();
        musicFondo.play();

    }

    /**
     * metodo para detener el juego.
     */
    public void stopped() 
    {
        super.stopped();
        // finGame.pause();
        musicFondo.pause();

    }
}
