public class Ex02 {
    public static String getAngryDog(int nbr) {
        String resultString = "";
        for (int i = 0; i < nbr; i++) {
            resultString += "woof";
        }
        resultString += "\n";
        return resultString;
    }
}