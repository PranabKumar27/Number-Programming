import java.util.Scanner;
public class happy
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=obj.nextInt();
        Happy(num);

    }
    static void Happy(int num)
    {
        int sum=0;

        while(num>0)
        {
            sum=sum+(int)Math.pow(num%10,2);
            num=num/10;
        }
        if (sum==1) System.out.println("It is a happy Number");
        else if(sum>10)
        System.out.println("It is not a happy Number");
        else Happy(sum);
    }
}
