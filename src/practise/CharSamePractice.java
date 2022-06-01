package practise;

import strings.CharactersSame;

public class CharSamePractice {
    public static void main(String[] args) {
        CharactersSame charactersSame = new CharactersSame();
        System.out.println(charactersSame.isAllCharactersSame("aaaa"));
        System.out.println(charactersSame.isAllCharactersSame("aabb"));
        System.out.println(charactersSame.isAllCharactersSame("2222"));

    }
}
