
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        int i;
        Item items[] = new Item[5];
        int choice;

        Customer c = null;
        Scanner scr = new Scanner(System.in);

        items[0] = new Item("Pizza", 111, 900);
        items[1] = new Item("Pasta", 112, 500);
        items[2] = new Item("GarlicBread", 113, 600);
        items[3] = new Item("Burger", 114, 300);
        items[4] = new Item("FF", 115, 200);

        while (true) {

            System.out.println("1 for Login\n2 For Exit");
            int mainChoice = scr.nextInt();

            switch (mainChoice) {
                case 1:
                    System.out.println("Enter name and mobile num");
                    String n = scr.next();
                    String m = scr.next();

                    if (c == null) {
                        c = new Customer();
                        c.name = n;
                        c.mobileNum = m;
                    }

                    //menu 
                    menu:
                    while (true) {
                        System.out.println("1 For View ITEM\n2 For Place Order\n3 For View Cart\n4 For Checkout\n0 For Logout\nEnter your Choice :: ");

                        choice = scr.nextInt();

                        switch (choice) {
                            case 1:
                                for (Item o : items) {
                                    System.out.println(o.itemId + " " + o.name + " " + o.price);
                                }
                                break;
                            case 2:
                                System.out.println("Enter Item id");
                                int id = scr.nextInt(); //111
                                c.itemCode[c.itemCounter] = id;
                                c.itemCounter++;
                                break;
                            case 3:
                                for (Item o : items) {
                                    if (c.checkItem(o.itemId)) {
                                        System.out.println(o.itemId + " " + o.name + " " + o.price);
                                    }
                                }
                                break;    
                            case 0:
                                // System.exit(0);//static 
                                break menu;
                            default:
                                throw new AssertionError();
                        }
                    }//while menu 
                    break;
                case 2:
                    System.exit(0);
            }//login menu switch

        }//while login 

    }
}

class Customer {

    String name;
    String mobileNum;
    int itemCode[] = new int[5];
    int itemCounter = 0;

    boolean checkItem(int id) {
        for (int i = 0; i < itemCounter; i++) {
            if (itemCode[i] == id) {
                return true;
            }
        }

        return false;
    }

}

class Item {

    String name;
    int itemId;
    int price;

    public Item(String name, int itemId, int price) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
    }

}
