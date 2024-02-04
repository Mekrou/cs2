class WheelOfFortune
{
    public WheelOfFortune()
    {

    }

    public boolean wordContainsLetter(String word, char letter)
    {
        char[] asChars = word.toCharArray();
        for (char currLetter : asChars) {
            if (currLetter == letter) {
                return true;
            }
        }
        return false;
    }

    // I'm aware of .contains(), but I wanted to give this a try as a challenge.
    // Was it fun? Mostly...
    public boolean wordContainsString(String A, String B)
    {
        byte[] aAsBytes = A.getBytes();
        byte[] bAsBytes = B.getBytes();
        boolean beganMatch = false;
        short firstOccuranceIndex = -1;
        short lettersFound = 0;

        // Explicit edge cases
        if (B.length() == 0) // empty String
            return true;
        else if (B.length() > A.length()) // substring bigger than target String.
            return false;
        else if (B.length() == 1) { // single letter String
            for (byte b : aAsBytes) {
                if (b == bAsBytes[0])
                    return true;
            }
            return false;
        }

        for (short i = 0; i < A.length(); i++)
        {
            if (beganMatch) {
                short k = (short) (firstOccuranceIndex + 1);
                for (short j = 1; j < B.length() + 1; j++) {
                    if (aAsBytes[k] == bAsBytes[j] && aAsBytes.length < k) {
                        lettersFound++;
                        k++;
                        if (B.length() == lettersFound)
                            return true;
                    }
                    else {
                        beganMatch = false;
                        lettersFound = 0;
                        break;
                    }
                }
            }
            if (aAsBytes[i] == bAsBytes[0]) {
                beganMatch = true;
                lettersFound++;
                firstOccuranceIndex = i;
            }
        }
        return false;
    }

    // This doesn't account for duplicate letters in the input, but it was not
    // listed as a requirement in the assignment description.
    // use 'test' to see what I'm talking about
    public void guessWordWithLetters(English eng, int length, String letters)
    {
        // Find the words that are three letters long
        for (int i = 1; i < eng.words.size(); i++) {
            String currentWord = eng.words.get(i);
            if (currentWord.length() == length) {
                // Does the word contain the correct letters?
                char[] charLetters = letters.toCharArray();
                short lettersMatched = 0;
                for (char charLetter : charLetters) {
                    if (wordContainsLetter(currentWord, charLetter))
                        lettersMatched++;
                }
                if (lettersMatched == letters.length())
                    System.out.println(currentWord);
            }
        }
    }
}