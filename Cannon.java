import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Defenders
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cannon(){
        super(100, 300, 0 );
    }
    
    public void act()
    {
        super.act();
    }
     public void upgrate(String type){
        super.upgrate(type);
    }
    
    public int getDamage(){
        
        Stages stage = (Stages) getWorld();
        return stage.ballista.damage;
    }
}
