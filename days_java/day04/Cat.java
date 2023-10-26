class Cat extends Animal {
    private static String color;

    public String getColor() {
        return color;
    }

    protected Cat(String theName) {
        super(theName, 4, Type.MAMMAL);
        this.color = "grey";
        System.out.println( getName() + ": MEEEOOWWWW");
    }

    protected Cat(String theName, String theColor) {
        super(theName, 4, Type.MAMMAL);
        this.color = theColor;
        System.out.println(getName() + ": MEEEOOWWWW");
    }

    public void meow() {
        System.out.println(getName() + " the " + color + " kitty is meowing.");
    }


    // public static void main ( String [] args ) {
    //     Cat isidore = new Cat("Isidore", "orange");
    //     System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore . getType() + " . ");
    //     isidore.meow();
    // }
}