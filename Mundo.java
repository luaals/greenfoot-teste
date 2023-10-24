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
        addObject(bobEsponja,159,583);
        LulaMolusco lulaMolusco = new LulaMolusco();
        addObject(lulaMolusco,600,591);
        lulaMolusco.setLocation(624,597);
        lulaMolusco.setLocation(728,594);
        lulaMolusco.setLocation(728,594);
        lulaMolusco.setLocation(736,559);
        lulaMolusco.setLocation(732,551);
        glitter glitter = new glitter();
        addObject(glitter,780,180);
        glitter glitter2 = new glitter();
        addObject(glitter2,420,185);
        glitter glitter3 = new glitter();
        addObject(glitter3,60,210);
        glitter3.setLocation(278,102);
        Counter counter = new Counter();
        addObject(counter,278,102);
        glitter2.setLocation(263,103);
        glitter2.setLocation(144,70);
        glitter.setLocation(824,51);
        Counter counter2 = new Counter();
        addObject(counter2,824,51);
        glitter3.setLocation(172,52);
        glitter2.setLocation(138,52);
        glitter2.setLocation(118,59);
        glitter2.setLocation(176,71);
        glitter2.setLocation(156,67);
        glitter2.setLocation(156,67);
        glitter2.setLocation(464,322);
        removeObject(counter);
        glitter.setLocation(548,51);
        glitter3.setLocation(160,55);
        Counter counter3 = new Counter();
        addObject(counter3,160,55);
        lulaMolusco.setLocation(804,465);
        bobEsponja.setLocation(229,431);
        bobEsponja.setLocation(223,405);
        bobEsponja.setLocation(193,622);
        bobEsponja.setLocation(104,464);
        bobEsponja.setLocation(124,467);
        glitter2.setLocation(621,339);
        glitter2.setLocation(460,460);
        lulaMolusco.setLocation(833,543);
        lulaMolusco.setLocation(688,363);
        counter2.setLocation(744,45);
        lulaMolusco.setLocation(761,329);
        lulaMolusco.setLocation(690,409);
        glitter2.setLocation(453,294);
        glitter2.setLocation(453,294);
        counter2.setLocation(144,99);
        glitter3.setLocation(717,114);
        counter3.setLocation(733,90);
        lulaMolusco.setLocation(698,390);
        lulaMolusco.setLocation(688,477);
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
