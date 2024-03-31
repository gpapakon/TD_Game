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
    
    GreenfootImage defenderImage;
    GreenfootImage image; 
    
   public DefenderMenuItem(String defenderName, int upgradeCost1, int upgradeCost2, GreenfootImage defenderImage) {
        this.defenderName = defenderName;
        this.upgradeCost1 = upgradeCost1;
        this.upgradeCost2 = upgradeCost2;
        this.defenderImage = defenderImage;
   
        setImage(createMenuItemImage(false));
    }
    
    
    private GreenfootImage createMenuItemImage( boolean isSelected ) {
        int width = 240; // Adjust based on your needs
        int height = 120; // Adjust based on your needs
        image = new GreenfootImage(width, height);
        
        
        
        
        if( isSelected ){
            Color transparentGreen = new Color(165, 221, 155, 128);
                image.setColor(transparentGreen);
                image.fill();
        }else{
            image.setColor(Color.BLACK);
            image.fill(); 
        }
        
        image.drawImage(defenderImage, 10, 35);

        // Set font for drawing text
        Font font = new Font(300); // Sets the font size
        font = font.deriveFont(20); // Makes the font bold
        image.setFont(font);
        
           // Draw the defender name
        image.setColor(Color.WHITE);
        image.drawString(defenderName, 10, 30); // Adjust text positioning as needed
        
        GreenfootImage coinImage = new GreenfootImage("coin.png"); // Ensure "coin.png" is in your project's images directory
        GreenfootImage damageImage = new GreenfootImage("attack.png");
        GreenfootImage attackspeedImage = new GreenfootImage("attackspeed.png");
        int newWidth = 20; // Set the new width as desired
        int newHeight = 20; // Set the new height as desired
        coinImage.scale(newWidth, newHeight); // Scale the image
        damageImage.scale(newWidth, newHeight);
        attackspeedImage.scale(newWidth, newHeight);
        
        int coinX = 110; // Starting X position for the coin, adjust as needed
        int coinY1 = 50; // Y position for the first upgrade option, adjust as needed
        int coinY2 = 80; // Y position for the second upgrade option, adjust as needed
        int textWidthEstimate = 50; 
       
        int damageImageX = coinX + coinImage.getWidth() + 5 + textWidthEstimate;
        int padding = 5; 
        
        int borderTotalWidth = coinImage.getWidth() + textWidthEstimate + padding * 2 + 27; // Adjust this based on your layout
        int borderHeight = 25; // Adjust the height based on your content size
        
        image.drawRect(coinX - padding, coinY1 - padding, borderTotalWidth, borderHeight);
        image.drawRect(coinX - padding, coinY2 - padding, borderTotalWidth, borderHeight);


        image.drawImage(damageImage, coinX, coinY1);
        image.drawImage(coinImage,  coinX + coinImage.getWidth() + 15, coinY1);
        image.drawString(Integer.toString(upgradeCost1), coinX + coinImage.getWidth()  + 37, 67);
        
        
        image.drawImage(attackspeedImage, coinX, coinY2);
        image.drawImage(coinImage,  coinX + coinImage.getWidth() + 15, coinY2);
        image.drawString(Integer.toString(upgradeCost2), coinX + coinImage.getWidth() + 37, 97);
   
        return image;
    }


    @Override
    public void act() {
        
        
        String className = this.getClass().getName(); 
        Stages stage = (Stages) getWorld();
        boolean isSelected = false;
        String menuItemName = className.replace("MenuItem", ""); 
        String selectedDefenderName = stage.selected_defender.getClass().getName();
        
    
        if( menuItemName.equals(selectedDefenderName )){
          isSelected = true;
        }
        
        
        setImage(createMenuItemImage(isSelected));
               
        if (Greenfoot.mouseClicked(this)) {
            
            int mouseX = Greenfoot.getMouseInfo().getX();
            int mouseY = Greenfoot.getMouseInfo().getY();
            
           
            stage.setSelectedDefender(defenderName);
            System.out.println(mouseX);
            
            if( mouseX >= 700){
                if (mouseY >= getY() - getImage().getHeight()/2 && mouseY < getY() - getImage().getHeight()/2 + 60) {
                    // Handle the first upgrade option click
                    System.out.println("Upgrade 1 selected for " + defenderName);
                    upgrate("attack", defenderName);
                } else if (mouseY >= getY() - getImage().getHeight()/2 + 30 && mouseY < getY() + getImage().getHeight()/2) {
                    // Handle the second upgrade option click
                    System.out.println("Upgrade 2 selected for " + defenderName);
                    upgrate("attack_speed", defenderName);
                }
            }
            
            
        }
    }
    
    public void upgrate(String upgrade, String defender){
        System.out.println(upgrade + " " + defender);
        Stages stage = (Stages) getWorld();
        
        boolean hasMoney = false;
        
        if("attack".equals(upgrade) && stage.goldDisplay.gold >= upgradeCost1) {
            hasMoney = true;
            stage.goldDisplay.gold -= upgradeCost1;
            upgradeCost1 += (int) (upgradeCost1 * 0.2);
 
        } else if ( "attack_speed".equals(upgrade) && stage.goldDisplay.gold >= upgradeCost2 ) {
           
            hasMoney = true;
            stage.goldDisplay.gold -= upgradeCost2;
            upgradeCost2 += (int) (upgradeCost2 * 0.2);  
            
        }
        
        if( !hasMoney ){
            return;
        }
        
        if( defender == "Ballista" ){
            stage.ballista.upgrate(upgrade);
        }else if ( defender == "Cannon" ){
            stage.cannon.upgrate(upgrade);
        }else{
            stage.catapult.upgrate(upgrade);
        }
    }
}
