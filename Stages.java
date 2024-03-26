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
    
    public static int level = 1;
    public static int score = 0;
    public static int gold = 50;
    public int map [][];
    private static int basicTowerPrice = 50;
    public int gold_per_second = 5;
    public int game_speed = 1; // in secs
    public int game_timer = 0;
    public Defenders selected_defender;
    
    public Stages()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1);
        this.map = map;
        GreenfootImage background = getBackground();
        background.setColor(Color.WHITE);
        background.fill();
        addObject(new Menu(), 720, 75);
    }
    
    public void act(){
        
        this.game_timer++;
        if(game_timer >= game_speed * 60 ){
            game_intervals();
            game_timer = 0;
        }
        
        addInTowers();
    }
    
    public void game_intervals(){
        this.gold += this.gold_per_second;
    }
    
    
    
    public void addInTowers(){
       
      
       
        if(Greenfoot.mouseClicked(null)){
             System.out.println(Greenfoot.getMouseInfo().getActor());
        }
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() instanceof  TowerSocket  ){
            System.out.println(Greenfoot.getMouseInfo().getActor());
            addObject(new Tower(), ( Greenfoot.getMouseInfo().getX() / 60  )* 60 + 30 ,( Greenfoot.getMouseInfo().getY() / 60   )* 60 +30 );
        }
        
    }
    
    
    
    public void drawMap(int map [][]){
        this.map = map;
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j++){
                if(this.map[i][j] != 0) {
                    addObject(new Road(), 30 + j * 60, 30 + i * 60 );
                }else{
                    addObject(new TowerSocket(), 30 + j * 60, 30 + i * 60 );
                }
            }
        }
    }
    
    
}
