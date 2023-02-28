/**
 * The following is for the GUI for booking AutoRickshaw as well as Selling and Purchasing Electric Scooters.
 *
 * @author (22015636 Aayush Man Tuladhar)
 * @version (1.0)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class TransportGUI implements ActionListener
{
    //Declaring Instance variable for Jframe
    JFrame f;
    //Declaring Instance variable for JPanel
    JPanel LP,RP1,RP2;
    //Declaring Instance variable for JLabel
    JLabel title1,title2 ,l1,VehicleID,VehicleID2,VehicleName,VehicleWeight,VehicleColor,VehicleSpeed,EngineDisplacement,Torque,FueltankCapacity,GroundClearance,ChargedAmount,noOfSeats,BookedDate,l2,l3,eVehicleID,eVehicleID2,eVehicleID3,eVehicleName,eVehicleWeight,eVehicleColor,eVehicleSpeed,Batterycapacity,Brand,Mileage,ChargingTime,Range,Price,Price2;
    //Declaring Instance variable for JTextField
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14;
    //Declaring Instance variable for JButton
    JButton Auto,Elec,Exit,add1,Book,Auto_Display,Auto_Clear,add2,Scooter_Display,Scooter_Clear,Purchase,Sell;
    //Declaring Instance variable for JComboBox
    JComboBox<String> cb1,cb2,cb3;
    //Declaring Instance variable for Color
    Color LC,RC1,RC2;
    //Creating a constructor for the GUI
    String Day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String Month[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
    String Year[] = {"2022","2023","2024"};
    
    //Creating a Array list from vehicle class to store the objects created while adding the objects
    ArrayList<Vehicle> Vehicle = new ArrayList<Vehicle>();
    
    //Creating a constructor for running the GUI
    public TransportGUI()
    {
        //Creating new frame named TransportGUI
        f = new JFrame("Transport GUI");
        
        //Creating all the Panel for the GUI
        LP = new JPanel();
        RP1 = new JPanel();
        RP2 = new JPanel();
        
        //Creating background colors
        LC = new Color(255, 208, 0);
        RC1 = new Color(255, 255, 255);
        RC2 = new Color(255, 255, 255);
        
        /*/Creating all the elements for the Autorickshaw Panel
         * Creating all the labels for the rihgt panel for AutoRicksahw*/
        title1 = new JLabel("AutoRickshaw");
        VehicleID = new JLabel("Vehicle ID:");
        VehicleName = new JLabel("Vehicle Name:");
        VehicleWeight = new JLabel("Vehicle Weight:");
        VehicleColor = new JLabel("Vehicle Color:");
        VehicleSpeed = new JLabel("Vehicle Speed:");
        EngineDisplacement = new JLabel("Engine Displacement:");
        Torque = new JLabel("Torque:");
        FueltankCapacity = new JLabel("Fuel tank Capacity:");
        GroundClearance = new JLabel("Ground Clearance:");
        l1 = new JLabel("For Booking:");
        VehicleID2 = new JLabel("Vehicle ID:");
        ChargedAmount = new JLabel("Charged Amount:");
        noOfSeats = new JLabel("No. of Seats:");
        BookedDate = new JLabel("Booked Date:");
        
        //Creating all the Text Fields for AutoRickshaw Panel
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t11 = new JTextField();
        t12 = new JTextField();
        
        //Creating all the button on the AutoRickshaw Panel
        add1 = new JButton("+Add");
        add1.setBackground(LC);
        Book = new JButton("Book");
        Book.setBackground(LC);
        Auto_Display = new JButton("Display");
        Auto_Display.setBackground(LC);
        Auto_Clear = new JButton("Clear");
        Auto_Clear.setBackground(LC);
        
        //Creating combox for the AutoRickshaw Panel for selecting the the date to Book
        cb1 = new JComboBox<String>(Day);
        cb1.setBackground(LC);
        cb2 = new JComboBox<String>(Month);
        cb2.setBackground(LC);
        cb3 = new JComboBox<String>(Year);
        cb3.setBackground(LC);
        
        //Creating all the elements for the Electric Scooter Panel
        title2 = new JLabel("Electric-Scooter");
        eVehicleID = new JLabel("Vehicle ID:");
        eVehicleName = new JLabel("Vehicle Name:");
        eVehicleWeight = new JLabel("Vehicle Weight:");
        eVehicleColor = new JLabel("Vehicle Color:");
        eVehicleSpeed = new JLabel("Vehicle Speed:");
        Batterycapacity = new JLabel("Battery Capacity:");
        l2 = new JLabel("For Purchase");
        eVehicleID2 = new JLabel("Vehicle ID:");
        Brand = new JLabel("Brand:");
        ChargingTime = new JLabel("Charging Time:");
        Range = new JLabel("Range:");
        Mileage = new JLabel("Mileage:");
        Price = new JLabel("Price:");
        l3 = new JLabel("For Selling");
        eVehicleID3 = new JLabel("Vehicle ID:");
        Price2 = new JLabel("Price:");
        
        //Creating all the Text Field for Electric Scooter Panel
        et1 = new JTextField();
        et2 = new JTextField();
        et3 = new JTextField();
        et4 = new JTextField();
        et5 = new JTextField();
        et6 = new JTextField();
        et7 = new JTextField();
        et8 = new JTextField();
        et9 = new JTextField();
        et10 = new JTextField();
        et11 = new JTextField();
        et12 = new JTextField();
        et13 = new JTextField();
        et14 = new JTextField();
        
        //Creating all the Buttons for Electric Scooter Panel
        add2 = new JButton("+Add");
        add2.setBackground(LC);
        Purchase = new JButton("Buy");
        Purchase.setBackground(LC);
        Sell = new JButton("Sell");
        Sell.setBackground(LC);
        Scooter_Display = new JButton("Display");
        Scooter_Display.setBackground(LC);
        Scooter_Clear = new JButton("Clear");
        Scooter_Clear.setBackground(LC);
       
        
        //Creating buttons for the left Panel of the GUI
        Auto = new JButton("AutoRickshaw");
        Auto.setBackground(RC1);
        Elec = new JButton("Electric-Scooter");
        Elec.setBackground(RC1);
        Exit = new JButton("Exit");
        Exit.setBackground(RC1);
        
        
        //Putting all the elements in the right place for the AutoRickshaw
        title1.setBounds(300,15,200,45);
        title1.setFont(new Font("San-Serif",Font.BOLD,20));
        VehicleID.setBounds(120,70,180,40);
        VehicleName.setBounds(100,110,180,40);
        VehicleWeight.setBounds(95,150,180,40);
        VehicleColor.setBounds(100,190,180,40);
        VehicleSpeed.setBounds(95,230,180,40);
        EngineDisplacement.setBounds(62,270,180,40);
        Torque.setBounds(135,310,180,40);
        FueltankCapacity.setBounds(80,350,180,40);
        GroundClearance.setBounds(80,390,180,40);
        l1.setBounds(60,450,180,40);
        l1.setFont(new Font("San-Serif",Font.BOLD,15));
        VehicleID2.setBounds(110,490,180,40);
        ChargedAmount.setBounds(76,530,180,40);
        noOfSeats.setBounds(315,490,180,40);
        BookedDate.setBounds(310,530,180,40);
        
        //Putting the Text Fields int he right place
        t1.setBounds(200,80,200,20);
        t2.setBounds(200,120,200,20);
        t3.setBounds(200,160,200,20);
        t4.setBounds(200,200,200,20);
        t5.setBounds(200,240,200,20);
        t6.setBounds(200,280,200,20);
        t7.setBounds(200,320,200,20);
        t8.setBounds(200,360,200,20);
        t9.setBounds(200,400,200,20);
        t10.setBounds(180,500,100,20);
        t11.setBounds(180,540,100,20);
        t12.setBounds(395,500,100,20);
        add1.setBounds(440,400,80,20);
        cb1.setBounds(395,540,40,20);
        cb2.setBounds(435,540,90,20);
        cb3.setBounds(525,540,70,20);
        Book.setBounds(90,600,80,20);
        Auto_Display.setBounds(500,600,80,20);
        Auto_Clear.setBounds(590,600,80,20);
        
        //Putting all the elements in the right place for the Electric-Scooter
        title2.setBounds(300,15,200,45);
        title2.setFont(new Font("San-Serif",Font.BOLD,20));
        eVehicleID.setBounds(120,70,180,40);
        eVehicleName.setBounds(100,110,180,40);
        eVehicleWeight.setBounds(95,150,180,40);
        eVehicleColor.setBounds(100,190,180,40);
        eVehicleSpeed.setBounds(95,230,180,40);
        Batterycapacity.setBounds(90,270,180,40);
        et1.setBounds(200,80,200,20);
        et2.setBounds(200,120,200,20);
        et3.setBounds(200,160,200,20);
        et4.setBounds(200,200,200,20);
        et5.setBounds(200,240,200,20);
        et6.setBounds(200,280,200,20);
        add2.setBounds(440,280,80,20);
        l2.setBounds(60,340,200,40);
        l2.setFont(new Font("San-Serif",Font.BOLD,15));
        eVehicleID2.setBounds(90,380,180,40);
        Brand.setBounds(110,420,180,40);
        Price.setBounds(295,380,180,40);
        Range.setBounds(290,420,180,40);   
        ChargingTime.setBounds(460,380,180,40);
        Mileage.setBounds(495,420,180,40);
        l3.setBounds(60,495,200,40);
        l3.setFont(new Font("San-Serif",Font.BOLD,15));
        eVehicleID3.setBounds(90,530,180,40);
        Price2.setBounds(115,560,180,40);
        Scooter_Display.setBounds(500,600,80,20);
        et7.setBounds(155,390,100,20);
        et8.setBounds(155,430,100,20);
        et9.setBounds(335,390,100,20);
        et10.setBounds(335,430,100,20);
        et11.setBounds(555,390,100,20);
        et12.setBounds(555,430,100,20);
        et13.setBounds(155,540,100,20);
        et14.setBounds(155,570,100,20);
        Purchase.setBounds(80,465,80,20);
        Sell.setBounds(80,600,80,20);
        Scooter_Clear.setBounds(590,600,80,20);
        
        //Setting up the background color and it's position
        LP.setBackground(LC);
        LP.setBounds(0,0,250,800);
        
        //Setting up the background color and it's position
        RP1.setBackground(RC1);
        RP1.setBounds(250,0,950,800);
        
        //Setting up the background color and it's position
        RP2.setBackground(RC2);
        RP2.setBounds(250,0,950,800);
        
        //Setting up the button on the left Panel
        Auto.setBounds(50,50,160,30);
        Elec.setBounds(50,100,160,30);
        Exit.setBounds(60,570,120,30);
        
        //Adding ActionListener to the Buttons
        Elec.addActionListener(this);
        Auto.addActionListener(this);
        Exit.addActionListener(this);
        Auto_Clear.addActionListener(this);
        Scooter_Clear.addActionListener(this);
        add1.addActionListener(this);
        Book.addActionListener(this);
        add2.addActionListener(this);
        Purchase.addActionListener(this);
        Sell.addActionListener(this);
        Auto_Display.addActionListener(this);
        Scooter_Display.addActionListener(this);
        
        //Calling the frame for be visible
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1000,720);
        //when the frame appears it puts it in the middle of the screen
        f.setLocationRelativeTo(null);
        //Adding the the Panels to the frame
        f.add(LP);
        f.add(RP1);
        f.add(RP2);
        //Adding all the elements to the AutoRickshaw Panel
        RP1.setLayout(null);
        RP1.add(title1);
        RP1.add(VehicleID);
        RP1.add(VehicleName);
        RP1.add(VehicleWeight);
        RP1.add(VehicleColor);
        RP1.add(VehicleSpeed);
        RP1.add(EngineDisplacement);
        RP1.add(Torque);
        RP1.add(FueltankCapacity);
        RP1.add(GroundClearance);
        RP1.add(l1);
        RP1.add(VehicleID2);
        RP1.add(ChargedAmount);
        RP1.add(noOfSeats);
        RP1.add(BookedDate);
        RP1.add(t1);
        RP1.add(t2);
        RP1.add(t3);
        RP1.add(t4);
        RP1.add(t5);
        RP1.add(t6);
        RP1.add(t7);
        RP1.add(t8);
        RP1.add(t9);
        RP1.add(t10);
        RP1.add(t11);
        RP1.add(t12);
        RP1.add(add1);
        RP1.add(cb1);
        RP1.add(cb2);
        RP1.add(cb3);
        RP1.add(Auto_Display);
        RP1.add(Auto_Clear);
        RP1.add(Book);
        //Adding all the elements to the Electric-Scooter Panel
        RP2.setLayout(null);
        RP2.add(title2);
        RP2.add(eVehicleID);
        RP2.add(eVehicleName);
        RP2.add(eVehicleWeight);
        RP2.add(eVehicleColor);
        RP2.add(eVehicleSpeed);
        RP2.add(Batterycapacity);
        RP2.add(et1);
        RP2.add(et2);
        RP2.add(et3);
        RP2.add(et4);
        RP2.add(et5);
        RP2.add(et6);
        RP2.add(add2);
        RP2.add(l2);
        RP2.add(eVehicleID2);
        RP2.add(Brand);
        RP2.add(Price);
        RP2.add(Range);
        RP2.add(Mileage);
        RP2.add(ChargingTime);
        RP2.add(et7);
        RP2.add(et8);
        RP2.add(et9);
        RP2.add(et10);
        RP2.add(et11);
        RP2.add(et12);
        RP2.add(et13);
        RP2.add(et14);
        RP2.add(l3);
        RP2.add(Purchase);
        RP2.add(eVehicleID3);
        RP2.add(Price2);
        RP2.add(Sell);
        RP2.add(Scooter_Display);
        RP2.add(Scooter_Clear);
        //Adding all the elements to the left Panel
        LP.setLayout(null);
        LP.add(Auto);
        LP.add(Elec);
        LP.add(Exit);
    }
    //method to check the repeatition of value and adding the value in the array list
    public void Auto_Checker()
    {
        //Creating all the variables and getting all the Values for the TextField related to the adding of the AutoRickshaw 
        int VehicleID = Integer.parseInt(t1.getText());
        String VehicleName = t2.getText();
        String VehicleWeight = t3.getText();
        String VehicleColor = t4.getText();
        String VehicleSpeed = t5.getText();
        int EngineDisplacement = Integer.parseInt(t6.getText());
        String Torque = t7.getText();
        int FuelTankCapacity = Integer.parseInt(t8.getText());
        String GroundClearance = t9.getText();
        boolean added = false;
        //Creating a AutoRicksahw object named auto
        AutoRickshaw auto = new AutoRickshaw(VehicleID ,VehicleName ,VehicleColor,VehicleSpeed,VehicleWeight,EngineDisplacement,Torque,FuelTankCapacity,GroundClearance);
        //Using For loop for checking the repeatition of the values entered in the Text Field
        for(Vehicle x : Vehicle)
        {
            if(x instanceof AutoRickshaw == true && x.getVehicleID()==VehicleID ) 
            {
                added = true;
            }
        }
        //Displaying the appropriate messages
        if(added == true)
        {   
            JOptionPane.showMessageDialog(f,"Your AutoRickshaw has already been added");
        }
        else
        {
            Vehicle.add(auto);
            JOptionPane.showMessageDialog(f,"Your AutoRickshaw has been added");  
        }
    }
    //method to check the repeatition of value and adding the value in the array list
    public void Scooter_Checker()
    {
        //Creating all the variables and getting all the Values for the TextField related to the adding of the Electric Scooter
        int VehicleID = Integer.parseInt(et1.getText());
        String VehicleName = et2.getText();
        String VehicleWeight = et3.getText();
        String VehicleColor = et4.getText();
        String VehicleSpeed = et5.getText();
        int BatteryCapacity = Integer.parseInt(et6.getText());
        boolean added = false;
        //Creating a obj with Electric Scooter
        ElectricScooter scooter = new ElectricScooter(VehicleID ,VehicleName ,VehicleColor,VehicleSpeed,VehicleWeight,BatteryCapacity);
        //Using for loop to check the repeatition of the values entered in the Text Fields
        for(Vehicle x : Vehicle)
        {
            if(x instanceof ElectricScooter == true && x.getVehicleID()==VehicleID)
            {
                added = true;
            }
        }
        //Displaying the appropriate messages
        if(added == true)
        {   
            JOptionPane.showMessageDialog(f,"Your Electric Scooter has already been added");
        }
        else
        {
            Vehicle.add(scooter);
            JOptionPane.showMessageDialog(f,"Your Electric Scooter has been added");  
        }
    }
    //Creating a method to clear the Text Fields in the AutoRickshaw Panel
    public void Auto_Clearer()
    {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        cb1.setSelectedItem("1");
        cb2.setSelectedItem("January");
        cb3.setSelectedItem("2022");
    }
    //Creating a method to clear the Text Fields in the Electric Scooter Panel
    public void Scooter_Clearer()
    {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        et7.setText("");
        et8.setText("");
        et9.setText("");
        et10.setText("");
        et11.setText("");
        et12.setText("");
        et13.setText("");
        et14.setText("");
    }
    //Creating a method to check the Booking of the AutoRickshaw
    public void Book_Checker()
    {
        //Getting all the values from the TextFields
        int  VehicleID = Integer.parseInt(t10.getText());
        int  NoOfSeats= Integer.parseInt(t11.getText());
        int  ChargeAmount= Integer.parseInt(t12.getText());
        String Date = cb1.getSelectedItem()+" "+cb2.getSelectedItem()+" "+cb3.getSelectedItem();
        boolean available = true;
        boolean exist = true;
        //Using For Loop to check the different situations when different events occur
        for(Vehicle x:Vehicle)
        {
            //Checks the existence of the object and if it is an instance of AutoRicksahw
            if( x.getVehicleID()==VehicleID && x instanceof AutoRickshaw == true)
            {
                //Downcasting the object using the class Autorickshaw
                AutoRickshaw auto = (AutoRickshaw)x;
                //calling the isBooked from the AutoRickshaw class to varify the booking
                //and Displaying the appropriate messages
                if(auto.getisBooked() == false)
                {
                    auto.Book(Date, ChargeAmount,NoOfSeats);
                    JOptionPane.showMessageDialog(f,"Your AutoRickshaw has been Booked.");
                    available = true;    
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"Your AutoRickshaw has already been Booked.");
                    available = true; 
                }
                break;
            }
            //To check the existence of the object in the ArrayList
            else if(x.getVehicleID()!=VehicleID|| x instanceof AutoRickshaw == false)
            {
                exist = false;
                available = false;
            }
        }
        //Dispalying the approppriate messages
        if(exist == false && available == false)
        {
            JOptionPane.showMessageDialog(f,"Your AutoRickshaw dosen't Exist!!");
        }
        else if(Vehicle.isEmpty())
        {
            JOptionPane.showMessageDialog(f,"Your AutoRickshaw dosen't Exist!!");
        }
    }
    //Creating a method to check the Purchasing of the Electric Scooter
    public void Purchase_Checker()
    {
        //Getting all the values from the TextFields
        int  VehicleID = Integer.parseInt(et7.getText());
        String Brand = et8.getText();
        int  Price = Integer.parseInt(et9.getText());
        String ChargingTime = et10.getText();
        String Mileage = et11.getText();
        int  Range = Integer.parseInt(et12.getText());
        boolean available = true;
        boolean exist = true;
        //Using For Loop to check the different situations when different events occur
        for(Vehicle x:Vehicle)
        {
            //Checks the existence of the object and if it is an instance of Electric Scooter
            if( x.getVehicleID()==VehicleID && x instanceof ElectricScooter == true)
            {
                //Downcasting the object using the class Electric Scooter
                ElectricScooter scooter = (ElectricScooter)x;
                //calling the hasPurchased from the Electric Scooter class to varify the booking
                //and Displaying the appropriate messages
                if(scooter.gethasPurchased() == false)
                {
                    scooter.Purchase(Brand,Price,ChargingTime,Mileage,Range); 
                    JOptionPane.showMessageDialog(f,"Your Electric Scooter has been Purchased.");
                    available = true;
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"Your Electric Scooter has already been Purchased.");
                    available = true;
                }
                break;
            }
            //To check the existence of the object in the ArrayList
            else if(x.getVehicleID()!=VehicleID|| x instanceof ElectricScooter == false)
            {
                exist=false;
                available = false;
            }
        }
        //Dispalying the approppriate messages
        if(exist==false && available == false)
        {
            JOptionPane.showMessageDialog(f,"Your Electric Scooter doesn't exist!!");
        }
        else if(Vehicle.isEmpty())
        {
           JOptionPane.showMessageDialog(f,"Your Electric Scooter doesn't exist!!");
        }
    }  
    //Creating a method to check the sales of the Electric scooter
    public void Sold_Checker()
    {
        int  VehicleID = Integer.parseInt(et13.getText());
        int  Price = Integer.parseInt(et14.getText());
        boolean available = true;
        boolean exist = true;
        //Using For Loop to check the different situations when different events occur
        for(Vehicle x:Vehicle)
        {
            //Checks the existence of the object and if it is an instance of Electric Scooter
            if( x.getVehicleID()==VehicleID )
            {
                if(x instanceof ElectricScooter == true )
                {
                    //Downcasting the object using the class Electric Scooter
                    ElectricScooter scooter = (ElectricScooter)x;
                    //calling the hasSold & hasPurchased from the Electric Scooter class to varify the booking
                    //and Displaying the appropriate messages
                    if (scooter.gethasSold()==false && scooter.gethasPurchased() == true)
                    {
                        JOptionPane.showMessageDialog(f,"Your Electric Scooter has been Sold.");
                        scooter.sell(Price);
                        available = true;
                    }
                    else if(scooter.gethasPurchased() == false && scooter.gethasSold()==false)
                    {
                        JOptionPane.showMessageDialog(f,"Your Electric Scooter needs to be Purchased First");
                        available = true;
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(f,"Your Electric Scooter has already been Sold.");
                        available = true;
                    }
                }
                break;
            }
            //To check the existence of the object in the ArrayList
            else if(x.getVehicleID()!=VehicleID|| x instanceof ElectricScooter == false)
            {
                exist=false;
                available = false;
            }
        }
        //Dispalying the approppriate messages
        if(exist==false && available == false)
        {
            JOptionPane.showMessageDialog(f,"Your Electric Scooter doesn't exist!!");
        }
        else if(Vehicle.isEmpty())
        {
            JOptionPane.showMessageDialog(f,"Your Electric Scooter doesn't exist!!");
        }
    }
    //Adding functionality to the Buttons
    public void actionPerformed(ActionEvent e)
    {
        //adding functionality to the add Button
        if(e.getSource() == add1)
        {
            //using try catch the catch the exceptions
            try
            {
                //checking if the Text Fields are Empty
                if(t1.getText().trim().isEmpty()||t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||t5.getText().trim().isEmpty()||t6.getText().trim().isEmpty()||t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty()||t9.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"The Text Fields are Empty!!");
                }
                else
                {
                    //calling the Auto_Checker to check the values
                    Auto_Checker();
                }
            }
            //Catching differnt types of Errors and Displaying appropriate messages
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Enter Numbers only in Vehicle ID, Engine Displacement & Fuel Tank Capacity!!"); 
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Re-enter the values again!!"); 
            }
        }
        //adding functionality to another add Button
        if(e.getSource() == add2)
        {
            //using try catch the catch the exceptions
            try
            {
                //checking if the Text Fields are Empty
                if(et1.getText().trim().isEmpty()||et2.getText().trim().isEmpty()||et3.getText().trim().isEmpty()||et4.getText().trim().isEmpty()||et5.getText().trim().isEmpty()||et6.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"The Text Fields are Empty!!");
                }
                else
                {
                    //calling the Scooter_Checker to check the values
                    Scooter_Checker();
                }
            }
            //Catching differnt types of Errors and Displaying appropriate messages
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Enter Numbers only in Vehicle ID & Battery Capacity!!"); 
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Re-enter the values again!!"); 
            }
        }
        if(e.getSource() == Book)
        {
            try
            {
                if(t10.getText().trim().isEmpty()||t11.getText().trim().isEmpty()||t12.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"The Text Fields are Empty!!");
                }
                else
                {
                    Book_Checker();
                }
            }
            //Catching differnt types of Errors and Displaying appropriate messages
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Enter Numbers only in Vehicle ID, No. of Seats & Amount!!"); 
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Re-enter the values again!!"); 
            }
        }
        if(e.getSource() == Purchase)
        {
             try
            {
                if(et7.getText().trim().isEmpty()||et8.getText().trim().isEmpty()||et9.getText().trim().isEmpty()||et10.getText().trim().isEmpty()||et11.getText().trim().isEmpty()||et12.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"The Text Fields are Empty!!");
                }
                else
                {
                    Purchase_Checker();
                }
            }
            //Catching differnt types of Errors and Displaying appropriate messages
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Enter Numbers only in Vehicle ID, Price & Range!!"); 
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Re-enter the values again!!"); 
            }
        }
        if(e.getSource() == Sell)
        {
             try
            {
                if(et13.getText().trim().isEmpty()||et14.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(f,"The Text Fields are Empty!!");
                }
                else
                {
                    Sold_Checker();
                }
            }
            //Catching differnt types of Errors and Displaying appropriate messages
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Enter Numbers only in Vehicle ID & Price!!"); 
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(f,"ERROR!!Re-enter the values again!!"); 
            }
        }
        if(e.getSource() == Auto_Display)
        {
            for(Vehicle x:Vehicle)
            {
                if(x instanceof AutoRickshaw == true)
                {
                    AutoRickshaw auto = (AutoRickshaw)x;
                    auto.display(); 
                }
            }
        }
        if(e.getSource() == Scooter_Display)
        {
            for(Vehicle x:Vehicle)
            {
                if(x instanceof ElectricScooter == true)
                {
                    ElectricScooter scooter = (ElectricScooter)x;
                    scooter.display(); 
                }
            }
        }  
        if(e.getSource() == Elec)
        {
            RP1.setVisible(false);
            RP2.setVisible(true);
            Auto_Clearer();
        }
        if(e.getSource() == Auto)
        {
            RP2.setVisible(false);
            RP1.setVisible(true);
            Scooter_Clearer();
        }
        if(e.getSource() == Auto_Clear )
        {
            Auto_Clearer();
        }
        if(e.getSource() == Scooter_Clear)
        {
            Scooter_Clearer();
        }
        if(e.getSource() == Exit)
        {
            System.exit(0);    
        }
    }
    
    //Creating a Main Method
    public static void main(String args[])
    {
        new TransportGUI();
    }
}