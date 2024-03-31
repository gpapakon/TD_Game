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
    
    private int fireRate;
    private int damage;
    private int level;
    
    public Defenders( int fireRate, int damage, int level){
        
        this.fireRate = fireRate;
        this.damage = damage;
        this.level = level;
    }
    
    public void act()
    {
        enemyDetector();
    }
    
    public void enemyDetector(){
        List<Enemies> enemies = getObjectsInRange(100, Enemies.class);
         fireRate++;
         System.out.println(this);
        if( fireRate > 9 ){
            fireRate = 0;
            
            for(Enemies eachEnemy : enemies ){
                
                Projectile projectile = new Projectile(this.damage);
                getWorld().addObject(projectile, getX(), getY());
                projectile.turnTowards(eachEnemy.getX(), eachEnemy.getY());
            }
            
        }
       
        
    }
    
     public void upgrate(String type){
        //super.upgrate(type);
        this.damage += 10;
        
        System.out.println(this);
    }
    
}
