package petshelteramok;

import java.util.HashMap;

public class VirtualPetShelter {

    private boolean shelterLitterClean = true;
    // private String leftAlignFormat = "| %-13s | %-4d | %-4d | %-4d | \n";
    private HashMap<String, OrganicDog> organicDogKennel = new HashMap<>();
    private HashMap<String, OrganicCat> organicCatKennel = new HashMap<>();
    private HashMap<String, RoboticDog> roboticDogKennel = new HashMap<>();
    private HashMap<String, RoboticCat> roboticCatKennel = new HashMap<>();

    // public void getStatus() {
    // // needs to display for all pets in the map
    // System.out.format("+---------------+------+------+------+\n");
    // System.out.format("| Pet Name | Food | Water| Play |\n");
    // System.out.format("+---------------+------+------+------+\n");
    // // go through list of pets and System.out.format(leftAlignFormat, petName,
    // // respective var)
    // for (VirtualPet pet : kennel.values()) {
    // System.out.format(leftAlignFormat, pet.getName(), pet.getFood(),
    // pet.getWater(), pet.getPlay());
    // }
    // System.out.format("+---------------+------+------+------+\n");
    // }
    // TODO: depreciated, neet to create for each pet type

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

    public void playTime(int playerChoice) {
        if (playerChoice == 1) {
            for (OrganicDog pet : organicDogKennel.values()) {
                pet.playPet();
            }
        } else if (playerChoice == 2) {
            for (OrganicCat pet : organicCatKennel.values()) {
                pet.playPet();
            }
        } else if (playerChoice == 3) {
            for (RoboticDog pet : roboticDogKennel.values()) {
                pet.playPet();
            }
        } else if (playerChoice == 4) {
            for (RoboticCat pet : roboticCatKennel.values()) {
                pet.playPet();
            }
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
            pet.walkDog();
        }
        for (RoboticDog pet : roboticDogKennel.values()) {
            pet.walkDog();
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
