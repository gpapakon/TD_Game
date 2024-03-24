import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage_1 extends Stages
{
    public int map [][] = {
        {0,0,0,0,0,0,0,0,0,0},
        {1,1,1,1,1,1,1,0,0,0},
        {0,0,0,0,0,0,1,0,0,0},
        {0,0,0,0,0,0,1,0,0,0},
        {0,1,1,1,1,1,1,0,0,0},
        {0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,0,0,0,0,0,0},
        {0,1,1,1,1,1,1,1,1,0},
        {0,0,0,0,0,0,0,0,1,0},
    };
    
    
    /**
     * Constructor for objects of class Stage_1.
     * 
     */
    public Stage_1()
    {
       super();
        //Menu menu = new Menu();
        //addObject(menu,720, 300 );
        addObject(new GoldDisplay(), 720, 30);
        addObject(new Spider(),26, 90 );
        drawMap(this.map);
         
        
    }
}
