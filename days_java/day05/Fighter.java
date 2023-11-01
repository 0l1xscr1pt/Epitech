public interface Fighter {
    boolean equip(Weapon weapon);
    boolean attack(Fighter fighter);
    void receiveDamage(int intDamage);
    boolean moveCloseTo(Fighter target);
    void recoverAP();
    String getName();
    int getAp();
    int getHp();
}