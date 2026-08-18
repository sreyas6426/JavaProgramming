import java.util.Scanner;
public class Largest 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=in.nextInt();
        System.out.println("Enter 2nd number:");
        int b=in.nextInt();
        System.out.println("Enter 3rd number:");
        int c=in.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(" 1st number is max");
        }
        else if(b>=a && b>=c )
        {
            System.out.println("2nd number is max");
        }
        else
        {
            System.out.println("3rd number is max");
        }

    }


}
