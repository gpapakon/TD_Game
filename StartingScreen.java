import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class StartingScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreen extends World
{
       
    /**
     * Constructor for objects of class StartingScreen.
     * 
     */
    public StartingScreen()
    {    
        super(840, 600, 1);
        drawMap();
        prepareMenu();
    }
    
    private void prepareMenu() {
        Button selectStageButton = new SelectStageButton();
        Button howToPlayButton = new HowToPlayButton();

        // Adjust positions as needed
        addObject(selectStageButton, getWidth() / 2, getHeight() / 2 - 50);
        addObject(howToPlayButton, getWidth() / 2, getHeight() / 2 + 50);
    }
    
     public void drawMap(){
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                
                String imageName = random.nextBoolean() ? "road.png" : "tower_socket_simple.png";
                ImageActor actor = new ImageActor(imageName);
                
                addObject(actor, 30 + j * 60, 30 + i * 60);
            }
        }
        
        
    }
    
}
