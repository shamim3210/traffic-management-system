import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private VehicleInputPanel inputPanel;
    private TrafficService trafficService = new TrafficService();
    private JTextField txtSearchNum;
    private JButton btnSearch;
    private JTextArea txtAreaDisplay;

    public MainFrame() {
        setTitle("Traffic Management System GUI");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputPanel = new VehicleInputPanel();
        add(inputPanel, BorderLayout.NORTH);

        txtSearchNum = new JTextField(15);
        btnSearch = new JButton("Search Vehicle");
        txtAreaDisplay = new JTextArea(6, 30);
        txtAreaDisplay.setEditable(false);

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.setBorder(BorderFactory.createTitledBorder("Search & Error Logs"));

        JPanel searchBarRow = new JPanel(new FlowLayout());
        searchBarRow.add(new JLabel("Vehicle Number:"));
        searchBarRow.add(txtSearchNum);
        searchBarRow.add(btnSearch);

        searchPanel.add(searchBarRow, BorderLayout.NORTH);
        searchPanel.add(new JScrollPane(txtAreaDisplay), BorderLayout.CENTER);

        add(searchPanel, BorderLayout.CENTER);

        btnSearch.addActionListener(e -> {
            String num = txtSearchNum.getText().trim();

            if (num.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a vehicle number to search.", "Input Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                Vehicle v = trafficService.findVehicle(num);

                txtAreaDisplay.setText(String.format(
                        "Owner: %s\nID: %d\nVehicle Number: %s\nVehicle Type: %s",
                        v.getName(), v.getId(), v.getVehicleNumber(), v.getVehicleType()
                ));

                inputPanel.clearForm();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Search Failure",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}