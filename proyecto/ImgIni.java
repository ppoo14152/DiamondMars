import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ImgIni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImgIni extends Portada
{
    private GreenfootImage imgIni;
    /**
     * Act - do whatever the ImgIni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ImgIni()
    {
        imgIni=new GreenfootImage("marvinFondo.png");
       // imgIni.scale((getWidth())*2, (getHeight())*2);
        imgIni.scale(250,350);
        setImage(imgIni);
        
    }
        
}
