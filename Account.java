import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bal = 0;

        System.out.println("Enter name:");
        String name = in.nextLine();

        int ch = 0;

        while (ch != 6) 
        {
            System.out.println("Enter 1 to deposit money, 2 to withdraw money, 3 to check balance, 4 to display account details, 5 to calculate interest or 6 to exit");

            ch = in.nextInt();

            switch (ch) 
            {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    int dep = in.nextInt();
                    bal = bal + dep;
                    System.out.println("Balance: " + bal);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int amt = in.nextInt();

                    if (amt <= bal) 
                    {
                        bal = bal - amt;
                        System.out.println("Balance: " + bal);
                    } 
                    else 
                    {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance is: " + bal);
                    break;

                case 4:
                    System.out.println("Name: " + name);
                    System.out.println("Account id: A1001");
                    System.out.println("Balance: " + bal);
                    break;

                case 5:
                    double interest = bal * 0.05;
                    System.out.println("Interest: " + interest);
                    break;

                case 6:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}