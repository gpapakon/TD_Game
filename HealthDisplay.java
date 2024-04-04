import greenfoot.*; // Use the Greenfoot library

// Health class that extends GameInfo
public class HealthDisplay extends GameInfo {
    private GreenfootImage background;
    private int width = 240; // Width of the health bar
    private int height = 92; // Height of the health bar
    private int game_timer = 0;
    public int health = 100;
    
    public HealthDisplay() {
        super("");
        background = new GreenfootImage(width, height);
        drawBackground();
    }
    
    public void act() {
       
        
        this.game_timer++;
        if(game_timer >= 1 * 60 ){
            animateDots();
             spawnBubble();
            game_timer = 0;
        }
        
        
        
        
    }
    
    // Method to draw the initial background
   public void drawBackground() {
    background.setColor(Color.RED);
    background.fill();
    
    // Add text for current health
    String healthText =  health + " %" ;
   
    Font currentFont = background.getFont();
    Font newFont = currentFont.deriveFont( 25); // Adjust the size as needed
    background.setFont(newFont);

    background.setColor(Color.WHITE); 

    background.drawString(healthText, 90, 50);

    setImage(background);
}
    
    // Method to animate the dots
    private void animateDots() {
        drawBackground(); 
    }
    
   private void spawnBubble() {
        Vector upVector = new Vector(270, 2); 
        int topBound = getY() - height / 2; 
        int minX = getX() - width / 2; 
        int maxX = getX() + width / 2; 
        int bubbleX = Greenfoot.getRandomNumber(maxX - minX) + minX; 
    
        int bubbleY = getY() + height / 2;

        Bubble bubble = new Bubble(upVector, topBound);
        getWorld().addObject(bubble, bubbleX, bubbleY);
    }

}
