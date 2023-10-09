import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Main Application");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem connectMenuItem = new JMenuItem("Connect to Database");

            connectMenuItem.addActionListener(e -> {
                new DatabaseConnectionDialog(frame);
            });

            fileMenu.add(connectMenuItem);
            menuBar.add(fileMenu);
            frame.setJMenuBar(menuBar);

            frame.setVisible(true);
        });
    }
}
