package petshelteramok;

public abstract class RoboticPet extends VirtualPet{
    protected int oilLevel = 30;
    protected int randoTen = (int) ((Math.random() * 10)+1);


    public int getOilLevel(){
        return oilLevel;
    }

    public void oilRobo(){
        oilLevel += 10;
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
