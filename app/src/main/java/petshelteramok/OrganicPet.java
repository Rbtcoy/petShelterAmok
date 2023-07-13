package petshelteramok;

public abstract class OrganicPet extends VirtualPet {
    

    public void timePass(){
        food -= randoTwo;
        water -= randoTwo;
        play -= randoTwo;
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
