package petshelteramok;

public class RoboticDog extends VirtualPet{
    private int play = 60;
    private int oilLevel = 60;
    private int healthValue = 10;
    private int randoTen = (int) ((Math.random() * 10)+1);
    private int happiness = 10;
    private String healthDisplay = "=";
    private String name = "";
    private String description = "";
    private boolean isWalked = false;
    private boolean isCageDirty = false;
    

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
    public boolean getWalkedState(){
        return isWalked;
    }

    public void oilRobo(){
        oilLevel += 10;
    }

    public RoboticDog(String name, String description) {
        this.name = name;
        this.description = description;
        this.oilLevel = 60;
    }

    public void timePass(){
        oilLevel -= 10;
        if(!isWalked){
            healthValue--;
            if(randoTen >= 10){
                isCageDirty = true;
            }
            happiness--;
        }
        if(isCageDirty){
            healthValue--;
            happiness--;
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
        happiness+=2;
    }
    public void cleanCage(){
        isCageDirty = false;
    }
}
