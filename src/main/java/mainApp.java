import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  Customer part1Customer = getCustomerData(scanner);
        Customer newCust = new Customer("Simon","ATU","3446","123",true);
       // PreferredCustomer no1Cust = new PreferredCustomer("John","UoG","554","100",true,500, 5);
        System.out.println(newCust);

        PreferredCustomer preferredCustomer2 = new PreferredCustomer();
        preferredCustomer2.setName("Simon");
        preferredCustomer2.setAddress("ATU");
        preferredCustomer2.setTelephone("555123");
        preferredCustomer2.setCustomerID("1001");
        preferredCustomer2.setMailingList(true);
        preferredCustomer2.setLoyaltyPoints(200);
        System.out.println(preferredCustomer2);
        //adding and removing points to show dynamic ajusting of discount level
        preferredCustomer2.setLoyaltyPoints(700);
        System.out.println(preferredCustomer2.getDiscount());
        preferredCustomer2.setLoyaltyPoints(200);
        System.out.println(preferredCustomer2.getDiscount());
        preferredCustomer2.setLoyaltyPoints(-500);
        System.out.println(preferredCustomer2.getDiscount());
        preferredCustomer2.setLoyaltyPoints(2000);
        System.out.println(preferredCustomer2.getDiscount());

    }
        //Hardcoding instead
   /* public static Customer getCustomerData(Scanner scanner){
        System.out.println("Enter Customer ID");
        String customerID = scanner.nextInt();
        System.out.println("Enter Customer Name");
        String name = scanner.nextLine();
        System.out.println("Enter Customer address");
        String address = scanner.next();
        System.out.println("Enter Customer Telephone");
        String telephone = scanner.nextLine();
        System.out.println("Mailing List? true/false");
        boolean mailingList = scanner.nextBoolean();


       // return new Customer(customerID,name,address,telephone,mailingList);
    }*/

}


