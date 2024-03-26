import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public Defenders selected_defender;
    Stages game;
    
    public void act()
    {
        
        showScore();
    }
    
    public void showScore(){
        setImage(new GreenfootImage("Level: "  + game.level +  "\nMoney: "  + game.gold + "\nScore: " + game.score ,50 , Color.BLACK, new Color(0,0,0,0)));
    }
    
    public Menu(){
     
        getImage().scale(240, 200);
        showScore();
    }
}
