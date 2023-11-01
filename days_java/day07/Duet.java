public class Duet {

    public static <T extends Comparable<T>> T min(T value1, T value2) {
        return value1.compareTo(value2) < 0 ? value1 : value2;
    }

    public static <T extends Comparable<T>> T max(T value1, T value2) {
        return value1.compareTo(value2) > 0 ? value1 : value2;
    }


    public static void main(String[] args) {
        Integer intA = 42;
        Integer intB = 17;

        Double doubleA = 3.14;
        Double doubleB = 2.71;

        String strA = "apple";
        String strB = "banana";

        System.out.println("Minimum of intA and intB: " + min(intA, intB));
        System.out.println("Maximum of intA and intB: " + max(intA, intB));

        System.out.println("Minimum of doubleA and doubleB: " + min(doubleA, doubleB));
        System.out.println("Maximum of doubleA and doubleB: " + max(doubleA, doubleB));

        System.out.println("Minimum of strA and strB: " + min(strA, strB));
        System.out.println("Maximum of strA and strB: " + max(strA, strB));
    }
}
