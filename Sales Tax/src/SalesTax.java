public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {

        //Declare and initialize variables
        double price = 9.99;
        int quantity = 6;
        double _tax = 7;  //.07
        final  double TAX = _tax/100.0;


        //calculations
        double subTotal = price * quantity;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;

        System.out.println("you bought " + quantity + " shirts for " + price + " per shirt.");
        System.out.println("subtotal: "+ subTotal);
        System.out.println("tax: " + taxTotal);
        System.out.println("Total: " + totalCost);

        //DISCOUNT AND INCREASES

        //FORMULA: amount * (1 +/- percentage) = total

    }




}
