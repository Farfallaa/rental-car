public class RentalCarTest {
    public static void main(String[] args) {
        //create new objects
        RentalCar audi = new RentalCar("Audi", "A6", "hechback", "IE184567", 145.00, false);
        RentalCar passat = new RentalCar("Wolkswagen", "passat", "estate", "IE878798", 110.00, false);
        //test borrow()
        audi.borrow();
        passat.borrow();
        //test return()
        audi.returnRentalCar();
        //test changePrice()
        passat.changePrice(99);
        //test checkPrice, checkBorrowed
        System.out.println("Audi rental price is " + audi.checkPrice() + " and borrowed status is set to " + audi.checkBorrowed());
        //test display:
        audi.display();

        //manufacturer, model, bodytype, regnumber, price
        RentalCar audi2 = new RentalCar("Audi", "A6","Universal", "IE234556", 155.00);

        //manufacturer, model, bodytype
        RentalCar golf = new RentalCar("Wolkswagen", "golf", "hetchback");
        System.out.println("testing GOLF AND AUDI");
        //test audi:
        audi2.display();
        //test golf:
        golf.display();

    }
}



