package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            boolean isVowel = (character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u' || character == 'A' ||
                    character == 'E' || character == 'I' || character == 'O' ||
                    character == 'U');

            if (isVowel) {
                System.out.println(character + "Vowel");
            } else {
                System.out.println(character + "Consonant");
            }
        } else {
            System.out.println("Wrong alphabet!");
        }
    }
}
