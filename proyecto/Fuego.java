import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escribe una descrición de la clase Fuego aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Fuego extends Enemigo{
    /**
     * Act - hace lo que Fuego quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     * metodo donde se inicializa la imagen de este actor
     */
    public Fuego()
    {
        GreenfootImage imagen = new GreenfootImage("fuego.gif");
        //agen.scale(imagen.getWidth(),imagen.getHeight());
        setImage(imagen);
    }
    
    /**
     * metodo para llamar al contructor de la clase padre
     */
    public void act() 
    {
        super.act();
    }
}
