package petshelteramok;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection = 0;
        String userNameSelect = "";
        String userDescSelect = "";
        String userGreeting = "Please enter a name for your pet: ";
        String userDescription = "Please enter a description for your pet";
        String userGameBridge = "Please allow me to add two pets to the shelter so that your pet won't be lonely";
        String userFarewell = "Aw well, thanks for playing! Bye!";
        String userErrorText = "Im sorry, I do not understand that choice, please try again...";
        String userAdoptText = "Please select the pet that is being adopted :D ";
        String userAdoptConfirm = " will make a great pet for you, have fun!";
        String userAdmitTextName = "What is the name of the pet you'd like to admit\n";
        String userAdmitTextDescription = "Please give a brief description of the pet\n";
        String userPlayQ = "Which pet would you like to play with? :";
        String gameOverText = "Having a pet faint caused the shelter to close, please try again!";
        Scanner input = new Scanner(System.in);
        SystemLogic sus = new SystemLogic();
        VirtualPetShelter maxCareGiver = new VirtualPetShelter();
        System.out.println(userGreeting);
        userNameSelect = input.nextLine();
        System.out.println(userDescription);
        userDescSelect = input.nextLine();
        maxCareGiver.addPet(userNameSelect, userDescSelect);
        System.out.println(userGameBridge);
        maxCareGiver.addPet("Cain", "Tough and fearless cat, a natural leader.");
        maxCareGiver.addPet("Abel", "Although they depend on Cain, they are quite a fierce and loving dog");
        do {
            System.out.println();
            maxCareGiver.getStatus();
            System.out.println();
            sus.promptUser();
            userSelection = input.nextInt();
            input.nextLine(); // wow i was frustrated till i used this xD
            if (userSelection == 6) {
                System.out.println(userFarewell);
                game = false;
            } else if (userSelection > 6 || userSelection < 1) {
                System.out.println(userErrorText);
            } else if (userSelection == 1) {
                maxCareGiver.feedingTime();
            } else if (userSelection == 2) {
                maxCareGiver.wateringTime();
            } else if (userSelection == 3) {
                System.out.println(userPlayQ);
                String userChoice = input.nextLine();
                if(maxCareGiver.getKennel().containsKey(userChoice)){
                maxCareGiver.playTime(userChoice);
                } else {
                    System.out.println(userErrorText);
                }
            } else if (userSelection == 4) {
                try {
                    System.out.println(userAdoptText);
                    System.out.println();
                    String petChoice = input.nextLine();
                    if(maxCareGiver.getKennel().containsKey(petChoice)){
                    maxCareGiver.removePet(petChoice);
                    System.out.println(petChoice + userAdoptConfirm);
                    } else{
                        System.out.println(userErrorText);
                    }
                } catch (Exception e) {
                    System.out.println(userErrorText);
                }
            } else if (userSelection == 5) {
                    System.out.print(userAdmitTextName);
                    
                    String petNameChoice = input.nextLine();
                    System.out.print(userAdmitTextDescription);
                    
                    String petDescChoice = input.nextLine();
                    System.out.println(petNameChoice + " will be more than welcome here!");
                    maxCareGiver.addPet(petNameChoice, petDescChoice);

            }
            maxCareGiver.onTick();

            System.out.println();
        } while (game);
        input.close();
    }

}
