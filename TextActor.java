import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class TextActor extends Actor {
    public TextActor(String text, int fontSize, Color foreground, Color background) {
        GreenfootImage image = new GreenfootImage(text, fontSize, foreground, background);
        setImage(image);
    }
}
