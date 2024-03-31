import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Enemies
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public Spider (int health, int speed){
        super(health, 3, speed);
    }
    public void act()
    {
        // Add your action code here for Spider-specific behavior.
    
        super.act(); // This calls the act method of the superclass, Enemies, to ensure it also executes its actions.
    }
}
