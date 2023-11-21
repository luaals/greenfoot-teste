import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bobganha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bobganha extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class bobganha.
     * 
     */
    public bobganha()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 640, 1);  
        act();
    }
     public void act(){
    if (Greenfoot.isKeyDown("shift") && atraso == 0){
            creditos world = new creditos();
            Greenfoot.setWorld(world);
        }
    }
}
