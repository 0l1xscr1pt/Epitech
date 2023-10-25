public class Gecko {
    //attributs
    private String name;
    private int age;
    private int energy = 100;


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

    //methode pour obtenir l'energie
    public int getEnergy() {
        return this.energy;
    }

    //methode pour modifier l'energie
    public void setEnergy(int newEnergy) {
        if (newEnergy < 0)
            this.energy = 0;
        else if (newEnergy > 100)
            this.energy = 100;
        else
            this.energy = newEnergy;
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

    //méthode pour afficher les informations
    public void work() {
        if(this.getEnergy() >= 25) {
            System.out.println("I'm working T.T");
            this.setEnergy(this.getEnergy() - 9 );
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            this.setEnergy(this.getEnergy() + 50 );
        }
    }



    //méthode pour afficher les informations
    public void eat(String myString) {
        if (myString.equalsIgnoreCase("Meat")) {
            this.setEnergy(getEnergy() + 10 );
            System.out.println("Yummy!");
        } else if (myString.equalsIgnoreCase("Vegetable")) {
            this.setEnergy(getEnergy() - 10 );
            System.out.println("Erk!");
        } else {
            System.out.println("I can't eat this!");
        }
    }

    //méthode pour afficher les informations
    public void fraternize(Snake snake) {
        
        //nico puis gaelle I'm going to drink with <otherName>!
    }

    public void fraternize(Gecko gecko) {
        //creation d'un nouveau gecko ?
        this.setEnergy(getEnergy() + 30 ); //est ce que fera pour les deux
        System.out.println("I'm going to drink with " + name + "!");
    }
    //if parameter is a gecko object -> ??ira avec son ami??
    //et ajoute + 30 en energie pour tous les deux
    //tous les deux dirons ?? (starting with the current Gecko)??
    //"I'm going to drink with <otherName>!"

    //si l'un deux n'a pas assez d'énergie doit afficher
    // Sorry <otherName>, I'm too tired to go out tonight. 
    //l'autre affichera "Oh! That's too bad, another time then!"


    //si tous les deux sont trop fatigués, afficherons tous les deux
    //"Not today!"


    public void fraternize(String animalObject) {
        if (animalObject == "Snake" && this.setEnergy(getEnergy()) >= 10) {
            System.out.println("LET'S RUN AWAY!!!");
            this.setEnergy(getEnergy() 0 );
        } else 
            System.out.println("...");
    }
    //si le parametre est un "Snake" et si l'energie du gecko est
    // energie >= 10 -> gecko display "LET'S RUN AWAY!!!" energie tombe à 0
    // energie < 10 -> gecko fait le mort est affiche "..."







    //méthode pour afficher les informations
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


    //main class
    public static void main(String[] args) {
        Gecko nico = new Gecko("Nico");
        Gecko gaelle = new Gecko("Gaelle");
        Snake garance = new Snake("Garance");

        nico.fraternerize(gaelle);
        // gaelle.fraternerize(garance);
        // garance.fraternerize(nico);
    }
}