import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatabaseConnectionDialog extends JDialog {
    private JTextField urlField, usernameField, passwordField;
    private JButton connectButton;

    public DatabaseConnectionDialog(Frame parent) {
        super(parent, "Database Connection", true);
        setSize(300, 200);

        // Create components
        JLabel urlLabel = new JLabel("Database URL:");
        urlField = new JTextField(20);
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        connectButton = new JButton("Connect to Database");

        // Create a panel for components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(urlLabel);
        panel.add(urlField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(connectButton);

        // Add action listener to the connect button
        connectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                urlField.getText();
                usernameField.getText();
                passwordField.getText();

                // Establish a database connection
                // Insert random data into the "Temp" table
                // Close the connection
            }
        });

        // Add the panel to the dialog
        add(panel);

        setLocationRelativeTo(parent);
        setVisible(true);
    }
}

