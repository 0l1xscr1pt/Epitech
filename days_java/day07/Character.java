public abstract class Character implements Movable, Comparable<Character> {
    //attributs
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;
    protected int capacity = 0;

    //getters
    public String getName() { return name; }
    public int getLife() { return life; }
    public int getAgility() { return agility; }
    public int getStrength() { return strength; }
    public int getWit() { return wit; }
    public String getRPGClass() { return RPGClass; }

    //methode
    public void attack(String theString) {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }

    public void moveRight() {
        System.out.println(getName()  + ": moves right");
    }

    public void moveLeft() {
        System.out.println(getName()  + ": moves left");
    }

    public void moveForward() {
        System.out.println(getName()  + ": moves forward");
    }

    public void moveBack() {
        System.out.println(getName()  + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(getName()  + ": unsheathes his weapon.");
    }


    //constructeur
    protected Character(String name, String RPGClass) {
        this.name = name;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.RPGClass = RPGClass;
    }

    protected Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }


    @Override
    public int compareTo(Character character) {
        if(character.getClass() == this.getClass()) {
            if(character.capacity > this.capacity) {
                System.out.println(-1);
                return -1;
            } else if (character.capacity < this.capacity) {
                System.out.println(1);
                return 1;
            } else {
                System.out.println(0);
                return 0;
            }
        } else {
            if((this.capacity % character.capacity) == 0 || (character.capacity % this.capacity) == 0 ) {
                return -1;
            } else {
                return 1;
            }
        }
    }



    public static void main ( String args []) {
        Character merlin = new Mage("Merlin",12);
        Character gandalf = new Mage("Gandalf",12);
        Character mandrake = new Mage("Mandrake",9);
        Character achilles = new Warrior("Achilles",240);
        merlin.compareTo(mandrake); // Should return a positive value
        merlin.compareTo(achilles); // Should return a negative value
        gandalf.compareTo(merlin); // Should return 0
    }
}