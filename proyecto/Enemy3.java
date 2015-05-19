import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Enemigo
{
     public Enemy3()
    {
        GreenfootImage e3 = new GreenfootImage("1563.gif");
        setImage(e3);
    }
    public void act() 
    {
        super.act();
        move(-10);
    }
    
}
