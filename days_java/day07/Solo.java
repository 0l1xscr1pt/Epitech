public class Solo <T> {
    protected T value;

    public T getValue() { return value; }

    public void setValue(T value) {
        this.value = value;
    }

    public Solo(T value) {
        this.value = value;
    }

    // public static void main(String[] args) {
    //     Solo<String> strSolo = new Solo<>("toto");
    //     String strValue = strSolo.getValue();
    //     System.out.println(strValue + "---");
    //     strSolo.setValue("tata");

    //     Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
    //     Integer intValue = intSolo.getValue();
    //     intSolo.setValue(Integer.valueOf(1337));
    //     System.out.println(intValue);
    // }
}
