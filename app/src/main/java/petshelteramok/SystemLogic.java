package petshelteramok;

public class SystemLogic {

    // public void promptUser() {
    //     // will adjust these later to actual options
    //     System.out.println("What would you like to do now? \n");
    //     System.out.println("1. Feed them.");
    //     System.out.println("2. Give them water.");
    //     System.out.println("3. Play with a pet");
    //     System.out.println("4. Adopt a pet (remove from menu)");
    //     System.out.println("5. Admit a pet (add a pet to menu)");
    //     System.out.println("6. Quit T~T \n");
    // }
    //depricated, need to adjust for new pets

    public void initMenu(){
        System.out.println("What would you like to do today? ");
        System.out.println("1. Interact with organic pets");
        System.out.println("2. Interact with robotic pets");
        System.out.println("3. Quit");
    }

    public void organicDogMenu(){
        System.out.println("Which option would you like to pick?: ");
        System.out.println("1. Water all organic dogs.");
        System.out.println("2. Walk all organic dogs");
        System.out.println("3. Feed all organic dogs");
        System.out.println("4. Clean organic dog cages");
        System.out.println("5. Play with the organic dogs");
    }

    public void roboticDogMenu(){
        System.out.println("Which option would you like to pick?: ");
        System.out.println("1. Walk all robotic dogs");
        System.out.println("2. Oil all robotic dogs");
        System.out.println("3. Play with all robotic dogs");
        System.out.println("4. Clean the robotic dog cages");
    }

    public void organicCatMenu(){
        System.out.println("Which option would you like to pick?: ");
        System.out.println("1. Water all organic cats");
        System.out.println("2. Feed all organic cats");
        System.out.println("3. Play with all organic cats");
        System.out.println("4. Clean the shelter's litter box");
    }

    public void roboticCatMenu(){
        System.out.println("Which option would you like to pick?: ");
        System.out.println("1. Play with all robotic cats");
        System.out.println("2. Oil all robotic cats");
        System.out.println("3. Clean the shelter's litter box");
    }

}
