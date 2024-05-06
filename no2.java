public class no1
{
    public static void main(String[] args)
    {
        int num=1245;
        int s=sum(num);
        System.out.println(s);
    }

    static int sum(int n)
    {
        if(n<=9) return n;
        return (n%10)+sum(n/10);
    }
}
