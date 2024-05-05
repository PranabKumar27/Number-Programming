import java.util.Scanner;

public class key1
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=obj.nextInt();


        int rev=0;
        while(num>0)
        {
            rev=(rev*10)+num%10;
            num=num/10;
        }
        int temp=rev;

        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int key=obj1.nextInt();

        int length=0;
        while(rev>0)
        {
            length++;
            rev=rev/10;
        }
        int r=length-key;
        System.out.println(r);
        int p=(int)Math.pow(10,r);
        System.out.println(p);
        int res=temp/p;
        System.out.println(res);
    }
}
