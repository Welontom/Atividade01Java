import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Morte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Morte extends Actor
{   
    
    public void act()
    {
        World world = getWorld();
        MyWorld w = (MyWorld)world;
        int r;
        r = Greenfoot.getRandomNumber(w.v);
        setLocation(getX(),getY()+r);
        remover();
        setRotation(-180);
    }
    public void remover(){
        if(getY() >=599){
            getWorld().removeObject(this);
        }
    }

}
