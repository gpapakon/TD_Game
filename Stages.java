import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{

    /**
     * Constructor for objects of class Stages.
     * 
     */
    public Stages()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
         // Set background to white
            GreenfootImage background = getBackground();
            background.setColor(Color.WHITE);
            background.fill();

               
            // Your existing setup
            //Menu menu = new Menu();
            //addObject(menu,720, 300);
            addObject(new GoldDisplay(), 720, 30);
            addObject(new Spider(),26, 90);
    }
    
    public void drawMap(int[][] map){
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j++){
                if(map[i][j] == 1) {
                    addObject(new Road(), 30 + j * 60, 30 + i * 60 );
                }else{
                    addObject(new TowerSocket(), 30 + j * 60, 30 + i * 60 );
                }
            }
        }
    }
}
