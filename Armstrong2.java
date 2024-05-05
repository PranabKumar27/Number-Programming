import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=obj.nextInt();

        int temp=num;
        int length=0;
        while(num>0)
        {
            length++;
            num=num/10;
        }

         num=temp;

        int power=1;
        int sum=0;
        for(int i = 1; i<=length; i++)
        {
            power=power*(num%10);

        }
        sum=sum+power;
        num=num/10;

        if(sum==temp) System.out.println("Armstrong Number ");
        else System.out.println("Not a Armstrong Number");


    }
}
