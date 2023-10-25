public class Astronaut {
    //attributs
    private int id;
    private static String name;
    private static int snacks = 0;
    private static String destination = null;
    private static int count = 0;

    //getter
    public int getId() { return id; }

    public String getName() { return name; }

    public int getSnacks() { return snacks; }

    public String getDestination() { return destination; }

    public int getCount() { return count;}



    //constructeur
    public Astronaut(String theName) {
        this.name = theName;
        this.id = count;
        count++;
        System.out.println(this.name + " ready for launch!");
    }





    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        snacks++;
        System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
    }

    public void doActions(planet.Mars mars) {
        destination = mars.getLandingSite();
        System.out.println(this.name + ": Started a mission!");
    }

    public void doActions(chocolate.Mars mars) {
        System.out.println(this.name + ":Thanks for this Mars number " + this.id);
        snacks++;
        //System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
    }


    public static void main ( String [] args ) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        planet.Mars titi = new planet.Mars("Hill");
        chocolate.Mars titi2 = new chocolate.Mars();

        mutta.doActions(titi);
        mutta.doActions(titi2);
        hibito.doActions(titi2);
        hibito.doActions();
    }
}