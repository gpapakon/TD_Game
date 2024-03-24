import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int life = 50;
    private int gold_reward = 2;
    public void act()
    {
        // Add your action code here.
        
        moveToNextBlock();
        
    }
    
    public void moveToNextBlock(){
        
        MyWorld myWorld = (MyWorld) getWorld();
        int[][] map = myWorld.map;
        System.out.println(map[0][0]);
        
        move(5);
    }
}
