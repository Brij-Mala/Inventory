import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Inven inven = new Inven();
        System.out.println("Welcome to the Inventory Management System");
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("How may I help you?\n1. Add new Item \n2.Remove items from inventory\n3.View all the items in the inventory\n4.Set Minimum Stock\n 5.Update item Quantities\n6.Exit");

            int n = sc.nextInt();
            switch (n){
                case 1 :
                    inven.additem();
                    break;
                case 2 :
                    inven.removeitem();
                    break;
                case 3 :
                    inven.viewitems(); break;
                case 4 :
                    inven.setminstock(); break;
                case 5 :
                    inven.updatequantity(); break;
                case 6 :
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please provide valid input");
            }
        }
    }
}