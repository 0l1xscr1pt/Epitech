public abstract class Unit implements Fighter {
    protected String name;
    protected int hp; //health points
    protected int ap; //is the resource used to make an action
    protected Fighter closeTarget;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getHp() { return hp; }

    @Override
    public int getAp() { return ap; }

    //damage = entier représantant le dommage subit par le combattant
    @Override
    public void receiveDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            this.hp = 0;
        }
    }

    //rapproche Unit de la cible

    //s'approche d'une seule cible à la fois

    //si Unit pas prohce de sa cible, appel à cette fonction
    //affichera "Unit's name] is moving closer to [target's name]."
    //renvoi true if Unit s'est rapprochée de la cible else false
    public void setCloseTarget(Fighter target) {
        closeTarget = target;
    }

    public boolean isCloseTo(Fighter target) {
        if (closeTarget.equals(target)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean moveCloseTo(Fighter target) {
        if (this.hp > 0 && !isCloseTo(target) && this.equals(target)) {
            setCloseTarget(target);
            System.out.println(this.name + " se déplace plus près de " + target.name);
            return true;
        }
        return false;
    }

    @Override
    public void recoverAP() {

    }

 







    public static void main(String[] args) {
        // Creating some weapons
        PlasmaRifle rifle = new PlasmaRifle();
        PowerFist fist = new PowerFist();

        // Creating a custom Monster (for demonstration)
        Monster goblin = new Monster("Goblin", 50, 30) {};

        // Display initial stats
        // System.out.println(goblin.getName() + " has " + goblin.getHp() + " HP and " + goblin.getAp() + " AP.");

        // // Trying to equip a weapon to the monster (shouldn't work)
        // goblin.equip(rifle);

        // // Goblin tries to attack without a target (should display a message)
        // goblin.attack(goblin);

        // Moving closer to a target
        goblin.moveCloseTo(goblin); // This should display a message about not being able to move closer to itself

    //     // Creating another Monster as a target
    //     Monster troll = new Monster("Troll", 80, 40) {};

    //     // Display initial stats of Troll
    //     System.out.println(troll.getName() + " has " + troll.getHp() + " HP and " + troll.getAp() + " AP.");

    //     // Goblin moves closer to the Troll
    //     goblin.moveCloseTo(troll);

    //     // Goblin tries to attack the Troll
    //     goblin.attack(troll);

    //     // Checking Troll's HP after the attack
    //     System.out.println(troll.getName() + " now has " + troll.getHp() + " HP.");

    //     // Goblin recovers some AP
    //     goblin.recoverAP();
    //     System.out.println(goblin.getName() + " now has " + goblin.getAp() + " AP.");
    }

}