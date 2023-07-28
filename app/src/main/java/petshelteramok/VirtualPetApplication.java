package petshelteramok;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection = 0;
        int userIntSelect;
        String userNameSelection = "";
        String userDescSelection = "";
        String userGreeting = "Greetings and welcome to Pet Shelter Deluxe™ ";
        String userGameBridge = "Please allow me to add some pets to the shelter so that your pet won't be lonely";
        String userFarewell = "Aw well, thanks for playing! Bye!";
        String userErrorText = "Im sorry, I do not understand that choice, please try again...";
        String userTypeSelection = "What kind of pet would you bringing today? \n Type \"1\" for Organic Cat \n Type \"2\" for Organic Dog \n Type \"3\" for Robotic Cat \n Type \"4\" for Robotic Dog \n";
        String userCatDog = "Is this a cat or dog? Type \"1\" for cat or type \"2\" for dog";
        String userPlayText = "They seem to all take turns, each demanding a different game giving all the lovins your way. It's a good day.";
        String userCleanedLitterBox = "You cleaned the shelter's litter box and the cats all stand and salute";
        String userCleanedDogCages = "You cleaned the shelter's dog cages and the dogs stand and salute you";
        String userOilRoboPets = "You oiled all the robotic pets, they show love in a way that only they can";
        String userWaterPets = "You kindly turned on the fountain for the organic pets and they all rejoiced";
        String userFeedPets = "You flip the switch and all the food troughs fill with delicious kibble for all the organic pets";
        Scanner input = new Scanner(System.in);
        SystemLogic sus = new SystemLogic();
        VirtualPetShelter maxCareGiver = new VirtualPetShelter();
        System.out.println(userGreeting);
        System.out.println(userGameBridge);
        maxCareGiver.addOrganicDog("Fido", "Shy but very faithful");
        maxCareGiver.addOrganicCat("FeeFee", "Competitively viable battle cat");
        maxCareGiver.addRoboticDog("Robopup 5000", "Still waiting on planned obsolescence");
        maxCareGiver.addRoboticCat("George", "Is not aware its a robot, is it sleeping or dead?!");
        do {
            System.out.println();
            maxCareGiver.getStatus();
            System.out.println();
            sus.initMenu();
            userSelection = input.nextInt();
            input.nextLine(); // wow i was frustrated till i used this xD

            if (userSelection > 9 || userSelection < 1) {
                System.out.println(userErrorText);
            } else if (userSelection == 9) {
                System.out.println(userFarewell);
                game = false;
            } else if (userSelection == 1) {
                System.out.println(userTypeSelection);
                userIntSelect = input.nextInt();
                maxCareGiver.admitPet(userIntSelect);

            } else if (userSelection == 2) {
                System.out.println(userTypeSelection);
                userSelection = input.nextInt();
                maxCareGiver.adoptPet(userSelection);
                }
             else if (userSelection == 3) {
                System.out.println(userPlayText);
                maxCareGiver.playTime();
            } else if (userSelection == 4) {
                System.out.println(userCleanedLitterBox);
                maxCareGiver.cleanLitterBox();
            } else if (userSelection == 5) {
                System.out.println(userCleanedDogCages);
                maxCareGiver.cleanDogCages();
            } else if (userSelection == 6) {
                System.out.println(userOilRoboPets);
                maxCareGiver.oilRoboPets();
            } else if (userSelection == 7) {
                System.out.println(userWaterPets);
                maxCareGiver.wateringTime();
            } else if (userSelection == 8) {
                System.out.println(userFeedPets);
                maxCareGiver.feedingTime();
            }

            maxCareGiver.onTick();
            System.out.println();
        } while (game);
        input.close();
    }

}
