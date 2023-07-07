package petshelteramok;

public class RoboticCat extends VirtualPet {

    private int play = 60;
    private int oilLevel = 60;
    private int healthValue = 10;
    private int happiness = 10;
    private String healthDisplay = "=";
    private String name;
    private String description;


    public int getPlay() {
        return play;
    }
    public int getOilLevel(){
        return oilLevel;
    }
    public String getHealthDisplay(){
        return healthDisplay;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void reduceHappiness(){
        happiness--;
    }

    public void oilRobo(){
        oilLevel += 10;
    }

    public RoboticCat(String name, String description){
        this.name = name;
        this.description = description;
        this.oilLevel = 60;
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
