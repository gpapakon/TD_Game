import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldDisplay extends GameInfo
{
    /**
     * Act - do whatever the GoldDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int gold = 0;
    
    public GoldDisplay(){
        super("");
        String levelText = "Gold: " + this.gold;
        super.updateDisplay(levelText); 
    }
    public void act()
    {
        // Add your action code here.
    }
}
