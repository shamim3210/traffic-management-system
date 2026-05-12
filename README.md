Traffic Management System <br/>
(Java Swing Based Project) 
Course Code: CSE 282 
Section: 04 
Semester: Spring 2026 
Team Members: 
Shajedul Islam Fahim – 2024100000434 
Md Shamim Ashraf – 2024100000259 
T.M. Shahriyar Kabir – 2024100000026 
Md. Jipel Ahamed Arman – 2024100000233 
Fayez – 2024100000289 
Submitted To: 
Mr. Md Ayon Mia 
Lecturer, 
Southeast University 
Brief Description 
2 
This project is a Traffic Management System built using Java OOP principles and Java Swing 
GUI. The system helps to manage traffic data, register vehicles, monitor traffic flow, and 
generate reports. Exception handling ensures invalid inputs are managed properly. 
Classes Used 
User (Abstract Class) 
• Attributes: name, id 
• Method: displayInfo() 
Vehicle (Subclass of User) 
• Attributes: vehicleNumber, vehicleType 
• Methods: registerVehicle(), searchVehicle() 
Admin (Subclass of User) 
• Methods: manageTraffic(), generateReport() 
TrafficService (Service Layer) 
• Stores vehicle list using ArrayList 
• Methods: addVehicle(), findVehicle(), validateInput() 
• Exception: InvalidDataException 
MainGUI (Swing Class) 
• Panels: Registration, Search, Report 
• Components: JTextField, JButton, JTable, JOptionPane 
• Uses try-catch for error handling 
Methods / Functions 
• registerVehicle() → add new vehicle 
• searchVehicle() → find vehicle 
• generateReport() → show vehicle list 
• validateInput() → check input 
• displayInfo() → show details 
Data (Input / Output) 
Input: 
3 
name, vehicle number, vehicle type 
Output: 
vehicle list, success message, error message 
Exception Handling 
Custom Exception: InvalidDataException 
Example: 
If wrong vehicle number → show error message 
Handled using try-catch 
GUI Design 
• JFrame 
• Panels (Registration, Search, Report) 
• Buttons 
• TextFields 
• JTable 
• JOptionPane 
Reflection 
This project helped us understand OOP concepts and GUI design. 
We faced some challenges in handling traffic data and GUI design but solved them.
