import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define la imagen del boton de records
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class Records extends Portada
{
    private GreenfootImage record;
    /**
     * método constructor de la clase records
     */
    public Records() 
    {
        record= new GreenfootImage("bottonRecords.png");
        setImage(record);
    }    
}
