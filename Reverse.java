import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int rev=0;
        System.out.println("Enter a number");
        int num=in.nextInt();
        while(num!=0)
            {
                int dig=num%10;
                rev=rev * 10 +dig;
                num=num/10;
            } 
            System.out.println("Number is:"+rev);

    }    
}
