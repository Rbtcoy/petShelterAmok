package petshelteramok;

public class OrganicDog  extends OrganicPet implements Walkable{
    private int randoTen = (int) ((Math.random() * 10)+1);
    private boolean isWalked = false;
    private boolean isCageDirty = false;
    
    public boolean getWalkedState(){
        return isWalked;
    }
    public boolean getIsCageDirty(){
        return isCageDirty;
    }
    public OrganicDog(String name, String description) {
        this.name = name;
        this.description = description;
        this.food = 30;
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

    public void walkThatAnimal(){
        isWalked = true;
    }
    public void cleanCage(){
        isCageDirty = false;
    }
}
