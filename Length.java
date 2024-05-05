import java.util.Scanner;

public class Length 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=obj.nextInt();
        
     long length=0l;
        while(num>0)
        {
            length++;
            num=num/10;
        }
        System.out.println(length);
    }
}
