import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BobEsponja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LulaMolusco extends Actor
{
    private int speed = 3;
    private int sTimer = 0;
    /**
     * Act - do whatever the BobEsponja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
    public void movimento(){
        
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
         else if (Greenfoot.isKeyDown("p")){
            getWorld().addObject(new fogo(), getX() -100, getY() +30);
        }
        else {
            if (!Greenfoot.isKeyDown("f")&& (sTimer == 0)){
            
            sTimer ++;
            sTimer = 0;
            }
        }
    }
}
