package Factory;
import java.util.List;

public class Elf {
    protected Toy toy;
    protected List<GiftPaper> papers;
    protected Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toyName) throws NoSuchToyException {
        if (toy == null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }

        try {
            toy = factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException e) {
            throw new NoSuchToyException("I didn't find any " + toyName + ".");
        }

    }


    public boolean pickPapers(int nb) {
        papers = factory.getPapers(nb);
        return true;
    }


    public GiftPaper pack() {
        if(toy == null && papers.isEmpty()) {
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return null;
        }

        if(papers.isEmpty()) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }

        GiftPaper paper = papers.remove(0);
        paper.wrap(toy);
        System.out.println("And another kid will be happy!");
        toy = null;
        return paper;
    }


}
