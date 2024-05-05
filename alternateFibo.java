import java.util.Scanner;

public class alternateFibo
{

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int range=sc.nextInt();

            System.out.println("Alternate Fibonacci Series:");
            printAlternateFibonacci(range);
        }

        static void printAlternateFibonacci(int n)
        {
          int a=0,b=1;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(a + " ");
                    a = a + b;
                } else {
                    System.out.print(b + " ");
                    b = b + a;
                }
            }
        }

}
