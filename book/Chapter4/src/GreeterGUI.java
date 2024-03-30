import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GreeterGUI extends JFrame implements ActionListener{
    private JLabel prompt;
    private JTextField inField;
    private JTextArea display;
    private JButton goButton;
    private GreeterApp greeter;

    public GreeterGUI() {
        greeter = new GreeterApp();

        setTitle("Greeter");
        setVisible(true);

        prompt = new JLabel("Please type your name here: ");
        inField = new JTextField(10);
        display = new JTextArea(10, 30);
        goButton = new JButton("Click here for a greeting!");
        goButton.addActionListener(this);

        Container contentPane = getContentPane();
        contentPane.add("Center", display);

        JPanel inputPanel = new JPanel();
        inputPanel.add(prompt);
        inputPanel.add(inField);
        inputPanel.add(goButton);
        contentPane.add("South", inputPanel);

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goButton) 
        {
            String name = inField.getText();
            display.append(greeter.greet(name) + "\n");
        }
    }

    public static void main(String[] args) {
        new GreeterGUI();
    }
}
