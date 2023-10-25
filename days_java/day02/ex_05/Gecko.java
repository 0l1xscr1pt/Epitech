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







    //Constructeurs pour afficher les informations
    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    //Constructeurs pour afficher les informations
    public Gecko(String myName) {
        name = myName;
        System.out.println("Hello " + name + "!");
    }

    //Constructeurs pour afficher les informations
    public Gecko(String myName, int myAge) {
        name = myName;
        age = myAge;
        System.out.println("Hello " + name + "!");
    }

    //méthode pour afficher les informations
    public void hello(String myMessage) {
        System.out.println("Hello " + myMessage + ", I'm " + this.name + "!");
    }

    //méthode pour afficher les informations
    public void hello(int myNumber) {
        for (int i = 0; i < myNumber; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
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
    //     Gecko mimi = new Gecko("mimi");
    //     mimi.hello("Titi");
    //     mimi.hello(2);
    // }
}