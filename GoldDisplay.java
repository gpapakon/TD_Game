import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldDisplay extends Actor
{
    /**
     * Act - do whatever the Gold wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld game;
    public GoldDisplay(){
        setImage(new GreenfootImage("Money: " + game.gold,50 , Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Money: "  + game.gold,50 , Color.BLACK, new Color(0,0,0,0)));
    }
}
