import java.util.ArrayList;
import java.util.List;

public class Battalion {
    protected List<Character> theListe = new ArrayList<>();

    public <T extends Character> void add(List<T> liste) {
        for(Character c: liste) {
            theListe.add(c);
        }
    }

    public void display() {
        for(Character c: theListe) {
            System.out.println(c.getName());
        }
    }


    // public static void main ( String args []) {
    //     List<Mage> mages = new ArrayList<>();
    //     mages.add(new Mage("Merlin"));
    //     mages.add(new Mage("Mandrake"));
    //     List<Warrior> warriors = new ArrayList<>();
    //     warriors.add(new Warrior("Spartacus"));
    //     warriors.add(new Warrior("Clovis"));
    //     Battalion battalion = new Battalion();
    //     battalion.add(mages);
    //     battalion.add(warriors);
    //     battalion.display();
    // }
}
