public class Animal {
    //protected enum
    //attributes
    protected enum Type {
        MAMMAL,
        FISH,
        BIRD
    }
    private static String name;
    private static int legs;
    private static Type type;
    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;


    //getter 
    public String getName() { return name; }
    public int getLegs() { return legs; }
    public String getType() { return type.name().toLowerCase(); }

    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }


    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals; 
    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish; 
    }


    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds; 
    }



    //setter
    //methode pour modifier le nom
    public void setName(String newName) { name = newName; }
    // public void setType(Type newType) { type = newType; }
    //Be careful, the getter for type doesn’t return the enum value directly. 


    //protected constructor 
    protected Animal(String theName, int theLegs, Type theType) {
        this.name = theName;
        this.type = theType;
        this.legs = theLegs;
        this.numberOfAnimals++;
        if (theType.name() == "MAMMAL")
            numberOfMammals++;
        else if(theType.name() == "FISH")
            numberOfFish++;
        else if(theType.name() == "BIRD")
            numberOfBirds++;

        System.out.println("My name is " + getName() + " and I am a " + getType() + "!");
    }

    // public static void main ( String [] args ) {
    //     Animal isidore = new Animal("Isidore", 4, Animal.Type.BIRD);
    //     Animal test = new Animal("Isidore", 4, Animal.Type.BIRD);
    //     isidore.getNumberOfBirds();
    //     System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
    // }
}