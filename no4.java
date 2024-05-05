import java.util.Scanner;

public class no4
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>n-i;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
