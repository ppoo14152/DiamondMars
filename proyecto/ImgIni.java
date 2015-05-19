import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que define la imagen dee inicio de la portada
 * 
 * @author (Angélica María Infante Barbosa) 
 * @version (18 mayo 2015)
 */
public class ImgIni extends Portada
{
    private GreenfootImage imgIni;
    /**
     * Método constructor que permite crear la imagen de inicio del juego
     */
    public ImgIni()
    {
        imgIni=new GreenfootImage("marvinFondo.png");
        imgIni.scale(250,350);
        setImage(imgIni);
        
    }
        
}
