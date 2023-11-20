import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int f = 300;
    int v = 5;
    int pontos = 0;
    public void act(){
        dificuldade();
        if(Greenfoot.getRandomNumber(250)<1)
            spawnPessoa();
        if(Greenfoot.getRandomNumber(f)<1)
            spawnMorte();
    }
    public void spawnPessoa(){
        addObject(new Pessoa(),Greenfoot.getRandomNumber(800),
        Greenfoot.getRandomNumber(600));
    }
    public void spawnMorte(){
        addObject(new Morte(),Greenfoot.getRandomNumber(800),
        0);
    }
    public void dificuldade(){
        v = pontos/2+2;
    
    } 
    public MyWorld()
    {    
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ambulancia ambulancia = new Ambulancia();
        addObject(ambulancia,139,313);
        Hospital hospital = new Hospital();
        addObject(hospital,910,733);
        hospital.setLocation(77,533);
        ambulancia.setLocation(155,547);
        ambulancia.setRotation(-90);
    }
}
