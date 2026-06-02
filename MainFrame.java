import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private VehicleInputPanel inputPanel;
    private JTextField txtSearchNum;
    private JButton btnSearch;
    private JTextArea txtAreaDisplay;
    private List<Driver> driverList = new ArrayList<>();

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

        inputPanel.getSubmitButton().addActionListener(e -> {
            try {
                String name = inputPanel.getOwnerNameInput();
                String id   = inputPanel.getVehicleIdInput();
                String num  = inputPanel.getVehicleNumInput();
                String type = inputPanel.getVehicleTypeInput();

                if (name.isEmpty() || id.isEmpty() || num.isEmpty()) {
                    throw new IllegalArgumentException("All fields must be filled in.");
                }

                if (!id.matches("\\d+")) {
                    throw new IllegalArgumentException("Vehicle ID must be numeric.");
                }

                for (Driver d : driverList) {
                    if (d.getVehicleNumber().equalsIgnoreCase(num)) {
                        throw new IllegalStateException("Vehicle '" + num + "' already registered.");
                    }
                }

                Driver newDriver = new Driver(name, Integer.parseInt(id), num, type);
                newDriver.registerVehicle();
                driverList.add(newDriver);

                txtAreaDisplay.setText("SUCCESS: Vehicle registered!\n"
                        + "Owner:  " + name + "\n"
                        + "ID:     " + id   + "\n"
                        + "Number: " + num  + "\n"
                        + "Type:   " + type + "\n"
                        + "Total registered: " + driverList.size());

                JOptionPane.showMessageDialog(this,
                        "Vehicle registered successfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                inputPanel.clearForm();

            } catch (IllegalArgumentException | IllegalStateException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Registration Error", JOptionPane.WARNING_MESSAGE);
                txtAreaDisplay.setText("ERROR LOG:\n" + ex.getMessage());
            }
        });

        btnSearch.addActionListener(e -> {
            try {
                String num = txtSearchNum.getText().trim();

                if (num.isEmpty()) {
                    throw new IllegalArgumentException("Please enter a vehicle number.");
                }

                if (driverList.isEmpty()) {
                    throw new IllegalStateException("No vehicles registered yet.");
                }

                Driver found = null;
                for (Driver d : driverList) {
                    if (d.getVehicleNumber().equalsIgnoreCase(num)) {
                        found = d;
                        break;
                    }
                }

                if (found == null) {
                    throw new IllegalStateException("No vehicle found with number: " + num);
                }

                txtAreaDisplay.setText(
                        "Driver Found:\n" +
                                "Name:   " + found.getName()          + "\n" +
                                "ID:     " + found.getId()            + "\n" +
                                "Number: " + found.getVehicleNumber() + "\n" +
                                "Type:   " + found.getVehicleType()
                );

                txtSearchNum.setText("");

            } catch (IllegalArgumentException | IllegalStateException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Search Error", JOptionPane.ERROR_MESSAGE);
                txtAreaDisplay.setText("ERROR LOG:\n" + ex.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}