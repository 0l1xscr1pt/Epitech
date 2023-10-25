public class Gecko {
    //attributs
    private String name;
    private int age;



    //méthode pour obtenir le nom
    public String getName() {
        return name;
    }

    //methode pour modifier le nom
    public void setName(String newName) {
        this.name = newName;
    }


    //methode pour obtenir l'age
    public int getAge() {
        return age;
    }

    //methode pour modifier l'age
    public void setAge(int newAge) {
        this.age = newAge;
    }





    //Méthode pour afficher les informations
    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    //Méthode pour afficher les informations
    public Gecko(String myName) {
        name = myName;
        System.out.println("Hello " + name + "!");
    }

    //Méthode pour afficher les informations
    public Gecko(String myName, int myAge) {
        name = myName;
        age = myAge;
        System.out.println("Hello " + name + "!");
    }

    public void status() {
        switch (age) {
            case 0 :
                System.out.println("Unborn Gecko");
                break;
            case 1 :
            case 2 :
                System.out.println("Baby Gecko");
                break;
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                System.out.println("Adult Gecko");
                break;
            case 11 :
            case 12 :
            case 13 :
                System.out.println("Old Gecko");
                break;
            default :
                System.out.println("Impossible Gecko");
                break;
        }
    }




    //class
    // public static void main(String[] args) {
    //     Gecko nico = new Gecko("Nico", 4);
    //     Gecko benjy = new Gecko();

    //     nico.status();
    //     System.out.println(benjy.getName());
    //     System.out.println(nico.getAge());
    //     System.out.println(benjy.getAge());
    //     benjy.setAge(8);
    //     System.out.println(benjy.getAge());
    // }
}