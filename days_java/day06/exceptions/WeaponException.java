public class WeaponException extends Exception {
    //dans attaque faire les conditions, si une des conditions 
    //est fausse throw le wappon exception 
    //savoir quelle est l'erreur

    @Override
    public void attack(String weapon) {
        // if (weapon == "magic" || weapon == "wand") {
        //     System.out.println(this.name + ": Rrrrrrrrr....");
        //     System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        // }
    }
    

    //dedicated to weapons error management.
    public WeaponException() {
        //attack method called with empty string
        System.out.println(getName() + ": I refuse to fight with my bare hands.");

        //not fit the caracter
        System.out.println(getName() + ": A " + getWeapon() + "?? What should I do with this?!");
            //for warrior
        System.out.println(getName() + ": I don't need this stupid " + getWeapon() + "! Don't misjudge my powers!");
            //for mage
    }
    //attack method throw a WeaponException with appropriate message in case of errors



    public tryToAttack() {
        
    }

    //implement tryToAttack method 
    //-> call attack method
    //-> catch the exception
    //-> print the message



    public static void main ( String [] args ) {
        Character warrior = new Warrior ( " Jean - Luc " ) ;
        Character mage = new Mage ( " Robert " ) ;
        warrior . tryToAttack ( " screwdriver " ) ;
        mage . tryToAttack ( " hammer " ) ;
        warrior . tryToAttack ( " hammer " ) ;
        try {
            mage . attack ( " " ) ;
        }
        catch ( WeaponException e ) {
            System . out . println ( e . getMessage () ) ;
        }
    }
}
