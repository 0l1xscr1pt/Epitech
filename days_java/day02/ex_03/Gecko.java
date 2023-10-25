public class Gecko {
    private String name;

    public String getName() {
        return name;
    }

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String myName) {
        name = myName;
        System.out.println("Hello " + name + "!");
    }

    // public static void main(String[] args) {
    //     Gecko nico = new Gecko("Nico");
    //     Gecko benjy = new Gecko();
    //     System.out.println(nico.getName());
    //     System.out.println(benjy.getName());
    // }
}