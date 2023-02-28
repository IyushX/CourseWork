
/**
 * Write a description of class Vehicle here.
 *
 * @author (np01cp4s220066 Aayush Man Tuladhar)
 * @version (1.0)
 */
public class Vehicle//Creating a superclass Vehicle
{
   //Creating attributes of the vehicle
   private int VehicleID;
   private String VehicleName;
   private String VehicleWeight;
   private String VehicleColor;
   private String VehicleSpeed;
   
   //Creating constructor 
   public Vehicle(int VehicleID ,String VehicleName ,String VehicleColor,String VehicleWeight){
       this.VehicleID = VehicleID;
       this.VehicleName = VehicleName;
       this.VehicleColor = VehicleColor;
       this.VehicleWeight = VehicleWeight;
   }
   //Creating mutator method for VehicleSpeed
   public void setVehicleSpeed(String newSpeed){
        VehicleSpeed = newSpeed;//
    }
   //Creating mutator method for VehicleColor
   public void setVehicleColor(String newColor){
        VehicleColor = newColor; //Assigning Vehiclecolor with newColor
    }
   
   //Creating accessor method for all the atrributes
   public int getVehicleID(){
        return VehicleID;
   }
   public String getVehicleName(){
        return VehicleName;                                                  
   }
   public String getVehicleWeight(){
        return VehicleWeight;                                                  
   }
   public String getVehicleColor(){
        return VehicleColor;                                                  
   }
   public String getVehicleSpeed(){
        return VehicleSpeed;                                                  
   }
   
   //Creating a method to display the collected data in more linear format with the correct annotations
   public void display(){
        System.out.println("==========Vehicle===========");
        if(VehicleID == 0){
            System.out.println("ID:  ");
        }
        else{
            System.out.println("ID:"+VehicleID);
        }        
        if(VehicleName == ""){
            System.out.println("Name:  ");
        }
        else{
            System.out.println("Name:"+VehicleName);
        }
        if(VehicleWeight == ""){
            System.out.println("Weight:  ");
        }
        else{
            System.out.println("Weight:"+VehicleWeight);
        }
        if(VehicleColor == ""){
            System.out.println("Color:  ");
        }
        else{
            System.out.println("Color:"+VehicleColor);
        }
        if(VehicleSpeed == ""){
            System.out.println("Speed:  ");
        }
        else{
            System.out.println("Speed:"+VehicleSpeed);
        }
    }
}
