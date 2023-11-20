import greenfoot.*; 

/**
 * Write a description of class Elefante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulancia extends Actor
{
    int pessoas = 0;
    public void act()
    {
        World world = getWorld();
        MyWorld w = (MyWorld)world;
        w.showText("",getX()+50,getY()+50);
        w.showText("Pontos: "+w.pontos,200,50);
        mover();
        w.showText(pessoas+"/2",getX()+50,getY()+50);
        checkColision();

    }
    public void mover(){
        if(Greenfoot.isKeyDown("up")){
            move(3);

        }
        if(Greenfoot.isKeyDown("down")){
            move(-3);

        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up")){
            turn(3);
;
        }
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up")){
            turn(-3);

        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down")){
            turn(-3);

        }
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down")){
            turn(3);
        }
    }
    void checkColision(){
        Actor p = getOneIntersectingObject(Pessoa.class);
        if(isTouching(Pessoa.class) && pessoas<2){
            World world = getWorld();
            MyWorld w = (MyWorld)world;
            getWorld().removeObject(p);
            pessoas++;
            if(w.f>50){
                w.f -= 10;
            }
        }
        if(isTouching(Hospital.class)){
            while(pessoas>0)
            {pessoas--;
            World world = getWorld();
            MyWorld w = (MyWorld)world;
            w.pontos++;
            }
        }
        if(isTouching(Morte.class)){
            getWorld().removeObject(this);
        } 

    }
    
}


