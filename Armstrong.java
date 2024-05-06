import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number to check a number is Armstrong or not:");
        int num=obj.nextInt();
        int temp=num;//storing the number into a "temp" variable for backup.
        int length=0//Intiallizing the "length" value as a zero.
        while(num>0)
        {
            length++;
            num=num/10;
        }//after executing while loop the "num" variable will be 0 & "length" variable store the length of the number.
        num=temp;// "temp" variable is assigning to the "num" variable.

        int sum=0;

        while(num>0)
        {
            int power=1;
            int digit=num%10;
           for(int i=1;i<=length;i++)
           {
               power=power*digit;
           }
           sum=sum+power;
           num=num/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+ " is a Armstrong Number");
        }
        else System.out.println(temp+" is not Armstrong Number.");

    }
}
