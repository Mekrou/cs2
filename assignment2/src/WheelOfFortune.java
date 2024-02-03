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
}