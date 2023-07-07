package petshelteramok;

public class RoboticCat extends VirtualPet {

    private int play = 60;
    private int oilLevel = 60;
    private String name;
    private String description;


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

    public RoboticCat(String name, String description){
        this.name = name;
        this.description = description;
        this.oilLevel = 60;
    }
}
