import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number not prime");
        }
    }
}
