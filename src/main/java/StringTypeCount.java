//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10

public class StringTypeCount {
        public static void main(String[] args) {
            String sentence = "I live in Bangladesh";

            int wordCount = countWords(sentence);
            int charCountWithoutSpaces = countCharactersWithoutSpaces(sentence);
            int vowelCount = countVowels(sentence);
            int consonantCount = countConsonants(sentence);

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters without spaces: " + charCountWithoutSpaces);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }

        public static int countWords(String sentence) {
            String[] words = sentence.trim().split("\\s+");
            return words.length;
        }

        public static int countCharactersWithoutSpaces(String sentence) {
            return sentence.replace(" ", "").length();
        }

        public static int countVowels(String sentence) {
            int count = 0;
            String lowercaseSentence = sentence.toLowerCase();
            for (int i = 0; i < lowercaseSentence.length(); i++) {
                char ch = lowercaseSentence.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            return count;
        }

        public static int countConsonants(String sentence) {
            int count = 0;
            String lowercaseSentence = sentence.toLowerCase();
            for (int i = 0; i < lowercaseSentence.length(); i++) {
                char ch = lowercaseSentence.charAt(i);
                if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    count++;
                }
            }
            return count;
        }
}

