package petshelteramok;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection = 0;
        String userNameSelection = "";
        String userDescSelection = "";
        String userGreeting = "Greetings and welcome to Pet Shelter Deluxe™ ";
        String userPetName = "Please enter a name for your pet";
        String userDescription = "Please enter a description for your pet";
        String userGameBridge = "Please allow me to add some pets to the shelter so that your pet won't be lonely";
        String userFarewell = "Aw well, thanks for playing! Bye!";
        String userErrorText = "Im sorry, I do not understand that choice, please try again...";
        String userAdoptNameConfirm = "What is the name of the pet that you would like to adopt? ";
        String userAdoptConfirm = " will make a great pet for you, have fun!";
        String userTypeSelection = "What kind of pet would you bringing today? \n Type \"1\" for Organic Pet \n Type \"2\" for Robotic Pet";
        String userCatDog = "Is this a cat or dog? Type \"1\" for cat or type \"2\" for dog";
        String userAdmitTextName = "What is the name of the pet you'd like to admit\n";
        String userAdmitTextDescription = "Please give a brief description of the pet\n";
        String userAdmitConfirmPet = " will be plenty welcome here!";
        String userPlayText = "They seem to all take turns, each demanding a different game giving all the lovins your way. It's a good day.";
        String userCleanedLitterBox = "You cleaned the shelter's litter box and the cats all stand and salute";
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
            
            if(userSelection > 9 || userSelection < 1){
                System.out.println(userErrorText);
            }
            else if(userSelection == 9){
                System.out.println(userFarewell);
                game = false;
            }
            else if(userSelection == 1){
                System.out.println(userTypeSelection);
                userSelection = input.nextInt();
                if(userSelection == 1){
                    System.out.println(userCatDog);
                    userSelection = input.nextInt();
                    if(userSelection == 1){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.addOrganicCat(userNameSelection, userDescSelection);
                        System.out.println(userNameSelection+userAdmitConfirmPet);
                    }
                    else if(userSelection == 2){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.addOrganicDog(userNameSelection, userDescSelection);
                        System.out.println(userNameSelection+userAdmitConfirmPet);
                    }
                }
                else if(userSelection == 2){
                    System.out.println(userCatDog);
                    userSelection = input.nextInt();
                    if(userSelection == 1){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.addRoboticCat(userNameSelection, userDescSelection);
                        System.out.println(userNameSelection+userAdmitConfirmPet);
                    }
                    else if(userSelection == 2){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.addRoboticDog(userNameSelection, userDescSelection);
                        System.out.println(userNameSelection+userAdmitConfirmPet);
                    }
                }
                
                }
                else if(userSelection == 2){
                    System.out.println(userTypeSelection);
                userSelection = input.nextInt();
                if(userSelection == 1){
                    System.out.println(userCatDog);
                    userSelection = input.nextInt();
                    if(userSelection == 1){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.removeOrganicCat(userNameSelection);
                        System.out.println(userNameSelection+userAdoptConfirm);
                    }
                    else if(userSelection == 2){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.removeOrganicDog(userNameSelection);
                        System.out.println(userNameSelection+userAdoptConfirm);
                    }
                }
                else if(userSelection == 2){
                    System.out.println(userCatDog);
                    userSelection = input.nextInt();
                    if(userSelection == 1){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.removeRoboticCat(userNameSelection);
                        System.out.println(userNameSelection+userAdoptConfirm);
                    }
                    else if(userSelection == 2){
                        System.out.println(userAdmitTextName);
                        userNameSelection = input.nextLine();
                        System.out.println(userAdmitTextDescription);
                        userDescSelection = input.nextLine();
                        maxCareGiver.removeRoboticDog(userNameSelection);
                        System.out.println(userNameSelection+userAdoptConfirm);
                    }
                }
                }
                else if(userSelection == 3){
                    System.out.println(userPlayText);
                    maxCareGiver.playTime();
                }
                else if(userSelection == 4){

                }
            

            maxCareGiver.onTick();
            System.out.println();
        } while (game);
        input.close();
    }

}
