import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class glitter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class glitter extends Actor
{
    GifImage glitter = new GifImage("glitter.gif");
    /**
     * Act - do whatever the glitter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(glitter.getCurrentImage());
    }
}
