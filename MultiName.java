import java.util.Scanner;
public class MultiName 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String [] name= new String[5];
        System.out.println("Enter 5 names:");
        for(int i=0;i<5;i++)
        {
            name[i]=in.nextLine();

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }
    }

}
