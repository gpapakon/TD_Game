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
       updateDisplay();
    }
    
    private void updateDisplay(){
        String text = "Gold: " + this.gold;
        super.updateDisplay(text); 
    }
    
    public void act()
    {
        gold++;
        updateDisplay();
        
    }
    
    public void addGold(int gold){
        this.gold += gold;
    }
}
