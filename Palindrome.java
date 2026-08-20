import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int rev=0;
        System.out.println("Enter a number");
        int num=in.nextInt();
        int n=num;
        while(num!=0)
            {
                int dig=num%10;
                rev=rev * 10 +dig;
                num=num/10;
            } 
            if(rev==num)
            {

            }
            if(rev==n)
            {
                System.out.println("Number is palindrome");
            }
            else
            {
                System.out.println("Not a palindrome");
            }
    }    
}
