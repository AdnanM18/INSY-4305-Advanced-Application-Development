import javax.swing.*;

public class ConvertApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConvertFrame cf = new ConvertFrame();
            cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cf.setSize(400, 500); // Set the size of the frame
            cf.setVisible(true);  // Make the frame visible
        });
    }
}
