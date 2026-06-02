import javax.swing.*;
import java.awt.*;
public class MainFrame extends JFrame {
    private VehicleInputPanel inputPanel;

    public MainFrame() {
        setTitle("Traffic Management System GUI");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputPanel = new VehicleInputPanel();

        add(inputPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}