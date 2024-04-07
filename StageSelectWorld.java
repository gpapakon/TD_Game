import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class StageSelectWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelectWorld extends World {
        public StageSelectWorld() {    
        super(840, 600, 1);
        drawMap();
        
        prepareMenu();
    }
    
    private void prepareMenu() {
       
        
        TextActor howToPlay = new TextActor("Select stage", 24, Color.WHITE, new Color(0, 0, 0, 0)); // Transparent background
        addObject(howToPlay, getWidth() / 2, getHeight() / 2 - 75);
       
        Stage_1 stage1 = new Stage_1();
        StageSelect stage_1 = new StageSelect("stage_1.png",stage1 );
        addObject(stage_1, getWidth() / 2 - 150 , getHeight() / 2 + 70);
        
        Stage_2 stage2 = new Stage_2();
        StageSelect stage_2 = new StageSelect("stage_2.png",stage2 );
        addObject(stage_2, getWidth() / 2 + 150 , getHeight() / 2 + 70);
               
         Button startingScreenButton = new StartingScreenButton();
        addObject(startingScreenButton, getWidth() / 2 + 280, getHeight() /  2 + 225);
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