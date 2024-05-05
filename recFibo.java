public class recFibo
{


        public static void main(String[] args) {
            int n = 2; // You can change this to generate a different number of terms in the series

            System.out.println("Fibonacci Series:");
            for (int i = 0; i <n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

}
