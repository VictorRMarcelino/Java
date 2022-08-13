package marketSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class systemMarket {
    static Scanner sc = new Scanner(System.in);
    static Product product = new Product();
    static double finalPrice;
    static List<String> productsNameList = new ArrayList<String>();
    static List<Double> productsPriceList = new ArrayList<Double>();
    static List<Double> productsQuantityList = new ArrayList<Double>();
    static List<Double> productsKiloList = new ArrayList<Double>();
    public static void main(String[] args) {
        askEnterNewItem();
    }
    public static void askEnterNewItem(){
        System.out.println("Do you want to add a new item in your list? (y/n)");
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
        System.out.println("The product you want to add is priced by quantity or kilo? (quantity/kilo)");
        String answer;
        answer = sc.nextLine();
        switch (answer){
            case "quantity" ->{
                enterTheQuantityOfTheProduct();
                break;
            }
            case "kilo" ->{
                enterTheKiloOfTheProduct();
                break;
            }
            default ->{
                selectBetweenQuantityOrKilo();
                break;
            }
        }
    }
    public static void enterTheQuantityOfTheProduct(){
        System.out.println("Insert the quantity of the product");
        double productQuantity;
        productQuantity = sc.nextDouble();
        product.quantity = productQuantity;
        product.calcFinalPriceWithQuantity();
        confirmInsert();
    }
    public static void enterTheKiloOfTheProduct(){
        System.out.println("Insert the quantity of the product");
        double productKilo;
        productKilo = sc.nextDouble();
        product.kilo = productKilo;
        product.calcFinalPriceWithKilo();
        confirmInsert();
    }
    public static void confirmInsert(){
        product.showFinalInformations();
        System.out.println("Do you want to add these informations to the list?");
        String answer;
        answer = sc.nextLine();
        switch (answer){
            case "y" ->{
                insertTheInformationsInTheList();
            }
            case "n" ->{
                askEnterNewItem();
            }
            default ->{
                confirmInsert();
            }
        }
    }
    public static void insertTheInformationsInTheList(){
        productsNameList.add(product.name);
        productsPriceList.add(product.price);
        productsQuantityList.add(product.quantity);
        productsKiloList.add(product.kilo);
    }
    public static void showFinalList(){
        for (int i = 0; i < productsNameList.size(); i++){
            System.out.print(productsNameList.get(i));
        }
    }
}
