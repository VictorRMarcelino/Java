package marketSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class systemMarket {
    static Scanner sc = new Scanner(System.in);
    static Product product = new Product();
    static int finalPrice;
    static List<String> productsNameList = new ArrayList<String>();
    static List<String> productsPriceList = new ArrayList<String>();
    static List<String> productsQuantityList = new ArrayList<String>();
    static List<String> productsKiloList = new ArrayList<String>();
    public static void main(String[] args) {
        askEnterNewItem();
    }
    public static void askEnterNewItem(){
        System.out.println("Do you want to add a new item in your list?");
        String answer;
        answer = sc.nextLine();
        switch (answer){
            case "y" ->{
                enterTheNameOfTheProduct();
            }
            case "n" ->{
                showFinalList();
            }
        }
    }
    public static void enterTheNameOfTheProduct(){
        System.out.println("Insert the name of the product");
        String productName;
        productName = sc.nextLine();
        product.name = productName;
        productsNameList.add(product.name);
        enterThePriceOfTheProduct();
    }
    public static void enterThePriceOfTheProduct(){
        System.out.println("Insert the price of the product");
        double productPrice;
        productPrice = sc.nextDouble();
        product.price = productPrice;
        selectBetweenQuantityOrKilo();
    }
    public static void selectBetweenQuantityOrKilo(){
        System.out.println("The product you want to add is priced by quantity or kilo?");
        String answer;
        answer = sc.nextLine();
        switch (answer){
            case "quantity" ->{
                enterTheQuantityOfTheProduct();
            }
            case "n" ->{
                enterTheKiloOfTheProduct();
            }
        }
    }
    public static void enterTheQuantityOfTheProduct(){
        System.out.println("Insert the quantity of the product");
        double productQuantity;
        productQuantity = sc.nextDouble();
        product.quantity = productQuantity;
    }
    public static void enterTheKiloOfTheProduct(){
        System.out.println("Insert the quantity of the product");
        double productKilo;
        productKilo = sc.nextDouble();
        product.kilo = productKilo;
    }
    public static void calcFinalPriceWithQuantity(){
        finalPrice = product.price * product.quantity;
    }
    public static void showFinalList(){

    }
}
