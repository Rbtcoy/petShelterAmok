package petshelteramok;

public abstract class RoboticPet extends VirtualPet{
    protected int play = 60;
    protected int oilLevel = 30;
    protected int healthValue = 10;
    protected int randoTen = (int) ((Math.random() * 10)+1);
    protected int happiness = 10;
    protected String healthDisplay = ":D";
    protected String name;
    protected String description;

    public RoboticPet(){
    }

    public int getPlay() {
        return play;
    }
    public int getOilLevel(){
        return oilLevel;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void oilRobo(){
        oilLevel += 10;
    }
    public String getHealthDisplay(){
        return healthDisplay;
    }
    public void reduceHappiness(){
        happiness--;
    }
    public void timePass(){
        oilLevel -= 10;
        if(happiness < 7){
            healthValue--;
        }
        if(healthValue == 10){
            healthDisplay = ":D";
        }else if(healthValue < 10 && healthValue > 5){
            healthDisplay = ":|";
        }else if(healthValue < 5){
            healthDisplay = ":(";
        }
        
    }
}
