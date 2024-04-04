import greenfoot.*;

public class Bubble extends SmoothMover {
    private Vector movementVector;
    private int topBound;

    public Bubble(Vector movementVector, int topBound) {
        this.movementVector = movementVector;
        this.topBound = topBound;
        GreenfootImage image = new GreenfootImage("bubble.png");
        image.scale(20, 20); // Adjust size as needed
        setImage(image);
    }
    
    
    @Override
    public void act() {
        //move();
        moveAccordingToVector();
        if (getY() <= topBound) {
            getWorld().removeObject(this);
        }
    }

    private void moveAccordingToVector() {
        setLocation(getX() + movementVector.getX(), getY() + movementVector.getY());
    }
    
    
    
}
