import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectStageButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectStageButton extends Button {
    public SelectStageButton() {
        super("Select Stage");
    }

    @Override
    protected void onClick() {
        // Switch to stage selection screen
        Greenfoot.setWorld(new StageSelectWorld());
    }
}
