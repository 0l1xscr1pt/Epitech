package chocolate;

public class Mars {
    //attributs
    private int id;
    private static int count = 0;


    //getter
    public int getId() {
        return id;
    }

    public Mars() {
        id = count;
        count++;
    }

}