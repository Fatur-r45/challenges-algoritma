public class no1 {
    public static void main(String[] args) {
        String input = "NEGIE1";
        String result = reverseAlphabet(input);
        System.out.println("Hasil = " + result);
    }   
    public static String reverseAlphabet(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length -2; // Mengabaikan angka di akhir

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    } 
}
