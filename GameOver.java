import greenfoot.*; // Import Greenfoot classes


public class GameOver extends Actor {
    public GameOver(int score) {
        // Background dimensions and border thickness
        int width = 400;
        int height = 100;
        int borderThickness = 5; // Adjust the thickness of the border

        // Create an image for the background
        GreenfootImage bg = new GreenfootImage(width, height);
        // Draw semi-transparent black background
        bg.setColor(new Color(0, 0, 0, 128)); // Semi-transparent black
        bg.fill();

        // Draw white border
        bg.setColor(Color.WHITE);
        for(int i = 0; i < borderThickness; i++) {
            bg.drawRect(i, i, width - 1 - i * 2, height - 1 - i * 2);
        }

        // Create an image for the text
        GreenfootImage text = new GreenfootImage(
            "Game Over\nScore: " + score,
            24, // Font size
            Color.WHITE, // Font color
            new Color(0, 0, 0, 0) // Transparent background for text
        );

        // Draw the text image on the background image
        bg.drawImage(text, (width - text.getWidth()) / 2, (height - text.getHeight()) / 2);

        setImage(bg);
    }
}
