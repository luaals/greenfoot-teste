import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BobEsponja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BobEsponja extends Actor
{
    //GreenfootSound palmas = new GreenfootSound("palmas.wav");
    private int sTimer = 0;
    private int speed = 3;
    /**
     * Act - do whatever the BobEsponja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento ();
    }
    
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        else if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
            
            sTimer ++;
            //palmas.play();
            getWorld().addObject(new Diva(), getX() +110, getY() +20);

        }
        else {
            if (!Greenfoot.isKeyDown("f")){
            sTimer = 0;
            }
        }
        
    }
}
