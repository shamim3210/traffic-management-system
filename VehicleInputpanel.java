import javax.swing.*;
import java.awt.*;

public class VehicleInputPanel extends JPanel {

    private JTextField txtOwnerName;
    private JTextField txtVehicleId;
    private JTextField txtVehicleNum;
    private JComboBox<String> cmbVehicleType;
    private JButton btnSubmit;

    public VehicleInputPanel() {
        setLayout(new GridLayout(5, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        txtOwnerName = new JTextField();
        txtVehicleId = new JTextField();
        txtVehicleNum = new JTextField();

        String[] types = {"Car (BYD)", "Motorcycle", "Truck", "Bus"};
        cmbVehicleType = new JComboBox<>(types);

        btnSubmit = new JButton("Register Vehicle");

        add(new JLabel("Owner Name:")); add(txtOwnerName);
        add(new JLabel("Vehicle ID (Numeric):")); add(txtVehicleId);
        add(new JLabel("Vehicle Number:")); add(txtVehicleNum);
        add(new JLabel("Vehicle Type:")); add(cmbVehicleType);
        add(new JLabel("")); add(btnSubmit);
    }

    public String getOwnerNameInput() { return txtOwnerName.getText().trim(); }
    public String getVehicleIdInput() { return txtVehicleId.getText().trim(); }
    public String getVehicleNumInput() { return txtVehicleNum.getText().trim(); }
    public String getVehicleTypeInput() { return (String) cmbVehicleType.getSelectedItem(); }

    public JButton getSubmitButton() { return btnSubmit; }

    public void clearForm() {
        txtOwnerName.setText("");
        txtVehicleId.setText("");
        txtVehicleNum.setText("");
        cmbVehicleType.setSelectedIndex(0);
    }
}