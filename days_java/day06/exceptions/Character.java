public abstract class Character implements Movable {
    //attributs
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;

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
}