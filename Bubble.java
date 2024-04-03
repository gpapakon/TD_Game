import greenfoot.*;

public class Bubble extends SmoothMover {
    private static final GreenfootImage bubbleImage = new GreenfootImage("bubble.png"); // Assume you have a bubble.png in your images folder
    
    public Bubble() {
        setImage(bubbleImage);
        // Set the initial movement vector to move from left to right
        // Assuming your SmoothMover class has a constructor that accepts a Vector
        // The Vector class is typically used to represent movement direction and speed
        // Here, we are setting it to move horizontally with a speed of '2' units per act cycle
        setMovement(new Vector(0, 2)); // Assuming 0 degrees (right) with a speed of 2
    }
    
    public void act() {
        super.act(); // Call the SmoothMover act method to handle the movement based on the vector
        
        // Check if the bubble has moved off the right side of the world
        // If so, move it back to the left side
        if(getX() > getWorld().getWidth()) {
            setLocation(0, getY());
        }
    }
}
