import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    int map [][] = {
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
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        Level1();
       
    
    }
    
    public void act(){
         addInTowers();
    }
    
    private void Level1(){
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j++){
                if(map[i][j] == 1) {
                    addObject(new Road(), 30 + j * 60, 30 + i * 60 );
                }
            }
        }
        Menu menu = new Menu();
        addObject(menu,720, 300 );
    }
    
    public void addInTowers(){
       
        if(Greenfoot.mouseClicked(null)){
             System.out.println(Greenfoot.getMouseInfo().getActor());
        }
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null ){
            addObject(new Tower(), ( Greenfoot.getMouseInfo().getX() / 60  )* 60 + 30 ,( Greenfoot.getMouseInfo().getY() / 60   )* 60 +30 );
        }
    }
    
   
}
