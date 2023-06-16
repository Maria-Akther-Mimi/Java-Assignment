//16. Encrypt word: ROADTOSDET [when A=F]
//        Output: WTFIYTXIJY

public class WordEncryption {
        public static void main(String[] args) {
            String word = "ROADTOSDET";
            String encryptedWord = encryptWord(word);

            System.out.println("Encrypted word: " + encryptedWord);
        }

        public static String encryptWord(String word) {
            StringBuilder encrypted = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (Character.isLetter(ch)) {
                    // Convert the letter to uppercase for consistency
                    ch = Character.toUpperCase(ch);

                    // Calculate the encrypted letter
                    int encryptedLetter = ((ch - 'A' + 5) % 26) + 'A';

                    // Append the encrypted letter to the result
                    encrypted.append((char) encryptedLetter);
                } else {
                    // Append non-alphabetic characters as is
                    encrypted.append(ch);
                }
            }

            return encrypted.toString();
        }
}
