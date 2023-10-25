public class Mars {
    //attributs
    private int id;
    private static int count = 0;

    //getter
    public int getId() {
        return id;
    }

    public Mars() {
        this.id = count;
        count++;
    }

    // public static void main ( String [] args ) {
    //     Mars rocks = new Mars();
    //     Mars lite = new Mars();
    //     Mars snack = new Mars();
    //     Mars other = new Mars();

    //     System.out.println(rocks.getId());
    //     System.out.println(lite.getId());
    //     System.out.println(snack.getId());
    //     System.out.println(snack.getId());
    //     System.out.println(other.getId());
    // }
}