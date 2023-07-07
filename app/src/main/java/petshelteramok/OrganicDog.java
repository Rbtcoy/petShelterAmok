package petshelteramok;

public class OrganicDog extends VirtualPet{
    private int food;
    private int water;
    private int play;
    private int healthValue = 10;
    private int randoTen = (int) ((Math.random() * 10)+1);
    private int happiness = 10;
    private String healthDisplay = ":D";
    private String name = "";
    private String description = "";
    private boolean isWalked = false;
    private boolean isCageDirty = false;
    
    public int getFood() {
        return food;
    }
    public int getWater() {
        return water;
    }
    public int getPlay() {
        return play;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean getWalkedState(){
        return isWalked;
    }
    public String getHealthDisplay(){
        return healthDisplay;
    }
    public boolean getIsCageDirty(){
        return isCageDirty;
    }
    public OrganicDog(String name, String description) {
        this.name = name;
        this.description = description;
        this.food = 30;
        this.water = 60;
        this.play = 40;
    }
    
    public void timePass(){
        if(!isWalked){
            healthValue--;
            if(randoTen >= 10){
                isCageDirty = true;
            }
            happiness--;
        }
        if(isCageDirty){
            healthValue--;
        }
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
        isWalked = false;
    }

    public void walkDog(){
        isWalked = true;
    }
    public void cleanCage(){
        isCageDirty = false;
    }
}
