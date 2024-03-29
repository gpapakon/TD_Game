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
    
    private int fireRate = 0 ;
    public void act()
    {
        // Add your action code here.
        enemyDetector();
    }
    
    public void enemyDetector(){
        List<Enemies> enemies = getObjectsInRange(100, Enemies.class);
         fireRate++;
        if( fireRate > 9 ){
            fireRate = 0;
            
            for(Enemies eachEnemy : enemies ){
                Projectile projectile = new Projectile();
                getWorld().addObject(projectile, getX(), getY());
                projectile.turnTowards(eachEnemy.getX(), eachEnemy.getY());
            }
            
        }
       
        
    }
    
}
