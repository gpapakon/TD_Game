import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class HowToPlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlayWorld extends World {
    public HowToPlayWorld() {    
        super(840, 600, 1);
        drawMap();
        // Add your instructions here
        prepareMenu();
    }
    
    private void prepareMenu() {
       
        
        TextActor howToPlay = new TextActor("How to Play", 24, Color.WHITE, new Color(0, 0, 0, 0)); // Transparent background
        addObject(howToPlay, getWidth() / 2, getHeight() / 2 - 75);
       
        String howToPlayText = "You are the last line of defense.\n Do not let the enemies pass throught.\n Every second it passes enemies are getting spawned.\n You need to kill them using defenders, each defender costs 50 gold. \n You are getting gold as time passes or when you kill enemies. \n Every time you kill 10 enemies the level increases \n and so does the strength of the enemies. ";
        TextActor instructionsText = new TextActor(howToPlayText, 24, Color.WHITE, new Color(0, 0, 0, 0)); // Transparent background
        addObject(instructionsText, getWidth() / 2, getHeight() / 2 + 50);
        
        Button startingScreenButton = new StartingScreenButton();
        addObject(startingScreenButton, getWidth() / 2 + 280, getHeight() /  2 + 175);
        
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
