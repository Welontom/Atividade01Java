import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital extends Actor
{
    /**
     * Act - do whatever the Hospital wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    World world = getWorld();
    MyWorld w = (MyWorld)world;
     w.showText("Hospital",getX(),getY()-50);
    }
}
