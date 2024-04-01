import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballista extends Defenders
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public Ballista(){
        super(60,200, 0 );
    }
    
    public void act()
    {
        // Add your action code here.
           super.act();
    }
    
    public void upgrate(String type){
        super.upgrate(type);
    }
    
    public int getDamage(){
        
        Stages stage = (Stages) getWorld();
        return stage.ballista.damage;
    }
    
     @Override
    public void fire(Enemies enemy, int x, int y )
    {
       Projectile projectile = new Arrow(this.getGlobalDefender().damage);
        getWorld().addObject(projectile, x, y);
        projectile.turnTowards(enemy.getX(), enemy.getY());
    }
}
