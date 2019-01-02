public class RentalCar {

    public String manufacturer;

    private String model;

    private String bodyType;

    private String registrationNumber;

    private double price;

    private Boolean borrowed = false;

    //1. Constructor. Should take in 6 variables to set the 6 attributes
    public RentalCar(String manufacturer, String model, String bodyType, String registrationNumber, Double price, boolean borrowed){
        this.manufacturer= manufacturer;
        this.model = model;
        this.bodyType=bodyType;
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.borrowed = borrowed;
    }
    //2.Constructor: manufacturer, model, bodytype, regnumber, price
    public RentalCar(String manufacturer, String model, String bodyType, String registrationNumber, Double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.price = price;
    }
    //3.Constructor: manufacturer, model, bodytype
    public RentalCar(String manufacturer, String model, String bodyType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.bodyType = bodyType;
    }
    //If the current status of borrowed is false set it to
    //true; otherwise print an error message to state
    //that the RentalCar is on loan
    public void borrow(){
        if(!this.borrowed){
            this.borrowed = true;
            System.out.println("Success. The car status has been changed to borrowed: " + this.model+" "+this.borrowed);

        }
        else System.out.println("Error. This car has been borrowed already. ");
    }
    //Set the status of borrowed to false
    public void returnRentalCar(){
        if(this.borrowed){
            this.borrowed = false;
            System.out.println("Success. The car status has been changed to borrowed: " + this.model+" "+this.borrowed);
        }
        else System.out.println("Error. This car isn't borrowed.");

    }
    //Change the current price to the newly specified
    //price
    public void changePrice(double price){
        this.price = price;
        System.out.println("Success. The price has been changed to " + this.price);
    }
    //Return the current cost of renting the RentalCar
    public double checkPrice(){
        return this.price;
    }
    //Return the current status of borrowed (attribute from part 1)
    public boolean checkBorrowed(){
        return this.borrowed;
    }
    //Prints out the 6 attributes from part 1 in an
    //aesthetically pleasing manner. Print a header line
    //(for example a line of asterisks) and then specify
    //what each attribute is (e.g. manufacturer: Toyota)
    //on a separate line, finish the display method with a
    //blank line.
    //1st. print stars:
    private static void printStars(int noStars) {
        int k = 1;
        while (k < noStars) {
            System.out.print("*");
            k++;
        }
    }
    public void display(){
        printStars(35);
        System.out.println();
        System.out.println("Here is the main info about car:");
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Model: " + this.model);
        System.out.println("Body type:" + this.bodyType);
        System.out.println("Registration Number:" + this.registrationNumber);
        System.out.println("Price: " + this.price);
        System.out.println("Borrowed: "+ this.borrowed);
    }

}

