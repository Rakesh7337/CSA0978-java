public class AlphabetIndexExample {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        str = str.toLowerCase();
        int[] index = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                index[c - 'a'] = i;
            }
        }
        
        for (int i = 0; i < index.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ": " + index[i]);
        }
    }
}