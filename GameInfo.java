import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInfo extends Actor
{
    public int score = 0;
    public int gold = 50;
    
    public GameInfo(String text) {
        updateDisplay(text);
    }
    
     public void updateDisplay(String text) {
        // Define the desired width and height
        int width = 250; // Example width
        int height = 50; // Example height
    
        // Create an image with the specified width and height
        GreenfootImage image = new GreenfootImage(width, height);
    
        // Set the background color (optional, if you want a transparent background, skip this)
        image.setColor(new Color(0, 0, 0, 128)); // Semi-transparent black background
        image.fill(); // Fill the entire image with the background color
    
        // Create a temporary image to get the width of the text
        GreenfootImage tempTextImage = new GreenfootImage(text, 35, Color.WHITE, new Color(0, 0, 0, 0));
    
        // Calculate the position to center the text
        int x = (width - tempTextImage.getWidth()) / 2;
        int y = (height - tempTextImage.getHeight()) / 2;
    
        // Draw the text onto the image
        image.drawImage(tempTextImage, x, y);
    
        // Set the actor's image to the newly created image
        setImage(image);
    }
    
    public void act()
    {
        this.gold++;
    }
}
