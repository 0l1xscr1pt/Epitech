package planet;

public class Mars {
    //attributs
    private int id;
    private static int count = 0;
    private static String landingSite;


    //getter
    public int getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }



    //constructeur
    public Mars(String theLandingSite) {
        landingSite = theLandingSite;
        id = count;
        count++;
    }

}