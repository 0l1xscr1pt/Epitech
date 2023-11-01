public class Pair<T, V> {
    protected T first;
    protected V second;

    public T getFirst() { return first; }
    public V getSecond() { return second; }


    public void display() {
        System.out.println("first: " + getFirst() + ", second: " + getSecond() + ".");
    }

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }


    // public static void main(String[] args) {
    //     Pair<String, Integer> pair = new Pair<>("toto", Integer.valueOf(42));
    //     String first = pair.getFirst();
    //     Integer second = pair.getSecond();
    //     pair.display();
    // }
}
