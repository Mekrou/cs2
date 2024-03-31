import java.io.FileWriter;

public class TextEditor {
    public static void main(String[] args) {
        TextEditorGUI gui = new TextEditorGUI();
    }

    public void writeFile(String filename, String text) { 
        try {
            FileWriter outStream = new FileWriter(filename);
            outStream.write(text);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
