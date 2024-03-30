import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreDisplay extends GameInfo
{
    public int score = 0;
    
    public ScoreDisplay(){
        super("");
       updateDisplay();
    }
    
    private void updateDisplay(){
        String text = "Score: " + this.score;
        super.updateDisplay(text); 
    }
    
    public void act()
    {
        //score++;
        updateDisplay();
    }
}
