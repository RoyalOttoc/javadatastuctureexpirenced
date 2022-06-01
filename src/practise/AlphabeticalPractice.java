package practise;

import strings.Alphabetical;

public class AlphabeticalPractice {
    public static void main(String[] args) {
        Alphabetical alphabetical = new Alphabetical();
        System.out.println(alphabetical.isAlphabetical("abc"));
        System.out.println(alphabetical.isAlphabetical("xyzabc"));
        System.out.println(alphabetical.isAlphabetical("abcxyz"));
    }
//    Check if a string is alphabetical order or not

}
