
/**
 * Write a description of class ElectricScooter here.
 *
 * @author (np01cp4s220066 Aayush Man Tuladhar)
 * @version (1.0)
 */
public class ElectricScooter extends Vehicle//Creating a subclass ElectricScooter
{
    //Creating attributes of Electric Scooter
    private int Range;
    private int BatteryCapacity;
    private int Price;
    private String ChargingTime;
    private String Brand;
    private String Mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    //Creating constructor for the some of the attributes above.
    public ElectricScooter(int VehicleID ,String VehicleName ,String VehicleColor,String VehicleSpeed, String VehicleWeight,int BatteryCapacity){
        super(VehicleID ,VehicleName ,VehicleColor,VehicleWeight);//Calling the attributes from the superclass
        super.setVehicleColor(VehicleColor);
        super.setVehicleSpeed(VehicleSpeed);
        this.BatteryCapacity = BatteryCapacity;
    }
    
    //Creating accessor method of all attributes
    public int getRange() {
        return Range;
    }
        public int getBatteryCapacity() {
        return BatteryCapacity;
    }
        public int getPrice() {
        return Price;
    }
        public String getChargingTime() {
        return ChargingTime;
    }
        public String getBrand() {
        return Brand;
    }
        public String getMileage() {
        return Mileage;
    }
        public boolean gethasPurchased() {
        return hasPurchased;
    }
        public boolean gethasSold() {
        return hasSold;
    }
    
    //Creating a mutator method that sets value only if the vehicle has not been purchased
    public void setBrand(String newBrand){
        Brand = newBrand;
        /**if the scooter is already purchased it displays the message of,
         * "Already Purchased. Brand can't Be changed**"
         */
        if(hasPurchased == false){
            Brand = newBrand;
        }
        else{
            System.out.println("**Already Purschased. Brand can't Be changed**");
        }
    }
    
    //Creating a method that allows a vehicle to be purchased.
    public void Purchase(String Brand, int Price,String ChargingTime,String Mileage,int Range){
        this.Brand = Brand;
        this.Price = Price;
        this.ChargingTime = ChargingTime;
        this.Mileage = Mileage;
        this.Range = Range;
        //logic for purchasing the electric scooter
        if (Brand == ""){
            hasPurchased = false;
        }
        else{
            hasPurchased = true;
        }
    }
    
    //Creating a method that allows a verhilce to be sold only if it has already been purchased.
    public void sell(int newPrice){
        Price = newPrice;//assigning the value of price to new price
        if(newPrice == 0){
            hasSold = false;
        }
        //Sets the value of the attributes  If the above condition is not fulfilled
        else{
            hasSold = true;
            hasPurchased = false;
            Brand = "";
            Price = 0;
            ChargingTime = "";
            Mileage = "";
            Range = 0;
        }
        //the logic for changing the value of hasSold
        if(hasSold == true){
            hasPurchased = false;
        }
        else{
            hasPurchased = true;
        }
    }
    
    //Creating a method to display the collected data in more linear format with the correct annotations
        public void display(){
        super.display();//Calling the display method from the superclass
        System.out.println("Battery Capacity:"+BatteryCapacity);
        System.out.println("Brand:"+Brand);
        System.out.println("Price:"+Price);
        System.out.println("Charging Time:"+ChargingTime);
        System.out.println("Mileage:"+Mileage);
        System.out.println("Range:"+Range);
        //prints if the scooter has been purchased or not
        if(hasPurchased == true){
            System.out.println("**The Scooter has been purchased**");
        }
        else{
            System.out.println("**The Scooter has not been Purchased**");
        }
        //prints if the scooter has been sold or not
        if(hasPurchased == true){
            System.out.println("**Sold Out**");
        }
        else{
            System.out.println("**For Sale**");
        }
    }
}
