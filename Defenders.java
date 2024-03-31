import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Defenders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defenders extends Actor
{
    /**
     * Act - do whatever the Defenders wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int fireRate;
    public int fireLoad;
    public int damage;
    
    
    public Defenders( int fireRate, int damage, int level){
        
        this.fireRate = fireRate;
        this.damage = damage;
        
    }
    
    public void act()
    {
        enemyDetector();
    }
    
    public Defenders getGlobalDefender(){
        
        Stages stage = (Stages) getWorld();
        
        Defenders def;
        if( this instanceof Ballista  ){
           def = stage.ballista;
        }else if( this instanceof Cannon ){
            def = stage.cannon;
        }else{
            def = stage.catapult;
        }
        
        return def;
                
    }
    
    public void enemyDetector(){
        List<Enemies> enemies = getObjectsInRange(100, Enemies.class);
         fireLoad++;
         
         int interval = 60 / (fireRate / 60);
         
        if( fireLoad % interval == 0  && enemies.size() > 0 ){
            fireLoad = 0;
            
            Enemies firstEnemy = enemies.get(0);
            Projectile projectile = new Projectile(this.getGlobalDefender().damage);
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(firstEnemy.getX(), firstEnemy.getY());
            this.turnTowards(firstEnemy.getX(), firstEnemy.getY());

        }
       
        
    }
    
     public void upgrate(String type){
        
        if( type == "attack" ){
            this.damage += (int) this.damage * 0.1;
        }else{
            this.fireRate += (int) this.fireRate * 0.1;
        }
        
        System.out.println(this);
    }
    
}
