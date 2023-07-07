package petshelteramok;

public class OrganicCat extends VirtualPet{
    private int food;
    private int water;
    private int play;
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
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public OrganicCat(String name, String description) {
        this.name = name;
        this.description = description;
        this.food = 40;
        this.water = 60;
        this.play = 30;
    }
}
