import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define la imagen que representa la barra del juego
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Barra2 extends ImagenEscenario
{
   
    /**
     * Act - hace lo que PiñaPodrida quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     * metodo donde se inicializa la imagen de este actor
     */
    public Barra2()
    {
       GreenfootImage imgBarra = new GreenfootImage("barra2.jpg");
       imgBarra.scale(imgBarra.getWidth()*2, imgBarra.getHeight());
       setImage(imgBarra);
    }
    
    /**
     * metodo para llamar al contructor de la clase padre
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
