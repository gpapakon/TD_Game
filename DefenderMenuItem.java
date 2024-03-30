import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DefenderMenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefenderMenuItem extends Actor
{
    private String defenderName;
    private int upgradeCost1;
    private int upgradeCost2;

   public DefenderMenuItem(String defenderName, int upgradeCost1, int upgradeCost2, GreenfootImage defenderImage) {
        this.defenderName = defenderName;
        this.upgradeCost1 = upgradeCost1;
        this.upgradeCost2 = upgradeCost2;

        // Create the menu item image
        GreenfootImage menuItemImage = createMenuItemImage(defenderImage);
        setImage(menuItemImage);
    }
    private GreenfootImage createMenuItemImage(GreenfootImage defenderImage) {
        int width = 300; // Adjust based on your needs
        int height = 120; // Adjust based on your needs
        GreenfootImage image = new GreenfootImage(width, height);

        // Set background color
        image.setColor(Color.BLACK);
        image.fill(); // Fill the background color

        // Draw the defender image
        image.drawImage(defenderImage, 10, 10);

        // Set font for drawing text
        Font font = new Font(300); // Sets the font size
        font = font.deriveFont(20); // Makes the font bold
        image.setFont(font);
        
           // Draw the defender name
        image.setColor(Color.WHITE);
        image.drawString(defenderName, 110, 30); // Adjust text positioning as needed
        
        GreenfootImage coinImage = new GreenfootImage("coin.jpg"); // Ensure "coin.png" is in your project's images directory

        int newWidth = 20; // Set the new width as desired
        int newHeight = 20; // Set the new height as desired
        coinImage.scale(newWidth, newHeight); // Scale the image

        int coinX = 110; // Starting X position for the coin, adjust as needed
        int coinY1 = 50; // Y position for the first upgrade option, adjust as needed
        int coinY2 = 80; // Y position for the second upgrade option, adjust as needed
    
        // Draw the coin image next to each upgrade option text
        image.drawImage(coinImage, coinX, coinY1);
        image.drawImage(coinImage, coinX, coinY2);
    
     

        // Adjust the text position so it doesn't overlap with the coin image
        String upgrade1Text = "Upgrade 1: " + upgradeCost1;
        String upgrade2Text = "Upgrade 2: " + upgradeCost2;
        image.drawString(upgrade1Text, coinX + coinImage.getWidth() + 5, 60); // Adjust text positioning as needed
        image.drawString(upgrade2Text, coinX + coinImage.getWidth() + 5, 90); // Adjust text positioning as needed


        return image;
    }


    @Override
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            int mouseX = Greenfoot.getMouseInfo().getX();
            int mouseY = Greenfoot.getMouseInfo().getY();

            // Adjust these conditions based on the actual layout of your upgrade options
            if (mouseY >= getY() - getImage().getHeight()/2 && mouseY < getY() - getImage().getHeight()/2 + 30) {
                // Handle the first upgrade option click
                System.out.println("Upgrade 1 selected for " + defenderName);
            } else if (mouseY >= getY() - getImage().getHeight()/2 + 30 && mouseY < getY() + getImage().getHeight()/2) {
                // Handle the second upgrade option click
                System.out.println("Upgrade 2 selected for " + defenderName);
            }
        }
    }
}
