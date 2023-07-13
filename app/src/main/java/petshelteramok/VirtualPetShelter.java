package petshelteramok;

import java.util.HashMap;

public class VirtualPetShelter {

    private boolean shelterLitterClean = true;
    private String organicDogFormat = "| %-13s | %-4d | %-4d | %-4d | %-4s | %-4b |\n";
    private String roboticDogFormat = "| %-13s | %-4d | %-4d | %-4s | %-4b |\n";
    private String organicCatFormat = "| %-13s | %-4d | %-4d | %-4d | %-4s |\n";
    private String roboticCatFormat = "| %-13s | %-4d | %-4d | %-4s |\n";
    private HashMap<String, OrganicDog> organicDogKennel = new HashMap<>();
    private HashMap<String, OrganicCat> organicCatKennel = new HashMap<>();
    private HashMap<String, RoboticDog> roboticDogKennel = new HashMap<>();
    private HashMap<String, RoboticCat> roboticCatKennel = new HashMap<>();

    public void getStatus() {
    // needs to display for all pets in the map
    // go through list of pets and System.out.format(leftAlignFormat, petName,
    // respective var)
    System.out.format("+------------------+------+------+------+------+---------------+\n");
    System.out.format("| Dog Name         | Food | Water| Play | Health | Cage Dirty? |\n");
    System.out.format("+------------------+------+------+------+------+---------------+\n");
    for (OrganicDog pet : organicDogKennel.values()) {
    System.out.format(organicDogFormat, pet.getName(), pet.getFood(),
    pet.getWater(), pet.getPlay(), pet.getHealthDisplay(), pet.getIsCageDirty());
    }
    System.out.format("+---------------+------+------+------+---------+\n");

    System.out.format("+---------------+------+------+------+---------+\n");
    System.out.format("| Dog Name | Oil | Play | Health | Cage Dirty? |\n");
    System.out.format("+---------------+------+------+------+---------+\n");
    for (RoboticDog pet : roboticDogKennel.values()) {
    System.out.format(roboticDogFormat, pet.getName(), pet.getOilLevel(), pet.getPlay(), pet.getHealthDisplay(), pet.getIsCageDirty());
    }
    System.out.format("+---------------+------+------+------+---------+\n");

    System.out.format("+---------------+------+------+------+------+\n");
    System.out.format("| Cat Name | Food | Water| Play | Health |\n");
    System.out.format("+---------------+------+------+------+------+\n");
    for (OrganicCat pet : organicCatKennel.values()) {
    System.out.format(organicCatFormat, pet.getName(), pet.getFood(),
    pet.getWater(), pet.getPlay(), pet.getHealthDisplay());
    }
    System.out.format("+---------------+------+------+------+------+\n");

    System.out.format("+---------------+------+------+------+\n");
    System.out.format("| Cat Name | Oil | Play | Health |\n");
    System.out.format("+---------------+------+------+------+\n");
    for (RoboticCat pet : roboticCatKennel.values()) {
    System.out.format(roboticCatFormat, pet.getName(), pet.getOilLevel(), pet.getPlay(), pet.getHealthDisplay());
    }
    System.out.format("+---------------+------+------+------+\n");

    System.out.println("The shelter litter box is currently clean: " + shelterLitterClean);
    
    }

    

    public void addOrganicDog(String petName, String petDesc) {
        OrganicDog tempDog = new OrganicDog(petName, petDesc);
        organicDogKennel.put(petName, tempDog);
    }

    public void addRoboticDog(String petName, String petDesc) {
        RoboticDog tempDog = new RoboticDog(petName, petDesc);
        roboticDogKennel.put(petName, tempDog);
    }

    public void addOrganicCat(String petName, String petDesc) {
        OrganicCat tempCat = new OrganicCat(petName, petDesc);
        organicCatKennel.put(petName, tempCat);
    }

    public void addRoboticCat(String petName, String petDesc) {
        RoboticCat tempCat = new RoboticCat(petName, petDesc);
        roboticCatKennel.put(petName, tempCat);
    }

    public void removeOrganicDog(String petName) {
        organicDogKennel.remove(petName);
    }

    public void removeOrganicCat(String petName) {
        organicCatKennel.remove(petName);
    }

    public void removeRoboticDog(String petName) {
        roboticDogKennel.remove(petName);
    }

    public void removeRoboticCat(String petName) {
        roboticCatKennel.remove(petName);
    }

    public void onTick() {
        for (OrganicDog pet : organicDogKennel.values()) {
            pet.timePass();
        }
        for (OrganicCat pet : organicCatKennel.values()) {
            pet.timePass();
        }
        for (RoboticDog pet : roboticDogKennel.values()) {
            pet.timePass();
        }
        for (RoboticCat pet : roboticCatKennel.values()) {
            pet.timePass();
        }
        if(!shelterLitterClean){
            for(OrganicCat pet : organicCatKennel.values()){
                pet.reduceHappiness();
            }
            for(RoboticCat pet : roboticCatKennel.values()){
                pet.reduceHappiness();
            }
        }
    }

    public void feedingTime() {
        for (OrganicDog pet : organicDogKennel.values()) {
            pet.feedPet();
        }
        for (OrganicCat pet : organicCatKennel.values()) {
            pet.feedPet();
        }
    }

    public void wateringTime() {
        for (OrganicDog pet : organicDogKennel.values()) {
            pet.waterPet();
        }
        for (OrganicCat pet : organicCatKennel.values()) {
            pet.waterPet();
        }
    }

    public void playTime() {
        
            for (OrganicDog pet : organicDogKennel.values()) {
                pet.playPet();
            }
        
            for (OrganicCat pet : organicCatKennel.values()) {
                pet.playPet();
            }
        
            for (RoboticDog pet : roboticDogKennel.values()) {
                pet.playPet();
            }
        
            for (RoboticCat pet : roboticCatKennel.values()) {
                pet.playPet();
            }
        
    }

    public HashMap<String, OrganicDog> getOrganicDogKennel() {
        return organicDogKennel;
    }

    public HashMap<String, OrganicCat> getOrganicCatKennel() {
        return organicCatKennel;
    }

    public HashMap<String, RoboticDog> getRoboticDogKennel() {
        return roboticDogKennel;
    }

    public HashMap<String, RoboticCat> getRoboticCatKennel() {
        return roboticCatKennel;
    }

    public void walkDogs() {
        for (OrganicDog pet : organicDogKennel.values()) {
            pet.walkThatAnimal();
        }
        for (RoboticDog pet : roboticDogKennel.values()) {
            pet.walkThatAnimal();
        }

    }

    public void cleanDogCages() {
        for (OrganicDog pet : organicDogKennel.values()) {
            pet.cleanCage();
        }
        for (RoboticDog pet : roboticDogKennel.values()) {
            pet.cleanCage();
        }
    }

    public void oilRoboPets() {
        for (RoboticDog pet : roboticDogKennel.values()) {
            pet.oilRobo();
        }
        for (RoboticCat pet : roboticCatKennel.values()) {
            pet.oilRobo();
        }
    }

    public void cleanLitterBox(){
        shelterLitterClean = true;
    }
}
