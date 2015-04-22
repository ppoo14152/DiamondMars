import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barra1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barra1 extends ImagenEscenario
{
   
    /**
     * Act - hace lo que PiñaPodrida quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     * metodo donde se inicializa la imagen de este actor
     */
    public Barra1()
    {
       GreenfootImage imgBarra = new GreenfootImage("Barra_Magia_Ocarina_of_Time.png");
       imgBarra.scale(imgBarra.getWidth(), imgBarra.getHeight());
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
