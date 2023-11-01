public class Mage extends Character {
    public Mage(String name) {
        super(name, "Mage");
        System.out.println( name + ": May the gods be with me.");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
    }

    @Override
    public void attack(String weapon) {
        if (weapon == "magic" || weapon == "wand") {
            System.out.println(this.name + ": Rrrrrrrrr....");
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back furtively.");
    }

}
