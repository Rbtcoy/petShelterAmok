package petshelteramok;

public class OrganicCat extends VirtualPet{
    private int food;
    private int water;
    private int play;
    private int healthValue = 10;
    private int happiness = 10;
    private String healthDisplay = "=";
    private String name = "";
    private String description = "";
    
    public int getFood() {
        return food;
    }
    public int getWater() {
        return water;
    }
    public int getPlay() {
        return play;
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
    public OrganicCat(String name, String description) {
        this.name = name;
        this.description = description;
        this.food = 40;
        this.water = 60;
        this.play = 30;
    }
    public void timePass(){
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
