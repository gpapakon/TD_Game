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
    private int spawn_x;
    private int spawn_y;
    public int map [][];
    private static int basicTowerPrice = 50;
    public int gold_per_second = 5;
    public int game_speed = 1; // in secs
    public int game_timer = 0;
    public int enemies_killed = 0;
    
    public LevelDisplay levelDisplay;
    public ScoreDisplay scoreDisplay;
    public GoldDisplay goldDisplay;
    public HealthDisplay healthDisplay;
    
    public Defenders selected_defender;
    public Ballista ballista = new Ballista();
    public Cannon cannon = new Cannon();
    public Catapult catapult = new Catapult();
    
    public Stages(int spawn_x, int spawn_y)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1);
        setSelectedDefender("Ballista");
        this.spawn_x = spawn_x;
        this.spawn_y = spawn_y;
        
        GreenfootImage background = getBackground();
        background.setColor(Color.WHITE);
        background.fill();
        
        levelDisplay = new LevelDisplay(1);
        addObject(levelDisplay, 725, 25);
        goldDisplay = new GoldDisplay();
        addObject(goldDisplay, 725, 75);
        scoreDisplay = new ScoreDisplay();
        addObject(scoreDisplay, 725, 125);
        healthDisplay = new HealthDisplay();
        addObject(healthDisplay, 720, 555);
        
        GreenfootImage defenderImage = new GreenfootImage("defender.png");   
        
        MenuItemBallista ballista = new MenuItemBallista();
        addObject(ballista, 720, 210); 
        
            
        MenuItemCannon cannon = new MenuItemCannon();
        addObject(cannon, 720, 330); 
        
        MenuItemCatapult catapult = new MenuItemCatapult();
        addObject(catapult, 720, 450); 
        
    }
    
    
    public void setSelectedDefender(String name){
        if( name == "Ballista" ){
            selected_defender = ballista;
        }else if( name == "Catapult" ){
            selected_defender = catapult;
        }else{
             selected_defender = cannon;
        }
        
    }
    
    public void act(){
        
        this.game_timer++;
        if(game_timer >= game_speed * 60 ){
            game_intervals();
            game_timer = 0;
        }
        check_for_levelup();
        addInTowers();
    }
    
    public void check_for_levelup(){
        
       if( enemies_killed >= 10 ){
           enemies_killed -= 10;
           levelDisplay.level ++;
       }
       
    }
    
    
    public void game_intervals(){
        spawn_enemies();
        goldDisplay.addGold(gold_per_second);
    }
    
    
    public void spawn_enemies(){
        
        int randomNumber = (int)(Math.random() * 100);
    
        if (randomNumber < 40) {
            // 0-39: 40% chance to spawn a Spider
            addObject(new Spider(200 + (int)(150 * levelDisplay.level * 0.85), 3), spawn_x, spawn_y);
        } else if (randomNumber < 80) {
            // 40-79: 40% chance to spawn a Bat
            addObject(new Bat(100 + (int)(200 * levelDisplay.level * 0.80), 5), spawn_x, spawn_y);
        } else {
            // 80-99: 20% chance to spawn a Worm
            addObject(new Worm(500 + (int)(100 * levelDisplay.level * 0.75), 2), spawn_x, spawn_y);
        }
    }
    
    
    
    public void addInTowers(){
       
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() instanceof  TowerSocket &&
        goldDisplay.gold >= 50 ){
            
            Defenders def;
            if( selected_defender instanceof Ballista  ){
               def = new Ballista();
            }else if( selected_defender instanceof Cannon ){
                def = new Cannon();
            }else{
                def = new Catapult();
            }
        
        
            addObject(def, ( Greenfoot.getMouseInfo().getX() / 60  )* 60 + 30 ,( Greenfoot.getMouseInfo().getY() / 60   )* 60 +30 );
        
            goldDisplay.gold -= 50;
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
