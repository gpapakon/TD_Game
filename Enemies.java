import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private double tick= 0.05; //in seconds
    private int timer = 0;
    
    private int health;
    private int gold_reward;
    private int speed;
    
    public Enemies (int health ,int gold_reward, int speed ){
        this.health = health;
        this.gold_reward = gold_reward;
        this.speed = speed;
        
        
        
    }
    
    public void act()
    {
        // Add your action code here.
        
        timer++;
        
        if( timer > 60 * tick ){
            moveToNextBlock(); 
            timer = 0;
        }
        hitByProjectile();
                 
    }
    
    
    
    
    public void moveToNextBlock(){
        Stages stage = (Stages) getWorld();
        
        int[][] map = stage.map;
        
        int x_offset = 0;
        int y_offset = 0;
        
        
        
        if(getRotation() == 0){
            x_offset = - 25;
            y_offset = 0;
        }else if( getRotation() == 180 ){
             x_offset = +25;
        }else if( getRotation() == 90 ){
             y_offset = - 25;
        }
        
        int i = (getY( ) + y_offset ) / 60;
        int j = (getX( ) + x_offset ) / 60;
        
        
        if( map[i][j] == 6 ){
            setRotation(0);
        }else if( map[i][j] == 2){
            setRotation(90);
        }
        else if( map[i][j] == 4){
            setRotation(180);
        }
        else if( map[i][j] == 8){
            setRotation(270);
        }
        
         move(this.speed);
        
    }
    
    public void hitByProjectile(){
        Stages stage = (Stages) getWorld();
        
        Actor actorProjectile = getOneIntersectingObject(Projectile.class);
        if( actorProjectile != null ){
            Projectile projectile = (Projectile) actorProjectile;
            
            this.health -= projectile.damage;
            getWorld().removeObject(projectile);
        }
        
        if( health < 1){
            getWorld().removeObject(this);
            stage.goldDisplay.addGold(this.gold_reward);
        }
    }
}
