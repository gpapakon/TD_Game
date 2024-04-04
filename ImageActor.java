import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ImageActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageActor extends Actor
{
    /**
     * Act - do whatever the ImageActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ImageActor(String imageName) {
        setImage(imageName);
         getImage().scale(60, 60);
    }
    public void act()
    {
        // Add your action code here.
    }
}
