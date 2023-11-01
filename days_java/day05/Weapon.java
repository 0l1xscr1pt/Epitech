public abstract class Weapon {
    protected String name; //name of the weapon 
    protected int apcost; //the action point cost to use the weapon
    protected int damage; //the amount of damage dealt by the weapon
    protected boolean melee; //true if the weapon is used for close combat false otherwise

    public String getName() { return name; }
    public int getApcost() { return apcost; }
    public int getDamage() { return damage; }
    public boolean isMelee() { return melee; }

    //You cannot instantiate an abstract class.
    //The constructor should NOT be public.
    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

    public abstract void attack();
}