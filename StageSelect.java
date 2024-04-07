import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelect extends Actor
{
    /**
     * Act - do whatever the StageSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String image_path;
    Stages stage;
    public StageSelect(String image_path,Stages stage) {
        this.image_path = image_path;
        this.stage = stage;
        
        GreenfootImage image = new GreenfootImage(image_path);
        image.scale(250, 250);
        
        int borderWidth = 4; 
        GreenfootImage borderedImage = new GreenfootImage(image.getWidth() + 2 * borderWidth, image.getHeight() + 2 * borderWidth);
        
        
        borderedImage.setColor(Color.BLACK); 
        borderedImage.fill(); 
        
        borderedImage.drawImage(image, borderWidth, borderWidth);
        
        
        setImage(borderedImage);
    }
    
   public void act()
    {
        // Check for mouse clicks on this object
        if (Greenfoot.mouseClicked(this)) {
            // This is where you create an instance of Stage_1 and set it as the current world.
            // Assuming Stage_1 is a class that extends World.
            
            Greenfoot.setWorld(this.stage);
        }
    }
}
