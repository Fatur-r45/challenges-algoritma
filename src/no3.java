import java.util.*;

public class no3 {
    public static void main(String[] args) {
        String[] INPUT = {"xc", "dz", "bbb", "dz"};
        String[] QUERY = {"bbb", "ac", "dz"};

        int[] output = countWordsInArray(INPUT, QUERY);

        System.out.println(Arrays.toString(output));
    }

    public static int[] countWordsInArray(String[] INPUT, String[] QUERY) {
        int[] output = new int[QUERY.length];

        for (int i = 0; i < QUERY.length; i++) {
            String queryWord = QUERY[i];
            int count = 0;

            for (String inputWord : INPUT) {
                if (queryWord.equals(inputWord)) {
                    count++;
                }
            }

            output[i] = count;
        }

        return output;
    }
}
