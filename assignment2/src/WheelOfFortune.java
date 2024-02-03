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
                    if (aAsBytes[k] == bAsBytes[j]) {
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
}