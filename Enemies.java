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
    private double tick= 0.5; //in seconds
    private int timer = 0;
    private int life = 50;
    private int gold_reward = 2;
    public void act()
    {
        // Add your action code here.
        
        timer++;
        //moveToNextBlock(); 
       
         
        if(timer >= tick * 60) {
            moveToNextBlock(); 
            timer = 0;
       }
        
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
        int i = (getY( ) ) / 60;
        i = i < 0 ? 0 : i;
        int j = (getX( ) ) / 60;
        j = j < 0 ? 0 : j;
        double bi = getY() / 60.00; // Casting 60 to float ensures that the division is floating-point
        double bj = getX() / 60.00;
        System.out.println("x " + getX() + "y " + getY() );
         //i =(int) Math.round(bi - 0.5);
        //j = (int) Math.round(bj - 0.5);
         System.out.println("i " + i + " j " + j);
        int right = (j + 1 <= 9) ? map[i][j + 1] : 0;
        int left = (j -1 >= 0) ? map[i][j -1] : 0;
        int top = (i-1 >= 0) ? map[i-1][j] : 0;
        int bottom = (i + 1 <= 9) ? map[i+1][j] : 0;
        
        System.out.println("right " + right  );
        System.out.println("left " + left  );
        System.out.println("top " + top  );
        System.out.println("bottom " + bottom  );
        System.out.println("getRotation " + getRotation()  );
        
        if( getRotation() == 0 || getRotation() == 180 ){
            if( bottom == 1){
                setRotation(90);
            }else if( top == 1 ){
                setRotation(270);
            }
        }else if( getRotation() == 90 || getRotation() == 270 ){
            if( left == 1){
                setRotation(180);
            }else if( right == 1 ){
                setRotation(0);
            }
        }
         move(3);
        
        
        
        
        
    }
}
