import javax.swing.JFrame;

public class SimpleGUI extends JFrame {
    public SimpleGUI(String title) {
        setSize(200, 150);
        setTitle(title);
        setLocation(100, 150);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SimpleGUI("Terraria");
    }
}
