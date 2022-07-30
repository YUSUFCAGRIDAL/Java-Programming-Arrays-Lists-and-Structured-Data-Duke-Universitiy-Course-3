public class WordPlay {
    private Object phrase;

    //Write a method isVowel that has one Char parameter named ch. This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise. You should write a tester method to see if this method works correctly. For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else {
            return false;
        }
    }

    //Write a method isVowel that has one Char parameter named ch. This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise. You should write a tester method to see if this method works correctly. For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.
    Object phrase1 = phrase;

    public String replaceVowels(StringBuilder phrase1, char ch) {
        StringBuilder original = new StringBuilder(phrase1);

        for (int i = 0; i < original.length(); i++) {
            char currChar = original.charAt(i);
            if (isVowel(currChar)) {
                original.setCharAt(i, ch);
            }
        }
        return original.toString();

    }

    /*Write a method emphasize with two parameters, a String named phrase and a character named ch. This method should return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by
     ‘*’ if it is in an odd number location in the string (e.g. the first character has an odd number location but an even index, it is at index 0), or
     ‘+’ if it is in an even number location in the string (e.g. the second character has an even number location but an odd index, it is at index 1).
    For example, the call emphasize(“dna ctgaaactga”, ‘a’) would return the string “dn* ctg+*+ctg+”, and the call emphasize(“Mary Bella Abracadabra”, ‘a’) would return the string “M+ry Bell+ +br*c*d*br+”. Be sure to test this method.
    */
    public String emphasize(String phrase, char ch) {
        StringBuilder emphasize = new StringBuilder(phrase);
        for (int i = 0; i < emphasize.length(); i++) {
            char currChar = emphasize.charAt(i);
            if ((currChar == ch) && (i % 2 == 0)) {
                emphasize.setCharAt(i, '*');
            }
            if ((currChar == ch) && (i % 2 != 0)) {
                emphasize.setCharAt(i, '+');
            }
        }
        return emphasize.toString();
    }

    public void testreplaceVowels (){
        StringBuilder original = new StringBuilder("Hello World");
        String result = replaceVowels(original, '*');
        System.out.println(result);
    }
 public void WordPlay(){
        System.out.println("return value"+ " "+isVowel('F'));
    }

}