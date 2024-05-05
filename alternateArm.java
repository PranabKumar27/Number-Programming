public class alternateArm {

    public static void main(String[] args) {
        int start = 100; // Starting number of the range
        int end = 1000;  // Ending number of the range

        System.out.println("Alternate Armstrong numbers in the range " + start + " to " + end + ":");
        printAlternateArmstrongNumbersInRange(start, end);
    }

    static void printAlternateArmstrongNumbersInRange(int start, int end) {
        boolean alternate = true;

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i) && alternate) {
                System.out.print(i + " ");
                alternate = false;
            }
        }
    }

    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int)Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    static int countDigits(int number) {
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}