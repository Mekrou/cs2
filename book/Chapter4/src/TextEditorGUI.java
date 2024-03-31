import java.awt.Container;

import javax.swing.*;

public class TextEditorGUI extends JFrame {
    public TextEditorGUI() {
        setTitle("File read/writer");
        setVisible(true);
        buildGUI();
        pack();
    }

    private void buildGUI() {
        JPanel controlsJPanel = new JPanel();
        JLabel prompt = new JLabel("File name: ");
        JTextField inTextField = new JTextField(10);
        JButton readButton = new JButton("ReadFile");
        JButton writeButton = new JButton("WriteFile");
        controlsJPanel.add(prompt);
        controlsJPanel.add(inTextField);
        controlsJPanel.add(readButton);
        controlsJPanel.add(writeButton);
        
        JTextArea display = new JTextArea(10, 15);

        Container contentPane = getContentPane();
        contentPane.add("North", controlsJPanel);
        contentPane.add("Center", display);
    }

    public static void main(String[] args) {
        new TextEditorGUI();
    }
}
