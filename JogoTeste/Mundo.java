import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Luana Alves
 * @version 0.1 Alpha
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 640, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        BobEsponja bobEsponja = new BobEsponja();
        addObject(bobEsponja,240,453);
        Counter counter = new Counter();
        addObject(counter,145,137);
        Counter2 counter2 = new Counter2();
        addObject(counter2,708,108);
        LulaMolusco lulaMolusco = new LulaMolusco();
        addObject(lulaMolusco,691,410);
    }
    private GreenfootSound bgMusic = new GreenfootSound("munds.wav");
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
}
