package petshelteramok;

public class RoboticDog extends RoboticPet implements Walkable{
    
    private boolean isWalked;
    private boolean isCageDirty;
    
    public boolean getWalkedState(){
        return isWalked;
    }
    
    public boolean getIsCageDirty(){
        return isCageDirty;
    }
    
    public RoboticDog(String name, String description) {
        this.name = name;
        this.description = description;
        this.oilLevel = 30;
        this.play = 60;
        this.healthValue = 10;
        this.happiness = 10;
        this.healthDisplay = ":D";
        this.isWalked = false;
        this.isCageDirty = false;
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
    public void walkThatAnimal(){
        isWalked = true;
        happiness+=2;
    }
    public void cleanCage(){
        isCageDirty = false;
    }
}
