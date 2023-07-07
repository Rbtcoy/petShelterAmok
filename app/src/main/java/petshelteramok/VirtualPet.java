package petshelteramok;

public abstract class VirtualPet {
    private int food = 60;
    private int water = 60;
    private int play = 60;
    private int healthValue = 10;
    private int happiness = 10;
    private String healthDisplay = "pet is healthy";
    private String name = "";
    private String description = "";
    private int randoFive = (int) (Math.random() * 5);
    private int randoTwo = (int) ((Math.random() * 2)+1);

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public VirtualPet(){
        this.name = "Charley";
        this.description = "He's a dumb dog...";
    }

    public int getWater() {
        return water;
    }

    

    public int getPlay() {
        return play;
    }

    public int getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void feedPet() {
        food += 10;
        water -= randoFive;
        play -= randoFive;
    }

    public void waterPet() {
        food -= randoFive;
        water += 10;
        play -= randoFive;
    }

    public void playPet() {
        food -= randoFive;
        water -= randoFive;
        play += 10;
    }

    public void timePass() {
        food -= randoTwo;
        water -= randoTwo;
        play -= randoTwo;
    }

    
}
