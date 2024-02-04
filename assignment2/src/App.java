public class App {
    public static void main(String[] args) {
        WheelOfFortune wof = new WheelOfFortune();
        //System.out.println(wof.wordContainsString("test", "test")); doesnt crash
        wof.guessWordWithLetters(new English(), 3, "at");
    }
}
