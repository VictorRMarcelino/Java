package marketSystem;

public class Product {
    String name;
    double price, kilo, quantity, finalPrice;


    public String showFinalInformations(){
        return name;
    }
    public void calcFinalPriceWithQuantity(){
        finalPrice = price * quantity;
    }
    public void calcFinalPriceWithKilo(){
        finalPrice = price * kilo;
    }
}
