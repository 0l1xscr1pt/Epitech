package Factory;
import java.util.ArrayList;
import java.util.List;


public class Factory {

    public List<GiftPaper> getPapers(int n) {
        List<GiftPaper> papers = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }

    public Toy create(String toy) throws NoSuchToyException {
        if (toy == "teddy")
            return new TeddyBear();
        else if (toy == "gameboy")
            return new Gameboy();
        else
            throw new NoSuchToyException("No such toy: " + toy + ".");
    }

    public static void main ( String [] args )throws NoSuchToyException {
        Factory teddy = new Factory() ;
        teddy.create("teddy");
    }
}
