import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelDisplay extends GameInfo
{
    private int level;
    
    public LevelDisplay(int initialLevel) {
        super(""); // Call the superclass constructor with an empty string
        this.level = initialLevel;
        updateLevelDisplay(); // Initial display update
    }
    public void updateLevel(int newLevel) {
        this.level = newLevel;
        updateLevelDisplay();
    }
    
    // Specific method to format and update the level display
    public void updateLevelDisplay() {
        String levelText = "Level: " + this.level;
        updateDisplay(levelText); // Use the method from the parent class
    }
    
    /**
     * Act - do whatever the LevelDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
