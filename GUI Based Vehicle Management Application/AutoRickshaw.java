
/**
 * Write a description of class AutoRickshaw here.
 *
 * @author (np01cp4s220066 Aayush Man Tuladhar)
 * @version (1.0)
 */
public class AutoRickshaw extends Vehicle //Creating a subclass AutoRickshaw
{
    //Creating attributes of AutoRickshaw
    private int EngineDisplacement;
    private String Torque;
    private int NumberofSeats;
    private int FuelTankCapacity;
    private String GroundClearance;
    private int ChargeAmount;
    private String BookedDate;
    private boolean isBooked;
    
    //Creating constructor for the some of the attributes above.
    public AutoRickshaw(int VehicleID ,String VehicleName ,String VehicleColor,String VehicleSpeed, String VehicleWeight,int EngineDisplacement,String Torque, int FuelTankCapacity, String GroundClearance){
        super(VehicleID,VehicleName,VehicleColor,VehicleWeight);//Calling the attributes from the superclass
        super.setVehicleColor(VehicleColor);
        super.setVehicleSpeed(VehicleSpeed);
        this.EngineDisplacement = EngineDisplacement;
        this.Torque = Torque;
        this.FuelTankCapacity = FuelTankCapacity;
        this.GroundClearance = GroundClearance;
    }
    
    //Creating accessor method of all attributes
    public int getEngineDisplacement() {
        return EngineDisplacement;
    }
        public String getTorque() {
        return Torque;
    }
        public int getNumberofSeats() {
        return NumberofSeats;
    }
        public int getFuelTankCapacity() {
        return FuelTankCapacity;
    }
        public String getGroundClearance() {
        return GroundClearance;
    }
        public int getChargeAmount() {
        return ChargeAmount;
    }
        public String getBookedDate() {
        return BookedDate;
    }
        public boolean getisBooked() {
        return isBooked;
    }
    
    //Creating mutator method for ChargeAmoount and the NumberofSeats
    public void setChargeAmount(int newCharge){
        ChargeAmount = newCharge;
    }
    public void setNumberofSeats(int newNumberofSeats){
        NumberofSeats = newNumberofSeats;
    }
    
    //Creating a method that allows an auto rickshaw to be booked
    public void Book(String BookedDate, int newCharge, int newNumberofSeats){
        this.BookedDate = BookedDate;
        NumberofSeats = newNumberofSeats;
        ChargeAmount = newCharge;
        //Logic for booking a Autorickshaw
        if(BookedDate == ""){
            isBooked = false;
        }
        else{
            isBooked = true;
        }
        
    }
    
    //Creating a method to display the collected data in more linear format with the correct annotations
    public void display(){
       super.display(); //calling display method from superclass
       System.out.println("Engine Displacement:"+EngineDisplacement);
       System.out.println("Torque:"+Torque);
       System.out.println("Fuel Tank Capacity:"+FuelTankCapacity+"liter");
       System.out.println("Ground Clearance:"+GroundClearance);
       //Logic for printing the display
       if(NumberofSeats == 0){
           System.out.println("Number of Seats:");
       }
       else{
           System.out.println("Number of Seats:"+NumberofSeats);
       }
       if(ChargeAmount == 0){
           System.out.println("Charge Amount:");
       }
       else{
           System.out.println("Charge Amount: Rs"+ChargeAmount);
       }
       if(BookedDate == ""){
           System.out.println("Booked Date:");
       }
       else{
           System.out.println("Booked Date:"+BookedDate);
       }
       if(isBooked == false){
           System.out.println("**This Rickshaw has not been Booked.**");
       }
       else{
           System.out.println("**This Rickshaw " + getVehicleName() + " is Booked.**");
       }
    }
}
