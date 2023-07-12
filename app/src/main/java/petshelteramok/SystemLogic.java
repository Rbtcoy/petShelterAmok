package petshelteramok;

public class SystemLogic {

    public void initMenu(){
        System.out.println("What would you like to do today? ");
        System.out.println("1. Interact with organic pets");
        System.out.println("2. Interact with robotic pets");
        System.out.println("3. Admit a pet (Add a pet to a list)");
        System.out.println("4. Adopt a pet (Remove a pet from a list)");
        System.out.println("5. Quit");
    }

    public void organicPetMenu(){
        System.out.println("What kind of organic pet would you like to interact with? ");
        System.out.println("1. Organic dogs");
        System.out.println("2. Organic cats");
    }

    public void roboticPetMenu(){
        System.out.println("What kind of robotic pet would you like to interact with? ");
        System.out.println("1. Robotic dogs");
        System.out.println("2. Robotic cats");
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
