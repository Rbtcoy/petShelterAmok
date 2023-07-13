package petshelteramok;

public abstract class OrganicPet extends VirtualPet {
    protected int food = 40;
    protected int water = 60;
    protected int play = 30;
    protected int healthValue = 10;
    protected int happiness = 10;
    protected String healthDisplay = "";
    protected String name = "";
    protected String description = "";

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
