import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextEditorGUI extends JFrame implements ActionListener {
    private JTextArea display;
    private JTextField inTextField;
    private JButton readButton;
    private JButton writeButton;
    private TextEditor textEditor;

    public TextEditorGUI() {
        setTitle("File read/writer");
        setVisible(true);
        buildGUI();
        pack();

        textEditor = new TextEditor();
    }

    private void buildGUI() {
        JPanel controlsJPanel = new JPanel();
        JLabel prompt = new JLabel("File name: ");
        inTextField = new JTextField(10);
        readButton = new JButton("ReadFile");
        readButton.addActionListener(this);
        writeButton = new JButton("WriteFile");
        writeButton.addActionListener(this);
        controlsJPanel.add(prompt);
        controlsJPanel.add(inTextField);
        controlsJPanel.add(readButton);
        controlsJPanel.add(writeButton);
        
        display = new JTextArea(10, 15);

        Container contentPane = getContentPane();
        contentPane.add("North", controlsJPanel);
        contentPane.add("Center", display);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == writeButton) {
            textEditor.writeFile(inTextField.getText(), display.getText());
        }
    }
}
