class Shark extends Animal {
    private static boolean frenzy = false;


    protected Shark(String theName) {
        super(theName, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean trueOrFalse) {
        frenzy = trueOrFalse;
    }

    public void status() {
        if (frenzy)
            System.out.println(getName() + " is smelling blood and wants to kill.");
        else
            System.out.println(getName() + " is swimming peacefully.");
    }


    public boolean canEat(Animal theAnimal) {
        if (theAnimal instanceof Shark)
            return false;
        else  
            return true;
    }

    public void eat(Animal theAnimal) {
        if (canEat(theAnimal)) {
            System.out.println(getName() + " ate a " + theAnimal.getType() + " named " + theAnimal.getName() + ".");
            frenzy = false;
        } else
            System.out.println(getName() + ": It's not worth my time.");
    }


    public static void main ( String [] args ) {
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy"); // Yes Willy is a shark here !
        willy.eat(titi);
    }
}