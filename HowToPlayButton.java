import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlayButton extends Button {
    public HowToPlayButton() {
        super("How to Play");
    }

    @Override
    protected void onClick() {
        // Switch to how to play instructions screen
        Greenfoot.setWorld(new HowToPlayWorld());
    }
}
