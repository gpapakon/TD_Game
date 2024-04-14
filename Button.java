import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor {
    private String text;
    private boolean isHover = false;

    public Button(String text) {
        this.text = text;
        updateImage();
    }

    public void act() {
        if (Greenfoot.mouseMoved(null)) {
            isHover = Greenfoot.mouseMoved(this);
            updateImage();
        }

        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }

    private void updateImage() {
        
        Color textColor = Color.WHITE;
        
        if (isHover) {
            textColor = new Color(200, 200, 200); // Light gray color
        }
        GreenfootImage image = new GreenfootImage(text, 24, textColor, new Color(0, 0, 0, 0)); // Transparent background
        setImage(image);
    }

    // This method should be overridden to define button's behavior
    protected void onClick() {
    }
}

