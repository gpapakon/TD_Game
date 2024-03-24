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
    
    private int life = 50;
    private int gold_reward = 2;
    public void act()
    {
        // Add your action code here.
        
        moveToNextBlock();
        
    }
    
    private void ensureRotation(int current_i, int current_j){
        Stages stage = (Stages) getWorld();
        int[][] map = stage.map;
        
        
        for (int i = (current_i < map.length ) ? current_i  : current_i + 1    ; i < map.length; i++) {
        
        // If starting from 'current_i', begin at 'current_j'. Otherwise, start at the beginning of the row.
        int startJ = (i  ==  current_i) ? current_j + 1: 0  ;
        
        // Iterate over columns starting from 'startJ' to the end of the current row
        for (int j = startJ; j < map[i].length; j++) {
            // Perform your operation here
            // For example, checking or setting the rotation based on the value of map[i][j]
            
            if ( map[i][j] == 1 ){
                    System.out.println("current_i " + current_i  + " current_j " + current_j  ); 
                 System.out.println("next_i " + i  + " next_j " + j  );   
                 return;
            }
        }
        
        }
    }
    
    
    public void moveToNextBlock(){
        
        Stages stage = (Stages) getWorld();
        int[][] map = stage.map;
        //System.out.println(map[0][0]);
        int i = getY() / 60;
        int j = getX() / 60;
        
        ensureRotation(i,j);
      
        //System.out.println("current_i " + i  + " current_y " + y  );
        //System.out.println("next_i " + next_i  + " next_y " + next_y  );
        
        
        
        move(3);
    }
}
