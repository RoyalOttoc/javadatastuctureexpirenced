package practise;

import strings.CheckAnagrams;

public class CheckAnagramsPractice {
    public static void main(String[] args) {
        CheckAnagrams checkAnagrams = new CheckAnagrams();

        System.out.println(checkAnagrams.isAnagrams("Silent", "Listen"));
        System.out.println(checkAnagrams.isAnagrams("This is a string", "Is this a string"));
        System.out.println(checkAnagrams.isAnagrams("There", "Their"));
    }
}
