import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartingScreenButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreenButton extends Button
{
   public StartingScreenButton() {
        super("Starting Screen");
    }

    @Override
    protected void onClick() {
        // Switch to how to play instructions screen
        Greenfoot.setWorld(new StartingScreen());
    }
}
