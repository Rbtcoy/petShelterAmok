package petshelteramok;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection = 0;
        String userNameSelect = "";
        String userDescSelect = "";
        String userGreeting = "Greetings and welcome to Pet Shelter Deluxe™ ";
        String userDescription = "Please enter a description for your pet";
        String userGameBridge = "Please allow me to add some pets to the shelter so that your pet won't be lonely";
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
            
            if(userSelection > 5 || userSelection < 1){
                System.out.println(userErrorText);
            }
            else if(userSelection == 5){
                System.out.println(userFarewell);
                game = false;
            }
            else if(userSelection == 1){
                
            }

            maxCareGiver.onTick();
            System.out.println();
        } while (game);
        input.close();
    }

}
