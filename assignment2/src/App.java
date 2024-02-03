public class App {
    public static boolean wordContainsString(String A, String B)
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


    public static void main(String[] args) {
        WheelOfFortune wof = new WheelOfFortune();
        // Basic tests
        System.out.println(wordContainsString("hello", "hello")); // true
        System.out.println(wordContainsString("hello", "hell")); // true
        System.out.println(wordContainsString("hello", "ello")); // true
        System.out.println(wordContainsString("hello", "l")); // true

        // Edge cases
        System.out.println(wordContainsString("hello", "")); // true
        System.out.println(wordContainsString("", "hello")); // false
        System.out.println(wordContainsString("", "")); // true

        // Case sensitivity tests
        System.out.println(wordContainsString("Hello", "hello")); // false
        System.out.println(wordContainsString("hello", "Hello")); // false

        // Tests with special characters
        System.out.println(wordContainsString("hello@world", "@")); // true
        System.out.println(wordContainsString("hello world", " world")); // true
        System.out.println(wordContainsString("hello\nworld", "\n")); // true

        // Substring not present
        System.out.println(wordContainsString("hello", "world")); // false
        System.out.println(wordContainsString("abc", "abcd")); // false

        // Partial matches but not complete
        System.out.println(wordContainsString("hello", "hellp")); // false
        System.out.println(wordContainsString("abcdefgh", "defgHI")); // false

        // Repeated characters
        System.out.println(wordContainsString("aaaaa", "aaa")); // true
        System.out.println(wordContainsString("abcabcabc", "abcabc")); // true

        // Numeric and alphanumeric tests
        System.out.println(wordContainsString("123456", "123")); // true
        System.out.println(wordContainsString("abc123", "123")); // true
        System.out.println(wordContainsString("123abc", "abc")); // true

        // Unicode tests
        //System.out.println(wordContainsString("hello😊", "😊")); // true
        System.out.println(wordContainsString("こんにちは", "にち")); // true

        // Long strings
        System.out.println(wordContainsString("a long string with multiple words", "string")); // true
        System.out.println(wordContainsString("the quick brown fox jumps over the lazy dog", "quick brown")); // true

        // Resetting internal state correctly
        System.out.println(wordContainsString("abcdeabcde", "abcde")); // true
    }
}
