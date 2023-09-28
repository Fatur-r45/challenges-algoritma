public class no2 {
    public static void main(String[] args) {
        String sentence = "Saya sangat senang mengerjakan soal algoritma";
        String longestWord = findLongestWord(sentence);
        System.out.println(longestWord + ": " + longestWord.length() + " character");
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
