package src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private VehicleInputPanel inputPanel;
    private JTextField txtSearchNum;
    private JButton btnSearch;
    private JTextArea txtAreaDisplay;
    private TrafficService trafficService = new TrafficService();

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
        searchPanel.setBorder(BorderFactory.createTitledBorder("Search & Results"));

        JPanel searchBarRow = new JPanel(new FlowLayout());
        searchBarRow.add(new JLabel("Vehicle Number:"));
        searchBarRow.add(txtSearchNum);
        searchBarRow.add(btnSearch);

        searchPanel.add(searchBarRow, BorderLayout.NORTH);
        searchPanel.add(new JScrollPane(txtAreaDisplay), BorderLayout.CENTER);
        add(searchPanel, BorderLayout.CENTER);

        // Preload vehicles from TrafficApp
        try {
            trafficService.addVehicle(new Vehicle("Rakib", 1, "Dhaka-1111",  "Bus"));
            trafficService.addVehicle(new Vehicle("Rahim", 2, "CTG-2222",    "Truck"));
            trafficService.addVehicle(new Vehicle("Karim", 3, "Sylhet-3333", "Car"));
            trafficService.addVehicle(new Vehicle("Jamal", 4, "Khulna-4444", "Bike"));
        } catch (InvalidDataException e) {
            System.out.println("Preload Error: " + e.getMessage());
        }

        inputPanel.getSubmitButton().addActionListener(e -> {
            try {
                String name = inputPanel.getOwnerNameInput();
                String id   = inputPanel.getVehicleIdInput();
                String num  = inputPanel.getVehicleNumInput();
                String type = inputPanel.getVehicleTypeInput();

                if (name.isEmpty() || id.isEmpty() || num.isEmpty()) {
                    throw new InvalidDataException("All fields must be filled in.");
                }

                if (!id.matches("\\d+")) {
                    throw new InvalidDataException("Vehicle ID must be numeric.");
                }

                Vehicle newVehicle = new Vehicle(name, Integer.parseInt(id), num, type);
                trafficService.addVehicle(newVehicle);

                txtAreaDisplay.setText("SUCCESS: Vehicle registered!\n"
                        + "Owner:  " + name + "\n"
                        + "ID:     " + id   + "\n"
                        + "Number: " + num  + "\n"
                        + "Type:   " + type);

                JOptionPane.showMessageDialog(this,
                        "Vehicle registered successfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                inputPanel.clearForm();

            } catch (InvalidDataException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Registration Error", JOptionPane.WARNING_MESSAGE);
                txtAreaDisplay.setText("ERROR LOG:\n" + ex.getMessage());
            }
        });

        btnSearch.addActionListener(e -> {
            try {
                String num = txtSearchNum.getText().trim();

                if (num.isEmpty()) {
                    throw new InvalidDataException("Please enter a vehicle number.");
                }

                Vehicle found = trafficService.findVehicle(num);

                txtAreaDisplay.setText(
                        "Vehicle Found:\n" +
                                "Name:   " + found.getOwnerName()     + "\n" +
                                "ID:     " + found.getVehicleId()     + "\n" +
                                "Number: " + found.getVehicleNumber() + "\n" +
                                "Type:   " + found.getVehicleType()
                );

                txtSearchNum.setText("");

            } catch (InvalidDataException ex) {
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