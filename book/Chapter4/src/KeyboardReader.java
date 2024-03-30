import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardReader {
    
    private BufferedReader reader;

    public KeyboardReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getKeyboardInput() {
        return readKeyboard();
    }

    public int getKeyboardInteger() {
        String data = readKeyboard();
        return Integer.parseInt(data);
    }

    public double getKeyboardDouble() {
        String data = readKeyboard();
        return Double.parseDouble(data);
    }

    public void prompt(String s) {
        System.out.println(s);
    }

    public void display(String s) {
        System.out.println(s);
    }

    private String readKeyboard() {
        String line = "";
        try {
            line = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }
}