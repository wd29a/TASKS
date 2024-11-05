import java.util.ArrayList;
import java.util.Scanner;

public class PricesList {
    public static void main(String[] args) {
        double prices_c_style[] = {10.99, 15.49, 7.25, 23.99, 5.99, 12.50, 18.75, 30.00, 22.90, 8.80};
        ArrayList<Double> prices = new ArrayList<>();
        for (int i = 0; i < prices.size(); i++) {
            prices.add(prices_c_style[i]);
        }
        System.out.println(prices);

        double enter_price;
        System.out.println("Enter Enter Price");
        Scanner sc = new Scanner(System.in);
        enter_price = sc.nextDouble();
        prices.add(enter_price);
        System.out.println(prices);
        //////////////////////////////////

        double delete_price;
        System.out.println("Enter Delete Price");
        delete_price = sc.nextDouble();
        if(prices.contains(delete_price)) {
            prices.remove(delete_price);
        }else{
            System.out.println("Price not found");
        }
        System.out.println(prices);
        ///////////////////////////////////
        double average_price;
        double total_price = 0;
        for (int i = 0; i < prices.size(); i++) {
            total_price = total_price  + prices.get(i);
        }
        average_price = total_price / prices.size();
        System.out.println("Avarage price: " + average_price);
        ////////////////////////////////////////

    }
}
