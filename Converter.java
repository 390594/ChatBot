import java.util.Scanner; //import Scanner Class
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        System.out.println("Enter amount in USD: ");
        int input = scanner.nextInt();
        System.out.println("Enter currency type: ");
        String currency = string.nextLine();
        if (currency.equals("GBP")) {
            System.out.println(input + " USD is " + (input * .80) + " pound.");

        }
        else if (currency.equals("EUR")){
            System.out.println(input + " USD is " + (input * .91) + " euro.");

        }
        else if (currency.equals("SAR")){
            System.out.println(input + " USD is " + (input * 3.75) + " riyal.");
        }
        else if (currency.equals("JPY")){
            System.out.println(input + " USD is " + (input * 137.53) + " yen.");

        }
        else {
            System.out.println(" please enter a valid currency ") ;

        }
    }
}
