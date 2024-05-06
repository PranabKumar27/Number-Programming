public class SumOfDigitsOfAGivenNumberUsingMethod
{
    public static void main(String[] args)
    {
        int num=1245;
        //You can directly print the sum values.
        System.out.println(sum(num));//
        int s=sum(num);
        System.out.println(s);
    }

    static int sum(int n)
    {
        if(n<=9) return n;
        return (n%10)+sum(n/10);
    }
}
