import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage_1 extends Stages
{
    //{0,0,0,0,0,0,0,0,0,0},
    //{-1,-1,-1,-1,-1,-1,-1,-1,-1},
    //{1,1,1,1,1,1,1,1,1,1},
    private int map [][] = {
        {6,6,6,6,6,6,6,6,6,2},
        {0,0,0,0,0,0,0,0,0,2},
        {2,4,4,4,4,4,4,4,4,4},
        {2,0,0,0,0,0,0,0,0,0},
        {6,6,6,6,6,6,6,6,6,2},
        {0,0,0,0,0,0,0,0,0,2},
        {2,4,4,4,4,4,4,4,4,4},
        {2,0,0,0,0,0,0,0,0,0},
        {6,6,6,6,6,6,6,6,6,2},
        {0,0,0,0,0,0,0,0,0,0},
       
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
        drawMap(map);
       
        addObject(new Spider(),26, 30 );
     
        
    }
}
